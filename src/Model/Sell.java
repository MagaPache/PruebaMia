package Model;

/**
 *
 * @author Maga
 */
public class Sell {
    
    private int product;
    private int amount;
    private boolean appliesDiscount;
    private int discount;

    public Sell(int product, int amount, boolean appliesDiscount, int discount) {
        this.product = product;
        this.amount = amount;
        this.appliesDiscount = appliesDiscount;
        this.discount = discount;
    }

    public Sell() {
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isAppliesDiscount() {
        return appliesDiscount;
    }

    public void setAppliesDiscount(boolean appliesDiscount) {
        this.appliesDiscount = appliesDiscount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    
    
}
