
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkPrime(6);				
	}
	
	
	static void checkPrime(int number) {
    	int flag=0;
		int m=number/2;
	
		if(number==1||number==2) {
			System.out.println("Not a prime number");
		} else {
			for(int i=2;i<m;i++) {
				if(number%i==0) {
					System.out.println("Not a prime number");
					flag=1;
				}
			}
		} if(flag==0) {
			System.out.println("Prime no");
		}	
    }
}
