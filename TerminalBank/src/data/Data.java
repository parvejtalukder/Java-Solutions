package data;

public class Data {
    // items 
    private String account_holder;
    private double current_balance;
    private int account_number;
    private int debit_card_number;
    private String debit_card_expiry;

    // setters
    public void setAccountHolder(String value) {
        this.account_holder = value;
    }
    public void setAccoutBalance(int value) {
        this.current_balance = value;
    }
    public void setAccountNumber(int value) {
        this.account_number = value;
    }
    public void setDebitCard(int value) {
        this.debit_card_number = value;
    }
    public void setCardExpiry(String value) {
        this.debit_card_expiry = value;
    }

    // getters
    public String getAccountHolder() {
        return this.account_holder; 
    }
    public double getAccountBalance() {
        return this.current_balance; 
    }
    public int getAccountNumber() {
        return this.account_number;
    }
    public int getDebitCard() {
        return this.debit_card_number;
    }
    public String getDebitExp() {
        return this.debit_card_expiry;
    }
}
