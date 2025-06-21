import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n1 = input.nextInt();

        if (n1%2==0){
            System.out.println("The integer is an even number");
        }

        if (n1%2==1){
            System.out.println("The integer is an odd number");
        }
    }
}