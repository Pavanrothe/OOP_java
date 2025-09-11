//1st use of interface
interface Animal{
void voice();
}

class Elephent implements Animal{

public void voice(){
System.out.println("In voice of Elephent");
}
}

public class Interface{
public static void main(String args[]){

Elephent e= new Elephent();
e.voice();
}
}