//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Cal {
    public Cal() {
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> cal = new HashMap();
        boolean bool = true;

        while(bool) {
            System.out.println("do you wish to enter new date?");
            String ans = sc.next();
            if (ans.equals("yes")) {
                System.out.println("enter date");
                sc.nextLine();
                String input = sc.nextLine();
                Date date = sdf.parse(input);
                sdf = new SimpleDateFormat("dd-MM-yyyy");
                System.out.println("please enter event");
                String event = sc.nextLine();
                cal.put(event, sdf.format(date));
                System.out.println(cal);
                bool = true;
            } else {
                System.out.println("goodbye");
                bool = false;
            }
        }

    }
}
