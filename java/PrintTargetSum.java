
public class PrintTargetSum {

	public static void main(String[] args) {
	 int[] a = {1,2,7,3,9,6,1,8};
	 int target = 9;
	 printTargetSum(a,target);
	}
	static void printTargetSum(int[] a, int target) {
		
		int n = a.length;
		for(int i = 0;i<n;i++) {
			
			for(int j = i+1;j<n;j++) {
				if(a[i]+a[j] == target) {
					System.out.println("Target sum is " +a[i]+ " and "+a[j]+" index "+i+" "+j);
				}
			}
		}
	}
	
}
