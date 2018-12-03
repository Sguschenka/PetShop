package labs.Cart;

import labs.User;

import java.util.List;

public class Cart {
    private final User user;
    private final List<CartElement> elements;

    public Cart(User user, List<CartElement> elements) {
        this.user = user;
        this.elements = elements;
        if(this.elements == null)
            throw new NullPointerException("Поле elements должно быть проинициализировано!");
    }

    public User getUser() {
        return user;
    }

    public CartElement getElement(int id) {
        return elements.get(id);
    }

    public int getId() {

        return user.id;
    }

    public int getSize() {
        return elements.size();
    }
}
