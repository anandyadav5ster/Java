public class MergeSortTest{


	public static void main(String[] args)
	{
		int[] a = {48,36,13,52,19,94,21};
		int n =a.length;
		sort(a,0,n-1);
		for( int x : a)
		{
			System.out.println(x);
		}
		
	}
	
	public static void sort(int[] a,int low,int high)
	{
		if(low<high)
		{
			int mid = (low+high)/2;
			sort(a,low,mid);
			sort(a,mid+1,high);
			mergeArray(a,low,mid,high);
			
		}
	}

	
	public static void mergeArray(int[] a,int low,int mid ,int high)
	{
		int i = low;
		int j = mid+1;
		int k= low;
		int[] temp = new int[a.length];
		while(i<=mid && j<=high)
		{
			if(a[i]<a[j])
			{
				temp[k] = a[i];
				i++;
				k++;	
			}
			else
			{
				temp[k] = a[j];
				j++;
				k++;
				
			}
		}
		while(i<=mid)
		{
			temp[k] = a[i];
			i++;
			k++;
		}
		while(j<=high)
		{
			temp[k] = a[j];
			j++;
			k++;
		}
		for(i=low;i<=high;i++)
		{
			a[i] = temp[i];
		}
	}
}