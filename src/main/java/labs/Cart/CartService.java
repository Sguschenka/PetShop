package labs.Cart;

import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class CartService {
    List<CartElement> cartL;
    private long index = 1;

    public CartService() {
        this.cartL = new LinkedList<>();
    }

    public List<CartElement> getCart() {
        return cartL;
    }

    public CartElement getCartElement(int id) {
        for(CartElement it : getCart())
            if(it.getId() == id)
                return it;
        return null;
    }

    public void addElement(CartElement input) {
        cartL.add(input);
    }

    public void putItem(int id, long personId) {
    //    addElement(new CartElement(index++, personId, id));
    }

    public void removeItem(int id) {
        Iterator<CartElement> iter = cartL.iterator();
        while (iter.hasNext()) {
            if(iter.next().getItem_id() == id){
                iter.remove();
                return;
            }
        }
    }

    public void removeItem() {
        cartL.clear();
    }
}