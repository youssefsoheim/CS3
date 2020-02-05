import java.util.ArrayList;
import java.util.Scanner;

public class calc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter string");
        String a = sc.next();
        System.out.println(a);
        String arg[]=a.split("[0-9]+");
        String op[]=a.split("[+*/-]");
     
        int ans = Integer.parseInt(op[0]);
        for(int i=1;i<op.length;i++){
            if(arg[i].equals("+")) {
                ans += Integer.parseInt(op[i]);
                }
            else if (arg[i].equals("-")) {
                ans -= Integer.parseInt(op[i]);
            }
            else if(arg[i].equals("*")) {
            	ans = ans *Integer.parseInt(op[i]);
            }
            else if (arg[i].equals("/")) {
            	ans = ans / Integer.parseInt(op[i]);
            }
        }
        System.out.println(ans);
	}
}
