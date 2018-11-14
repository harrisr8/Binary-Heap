import java.util.Random;

public class Assignment6 {
	public static void main(String[] args)
	{
		Random r = new Random();
		PriorityQueue pq = new PriorityQueue();
		
		int[] arr = new int[20];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr = pq.add(r.nextInt(1000), arr, i);		
			printTree(arr, i);
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = arr.length-1; i >= 0; i--)
		{
			pq.remove(arr, i);
			printTree(arr, i);
		}	
	}
	
	public static void printTree(int[] arr, int index)
	{
		double min = 0;
		double max = 0;
		int level = 0; 
		
		for(int i = 0; i <= index ; i++)// i is the level
		{
				if(i == 0)
				{
					min = 0;
					max = 0;
				}
				else if((i > 0) && (i < 5))
				{
					min = Math.pow(2, level);
					max = Math.pow(2, (level+1))-1;
				}
				else 
				{
					min = 16;
					max = 19;
				}
			
			for(double k = min; k <= max; k++)
			{
				System.out.print(arr[(int) k] + " ");
						
			}
			System.out.println();
			
			if(i == 0)
				level = 0;
			else if((i > 0)	&& (i < 5))		//at max 5 levels in tree, each level  has twice the previous level
				level = i;
			else
				break;
		}
		System.out.println();
	}
}
