package DuplicateArrPack;

public class DuplicateArrCla {

	public static void main(String[] args) {
		int i,j;
		int arr[] = new int[] {3,5,3,5,4};
		System.out.println("Duplicate Elements in Array are as Follows");
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]== arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
		

	}

	
}
