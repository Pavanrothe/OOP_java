import java.util.*;
public class Fact_recursion {
   public int recursion(int val)
    {
        int fact=1;
        if(val==0)
        {
           return fact;
        }
        else{
            fact=val * recursion(val-1);
        }return fact;
    }
    public static void main(String args[])
    {
        int n;
        Fact_recursion f=new Fact_recursion();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        int ans=f.recursion(n);
        System.out.println(ans);


    }
}
