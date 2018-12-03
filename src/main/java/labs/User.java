package labs;

import labs.Balance.Balance;
import labs.Cart.Cart;

public class User {

    public User(int id, Role role, Balance balance, Cart cart) {
        this.id = id;
        this.role = role;
        this.balance = balance;
        this.cart = cart;
    }

    public int id;

    protected Role role;

    protected Balance balance;

    protected Cart cart;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Integer getId() {
        return id;
    }

    //Роли пользователей
    public enum Role {
        //Неизвестный, гость
        Anon,
        //Пользователь
        User,
        //Администратор
        Admin,
        //Системный уровень
        Root
    }
}