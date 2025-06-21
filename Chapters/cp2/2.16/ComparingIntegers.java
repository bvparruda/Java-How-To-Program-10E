import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1º integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter the 2º integer: ");
        int n2 = input.nextInt();

        if (n1>n2){
            System.out.printf("%d is larger than %d", n1, n2);
        }

        if (n2>n1){
            System.out.printf("%d is larger than %d", n2, n1);
        }

        if (n1==n2){
            System.out.println("These numbers are equal");
        }

    }
}