package serviceImpl;

import service.AccountService;

public class SpareAccountServiceImpl implements AccountService {

    private String type;
    private Double amount;

    public SpareAccountServiceImpl() {
        this.type = "AHORRO";
    }

    @Override
    public AccountService cloneObject() {
        SpareAccountServiceImpl account = null;
        try {
            account = (SpareAccountServiceImpl) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return account;
    }

    @Override
    public String toString() {
        return "SpareAccountServiceImpl{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

    /**Getter and Setter*/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
