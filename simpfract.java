package simpfract;

public class simpfract {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 50;
		int b = 250;
	
	// catch 0s
			if(a==0) {
				System.out.println("0");      
			}
				else if(b==0) {
					System.out.println("dont give me that");
				}
			if(a > b) {
				for(int x = 2; x <= a; x++) {
					if(a % x == 0 && b % x == 0) {
						a = a / x;
						b = b / x;
					    x = 1;
					}
				}
				System.out.println(a + "/" + b);
			}
			else {
				for(int y = 2; y <= b; y++) {
					if(a % y == 0 && b % y == 0) {
						a = a / y;
						b = b / y;
						y = 1;
					}
				}
				System.out.println(a + "/" + b);
			}
			
	}
}
