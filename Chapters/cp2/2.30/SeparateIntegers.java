//i won't use else, because we don't learned yet

import java.util.Scanner;
public class SeparateIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validNumber = true;

        System.out.print("Enter a number with 5 digits: ");
        int n = input.nextInt();

        if (n/10000>9 || n<9999){
            validNumber = false;
            System.out.println("The number you entered is not five digits");
        }

        if (validNumber){
            System.out.printf("%n%d   %d   %d   %d   %d", n/10000 % 10, n/1000 % 10, n/100 %10, n/10 %10, n/1%10);
        }


    }
}
