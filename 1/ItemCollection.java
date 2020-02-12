import java.util.HashMap;

public class ItemCollection {

    private static HashMap<Integer, Item> coll = new HashMap<>();
    private int c2 = 0;

    public ItemCollection(){
        super();
        c2++;
    }
    public static void addStationaryItem(StationaryItem s_item){
        coll.put(s_item.getId(),s_item);
    }
    public static void addLabItem(LabItem l_item){
        coll.put(l_item.getId(),l_item);
    }

    public String toString(){
        if (coll.isEmpty()) {
            return "NO items are available";
        }
        else {
            String t = "";
            for (Integer key : coll.keySet()){
                t+=coll.get(key).toString()+"\n";
            }
            return t;
        }
    }


}