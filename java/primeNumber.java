
public class primeNumber {

	public static void main(String[] args) {
		
		printPrimeNumber(5);
	}
	
	static void printPrimeNumber(int n){
	
		for(int i =2;i<=n;i++) {
			boolean status = true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j == 0) {
					status = false;
					break;
				}
			}
			if(status) {
				System.out.print(i+" ");
			}
		}
		
	}

}
