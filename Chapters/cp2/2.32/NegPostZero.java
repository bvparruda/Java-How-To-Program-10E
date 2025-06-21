import java.util.Scanner;
public class NegPostZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negative = 0;
        int positive = 0;
        int nullNumber = 0;

        System.out.print("Enter the 1º integer: ");
        int n1 = input.nextInt();

        if (n1<0){
            negative = negative+1;
        }

        if (n1>0){
            positive = positive+1;
        }

        if (n1==0){
            nullNumber = nullNumber+1;
        }

        System.out.print("Enter the 2º integer: ");
        int n2 = input.nextInt();

        if (n2 <0){
            negative = negative+1;
        }

        if (n2 >0){
            positive = positive+1;
        }

        if (n2 ==0){
            nullNumber = nullNumber+1;
        }

        System.out.print("Enter the 3º integer: ");
        int n3 = input.nextInt();

        if (n3 <0){
            negative = negative+1;
        }

        if (n3 >0){
            positive = positive+1;
        }

        if (n3 ==0){
            nullNumber = nullNumber+1;
        }

        System.out.print("Enter the 4º integer: ");
        int n4 = input.nextInt();

        if (n4 <0){
            negative = negative+1;
        }

        if (n4 >0){
            positive = positive+1;
        }

        if (n4 ==0){
            nullNumber = nullNumber+1;
        }

        System.out.print("Enter the 4º integer: ");
        int n5 = input.nextInt();

        if (n5 <0){
            negative = negative+1;
        }

        if (n5 >0){
            positive = positive+1;
        }

        if (n5 ==0){
            nullNumber = nullNumber+1;
        }

        System.out.printf("%d is the integers positives %n", positive);
        System.out.printf("%d is the integers negative %n", negative);
        System.out.printf("%d is zero", nullNumber);
    }
}
