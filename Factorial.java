import java.util.Scanner;

public class Factorial {

    public int fact(int n) {
        int ans = 1;
        if (n >= 1) {
            ans = n * fact(n - 1);
        }
        return ans;
    }

    public static void main(String args[]) {
        Factorial f = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no:");
        int num = sc.nextInt();
        System.out.println("Factorial of a no is: " + f.fact(num));

    }
}

