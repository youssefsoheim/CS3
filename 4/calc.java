import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		boolean bool = true;
		Scanner sc = new Scanner(System.in);
		while (bool == true) {
		System.out.println("please enter first argument");
		double arg1 = sc.nextDouble();
		System.out.println("please enter second argument");
		double arg2 = sc.nextDouble();
		System.out.println("please enter operation");
		String op = sc.next();
	
		if (op.equals("+")) {
			System.out.println(arg1+arg2);
			
		}
		else if (op.equals("-")) {
			System.out.println(arg1-arg2);
		}
		else if(op.equals("*")){
			System.out.println(arg1*arg2);
		}
		else if (op.equals("/")) {
			System.out.println(arg1/arg2);
		}
		 System.out.println("would you like to continue?");
		 String ans = sc.next();
		 if (ans.equals("yes")) {
			 bool = true;
		 }
		 else {
			 bool = false;
			 System.out.println("goodbye");
		 }
	}
	}

}
