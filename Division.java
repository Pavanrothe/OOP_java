import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no: ");
        int a = sc.nextInt();
        System.out.println("Enter second no: ");
        int b = sc.nextInt();
        int div = a / b;
        System.out.println("Division of two numbers: " + div);

    }
}