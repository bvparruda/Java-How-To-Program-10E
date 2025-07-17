import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoiceClient = new Invoice ("1", "protoboard", 1, 8.50);
        Scanner input = new Scanner (System.in);

        System.out.print("Number of the product: ");
        String number = input.nextLine();
        invoiceClient.setNumber(number);

        System.out.print("Description of the product: ");
        String description = input.nextLine();
        invoiceClient.setDescription(description);

        System.out.print("Quantity: ");
        int quantity = input.nextInt();

        if (quantity<0){
            quantity=0;
        }

        invoiceClient.setQuantity(quantity);

        System.out.print("Price of product: $");
        double price = input.nextDouble();
        invoiceClient.setPrice(price);

        double invoice = 0;
        System.out.printf("The total amount on the invoice was $%.2f", invoiceClient.getInvoiceAmount(invoice, price, quantity));

    }
}
