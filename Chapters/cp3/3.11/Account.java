public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){

        this.name = name;

        if (balance>0){
            this.balance = balance;
        }
    }

    public void withdrawal(double withdraw){
        if (withdraw>0.0){
        balance = balance-withdraw;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}