import java.util.Scanner;
class Sort
{
	int arr[]=new int [10];
	void inputData()
	{
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+i+"th number of the array :");
			arr[i]=obj.nextInt();
		}
	}
	//sort the array by using bubble sort.
	void arrange(int[] arr)
	{	
		int n=arr.length;
		boolean swap;
		for(int i=0;i<n-1;i++)
		{
			swap=false;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(!swap) break;
		}
	}
	
	void search(int[] arr)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the target element :");
		int target=obj.nextInt();
		int index=linearSearch(arr,target);
		if(index!=-1)
		{
			System.out.println("Element" +target+ " found at index :"+index);
		}
		else
			System.out.println("Element" +target+ " not found in the array.");
		
	}
	public static int linearSearch(int[] arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
}
class ArraySort
{
	public static void main(String []str)
	{
		Sort sort=new Sort();
		sort.inputData();
		sort.arrange(sort.arr);
		sort.search(sort.arr);
	}
}
