package labs.Balance;

public class Balance {

    public Balance() {
        this.penny = 0;
    }

    public Balance(long penny) {
        this.penny = penny;
    }


    //количество денег
    private long penny;

    public long getPenny() {
        return penny;
    }

    public void setPenny(long l) {
        penny = l;
    }
}
