import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int r = input.nextInt();

        //for float numbers, we use %, 2f(number of decimal places)
        System.out.printf("%d is the diameter %n%,.2f is the circuference " +
                "%n%,.2f is the area of the circle.", r*2, 2*Math.PI*r, Math.PI*r*r );
    }
}
