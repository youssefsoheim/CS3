//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower de

import java.util.ArrayList;
import java.util.ListIterator;

public class List {
    public List() {
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        ListIterator iterator = words.listIterator();

        while(iterator.hasNext() && iterator.nextIndex() % 2 == 0) {
            String rep = (String)iterator.next();
            iterator.remove();
            iterator.next();
            iterator.add(rep);
        }

        System.out.println(words);
    }
}
