public class ArrayTest{

public static void main(String args[])
{
int arr[]={1,3,5,6,7};

System.out.println(arr[0]);
try{
System.out.println(arr[5]);
}
catch(Exception e)
{
System.out.println("value is out off bound"+e);
}

System.out.println(arr[3]);
}
}
