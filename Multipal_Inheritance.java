//2nd use of interface i.e. multiple inheritace using interface
interface Father{
public void bringwater();
}

interface Mother{
public void bringwater();
}

class Son implements Father, Mother{
public void bringwater(){
System.out.println("Brought water for father and mother");
}
}
public class Multipal_Inheritance{
public static void main(String args[]){
Father f = new Son();
Mother m = new Son();
Son s = new Son();
f.bringwater();
m.bringwater();
s.bringwater();
}
}