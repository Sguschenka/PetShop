package labs.Balance;


import org.springframework.stereotype.Service;

@Service
public class BalanceService {
    Balance b;

    public BalanceService() {
        this.b = new Balance();
    }

    public long get() {
        return b.getPenny();
    }

    public void set(long l) {
        b.setPenny(l);
    }
}
