package labs.Cart;


public class CartElement {
    private Long id;
    private int item_id;

    public CartElement(Long id, int item_id) {
        this.id = id;
        this.item_id = item_id;
    }

    public Long getId() {
        return id;
    }

    public int getItem_id() {
        return item_id;
    }
}