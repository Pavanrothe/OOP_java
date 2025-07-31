import java.util.Scanner;

public class Gretest_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, greatest;

        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();

        greatest = a;

        if (b > greatest) {
            greatest = b;
        }

        if (c > greatest) {
            greatest = c;
        }

        System.out.println("The greatest number is: " + greatest);
    }
}
