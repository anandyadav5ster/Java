
public class factorial {

	public static void main(String[] args) {
		int n = 5;
		int result = findFactorial(n);
		System.out.println(result);

	}
	
	static int findFactorial(int n){
		if(n<0) {
			return -1;
		}
		int fact = 1;
		for(int i =1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
