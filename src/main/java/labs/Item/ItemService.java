package labs.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

import static labs.Item.Item.Types.Pet;
import static labs.Item.Item.Types.Stuff;


@Service
public class ItemService {
    List<Item> items;
/**
 *     private long id;
 *     private String name;
 *     private Types type;
 *     private long count;
 *     private long cost;
 */

    @Autowired
    public ItemService() {
        this.items = new LinkedList<Item>();

        this.items.add(new Item( 1, "Cat", Pet, 3, 300));
        this.items.add(new Item(2, "Dog", Pet, 2, 250));
        this.items.add(new Item(3, "Корм", Stuff, 15, 20));
    }

    public final List<Item> getItems() {
        return items;
    }

    public Item getItems(int id) {
        for(Item it : getItems())
            if(it.getId() == id)
                return it;
        return null;
    }

    public final List<Item> getItems(Item.Types type) {
        List<Item> out = new LinkedList<>();
        for(Item it : getItems())
            if(it.getType() == type)
                out.add(it);
        return out;
    }

    public Item getItems(int id, Item.Types type) {
        Item out = getItems(id);
        if(out == null) return null;
        if(out.getType().equals(type))
            return out;
        return null;
    }

    public final List<Item> getPets() {
        return getItems(Pet);
    }

    public final List<Item> getStuffs() {
        return getItems(Stuff);
    }

    public Item getPets(int id) {
        return getItems(id, Pet);
    }

    public Item getStuffs(int id) {
        return getItems(id, Stuff);
    }

    public boolean addItem(Item item) {
        if(getItems((int) item.getId()) != null) return false;
        return items.add(item);
    }

    public boolean removeItem(Item item) {
        if(items.remove(item)){
            return true;
        }

        return false; //items.removeIf((it) -> it.getId() == id);
    }
}