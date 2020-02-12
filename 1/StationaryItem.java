public class StationaryItem extends Item{
    private int size;
    int c = 0;

    public StationaryItem(String name, int id, int size) {
        super(name, id);
        this.size = size;
        c++;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Stationary Item { " +
                " Name = "+ getName()+
                " ID = "+ getId()+
                " Size =" + size +
                '}';
    }
}
