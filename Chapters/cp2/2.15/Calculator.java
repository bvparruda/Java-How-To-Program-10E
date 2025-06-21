import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1º integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter the 2º integer: ");
        int n2 = input.nextInt();

        int sum = n1+n2;
        int product = n1*n2;
        int difference = n1-n2;
        int quotient = n1/n2;
        boolean quotient0 = false;

        if (n1<n2){
            difference = n2-n1;
        }

        if (n1<n2){
            quotient = n2/n1;
        }

        if (n1==0){
            quotient0=true;
        }

        System.out.printf("The sum of integers is %d%n", sum);
        System.out.printf("The product of integers is %d%n", product);
        System.out.printf("The difference of integers is %d%n", difference);

        if (quotient0==true){
            System.out.println("Error: Cannot divide zero");
        }
        if (quotient0==false){
            System.out.printf("The quotient of integers is %d%n", quotient );
        }
    }
}