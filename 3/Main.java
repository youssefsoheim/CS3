public class Main {
    public static void main (String [] args){
        Stack<String> Joe = new Stack<>();
        Joe.insert(Joe, "abdo");
        Joe.insert(Joe, "gawesh");
        Joe.insert(Joe, "mohamed");
        Joe.printList(Joe);
        Joe.removeLastNode();
        Joe.insert(Joe, "Jesus");
        Joe.printList(Joe);
    }
}
