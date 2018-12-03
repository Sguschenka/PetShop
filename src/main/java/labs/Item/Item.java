package labs.Item;

public class Item {
    private int id;
    private String name;
    private Types type;
    private int count;
    private int cost;

    public Item(int id, String name, Types type, int count, int cost) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.count = count;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public int getCost() {
        return cost;
    }

    public enum Types {
        notSupprt,
        Pet,
        Stuff
    }
}
