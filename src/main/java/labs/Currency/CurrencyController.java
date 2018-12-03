package labs.Currency;

import labs.Balance.BalanceService;
import labs.Cart.CartElement;
import labs.Cart.CartService;
import labs.Item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CurrencyController {
    CurrencyService cs;
    BalanceService bs;
    CartService crs;
    ItemService is;

    @Autowired
    public CurrencyController(CurrencyService cs, BalanceService bs, CartService crs, ItemService is) {
        this.cs = cs;
        this.bs = bs;
        this.crs = crs;
        this.is = is;
    }

    @RequestMapping(value="currency/cart", method = RequestMethod.POST)
    @ResponseBody
    public boolean toPay(@RequestBody List<CartElement> ce) {
        return cs.toPay(bs, crs, is, 0);
    }
}
