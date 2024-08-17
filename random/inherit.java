
import random.*;

class base{


int x;
 
    // Constructor of super class
    base(int _x) { x = _x; }

    
 }
 class Derived extends base {
 
    int y;
 
    // Constructor of sub class
    Derived(int _x, int _y)
    {
 
        // super keyword refers to super class
        super(_x);
        y = _y;
    }
    void Display()
    {
        // Print statement
        System.out.println("x = " + x + ", y = " + y);
    }
}
 
 

public class inherit {
public static void main(String[] args){

Derived d= new Derived(10, 20);
d.Display();

}


    
}
    

