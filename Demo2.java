import java.util.Scanner;

class PatternDiamond{
	
public void pattern(int n) {
		
		int l=1;
		int s=n-1;
		
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=s;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=l;j++) {
				if(j==1|| (j==l||i==n))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			
			System.out.println();
				l+=2;
				s--;
		}
		}
		
	}
	


class PatternX{
	public void pattern(int n) {
		
		int l=n;
		
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(j==i || j==l   ) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			l--;
			System.out.println();
				
		
		}
		
	}
	
	
}
public class Demo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		
		PatternX p1=new PatternX();
//		p1.pattern(n);
		
		PatternDiamond pd=new PatternDiamond();
		pd.pattern(n);
		
		
		
		

	}

}
