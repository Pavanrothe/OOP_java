public class NoFormat{
public static void main(String args[])
{
String s="Pavanrothe";
try{
int a=Integer.parseInt(s);
System.out.println(a);
}
catch(Exception e)
{
System.out.println("we can not convert string or carrector into number");
}
}
}