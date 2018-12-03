package labs.Currency;

import labs.Balance.BalanceService;
import labs.Cart.CartElement;
import labs.Cart.CartService;
import labs.Item.ItemService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    public boolean toPay(BalanceService balance, CartService cs, ItemService is, long person_id) {
        long sum = 0;
        for(CartElement cr : cs.getCart()) {
            sum += is.getItems(cr.getItem_id()).getCost();

        }
        if(balance.get() < sum)
            return false;
        balance.set(balance.get() - sum);
        cs.removeItem();
        return true;
    }
}
