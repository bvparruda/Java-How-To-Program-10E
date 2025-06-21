import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1º integer: ");
        int n1 = input.nextInt();
        int smallest = n1;
        int biggest = n1;

        System.out.print("Enter the 2º integer: ");
        int n2 = input.nextInt();

        if (n2<smallest){
            smallest=n2;
        }
        if (n2>biggest){
            biggest=n2;
        }

        System.out.print("Enter the 3º integer: ");
        int n3 = input.nextInt();

        if (n3<smallest){
            smallest=n3;
        }
        if (n3>biggest){
            biggest=n3;
        }

        int sum = n1+n2+n3;
        int product = n1*n2*n3;
        int average = sum/3;

        System.out.printf("%d is the sum %n", sum);
        System.out.printf("%d is the product %n", product);
        System.out.printf("%d is the average %n", average);
        System.out.printf("%d is the smallest %n", smallest);
        System.out.printf("%d is the biggest %n", biggest);
    }
}