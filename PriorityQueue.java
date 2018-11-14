//Roneil Harris
//Date: 10/31/18
//Assignment #6

public class PriorityQueue {
	
	public int[] add(int priority, int[] arr, int index)
	{
			arr[index] = priority;
			//System.out.print(arr[index] + " ");
			
			int parentIdx = 0;
			
			if(index > 0)
			{				
				int hold;
				parentIdx = (index-1)/2;
				while(arr[index] > arr[parentIdx])
				{					
					hold = arr[index];
					arr[index] = arr[parentIdx];
					arr[parentIdx] = hold;
					
					index = parentIdx;
					parentIdx  = (index-1)/2;					
				}
			}		
			return arr;
	}
	
	public int[] remove(int[] arr, int i)
	{
		int rem = 0;
		int max = 0;
		int hold = 0;
		
			
			arr[0] = arr[i];		//arr[i] is the out of place element
		
			int left = 2*0 + 1;
			int right = 2*0 + 2;
			
			if(left > right)
				max = left;
			else
				max = right;
			
			int j = 0;
			while(arr[j] < arr[max])
			{
				hold = arr[j];
				arr[j] = arr[max];
				arr[max] = hold;
				
				j = max;
				
				//we don't have a child if equation results in number greater than array index
				left = 2*j + 1;
				if(left > arr.length)
					break;
				
				right = 2*j + 2;
				if(right > arr.length)
					break;
				
							
				if(left > right)
					 max = left;
				else if(right > left)
					max = right;
				else 
					max = left;  //if siblings are equal
			}
		
			arr[i] = 0;
			//for(int k = 0; k < arr.length; k++)
				//System.out.println("after remove " + arr[k]);
			
			//System.out.println();
		
		return arr;
	}	
}
