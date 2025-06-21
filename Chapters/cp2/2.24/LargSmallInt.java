import java.util.Scanner;
public class LargSmallInt {
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

        System.out.print("Enter the 4º integer: ");
        int n4 = input.nextInt();

        if (n4<smallest){
            smallest=n4;
        }
        if (n4>biggest){
            biggest=n4;
        }

        System.out.print("Enter the 5º integer: ");
        int n5 = input.nextInt();

        if (n5<smallest){
            smallest=n5;
        }
        if (n5>biggest){
            biggest=n5;
        }

        System.out.printf("The largest integer is: %d%n", biggest);
        System.out.printf("The Smallest integer is: %d", smallest);

    }
}