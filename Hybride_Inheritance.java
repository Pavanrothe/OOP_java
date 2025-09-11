//Hybride Inheritance using interface
interface Father{
public void property();
}

interface Mother{
public void property();
}

class Son1 implements Father, Mother{
public void property(){
System.out.println("In property of Child class");
}
}

class XYZ extends Son1{

}

class PQR extends Son1{

}

public class  Hybride_Inheritance{
public static void main(String  args[]){
Father f = new Son1();
Mother m= new Son1();
Son1 s = new Son1();
XYZ x = new XYZ();
PQR p = new PQR();
s.property();
x.property();
p.property();
f.property();
m.property();

}
}