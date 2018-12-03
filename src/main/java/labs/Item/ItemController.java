package labs.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ItemController {

    private final ItemService p;

    @Autowired
    public ItemController(ItemService p) {
        this.p = p;
    }

    @RequestMapping(value="items/pets", method = RequestMethod.GET)
    @ResponseBody
    public List<Item> getPets() {
        return p.getPets();
    }

    @RequestMapping(value="items/stuffs", method = RequestMethod.GET)
    @ResponseBody
    public List<Item> getStuffs(){
        return p.getStuffs();
    }

    @RequestMapping(value="items/pets/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Item getPets(@PathVariable int id) {
        return p.getPets(id);
    }

    @RequestMapping(value="items/stuffs/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Item getStuffs(@PathVariable int id) {
        return p.getStuffs(id);
    }

    @RequestMapping(value="items/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String removeItems(@PathVariable("id") int id) {
        Item item = p.getItems(id);
        boolean wasOK = p.removeItem(item);
        if (wasOK){
            return "redirect:items/";
        }
        return "items/error";
    }

    @RequestMapping(value="items", method = RequestMethod.PUT)
    @ResponseBody
    public boolean addItem(@PathVariable int id, Item elm) {
        return p.addItem(elm);
    }

    @RequestMapping(value="items", method = RequestMethod.GET)
    @ResponseBody
    public List<Item> getItems() {
        return p.getItems();
    }

    @RequestMapping(value="helloWorld", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        return "helloWorld";
    }
}