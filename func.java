
import java.util.*;
class func{

	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();sc.nextLine();
		int n2=sc.nextInt();sc.nextLine();

		System.out.println(addition(n1,n2));
		System.out.println(substraction(n1,n2));


		System.out.println(multiply(n1, n2));
		System.out.println(divide(n1, n2));

		System.out.println(co(num1));
		System.out.println(si(num1));

	}	

	public static int  addition(int n1,int n2){
		int add=n1+n2;
		return add;
	}

	public static int  substraction(int n1,int n2){
		int sub=(n1-n2)*(-1);
		return sub;
	}

	private static long multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	private static double divide(int num1, int num2) {
		return num1 / num2;
	}
	private static double co(int num1) {
		return (Math.cos(num1));
	}
	private static double si(int num1) {
		return Math.sin(num1);
	}

}
