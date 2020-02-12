public class LabItem extends Item{
private int type;
private int c1 = 0;
    public LabItem(String name, int id, int type) {
        super(name, id);
        this.type = type;
        c1++;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Lab Item { " +
                " Name = "+ getName()+
                " ID = "+ getId()+
                " Type='" + type + '\'' +
                "}";
    }
}
