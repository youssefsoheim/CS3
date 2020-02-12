//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Linked {
    public Linked() {
    }

    public static void main(String[] args) {
        boolean bool = true;
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        System.out.println(list);

        while(bool) {
            System.out.println("enter number");
            int num = sc.nextInt();
            list.add(num);
            Collections.sort(list);
            System.out.println(list);
            System.out.println("do you wish to continue");
            String ans = sc.next();
            if (ans.equals("yes")) {
                bool = true;
            } else {
                bool = false;
            }
        }

    }
}
