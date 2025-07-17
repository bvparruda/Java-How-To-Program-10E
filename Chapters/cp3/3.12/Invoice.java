public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;

        if (quantity>0){
            this.quantity = quantity;
        }

        if (price>0.0){
            this.price = price;
        }
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }


    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount(double invoiceCalculate, double price, int quantity){
       invoiceCalculate = price * quantity;
       return invoiceCalculate;
    }
}