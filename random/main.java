
abstract class gfg{
abstract void printInfo();
}



 class employee extends gfg{
void printInfo(){
    System.out.println("hello");
}
 }

public class main{

    public static void main (String[] args){
        gfg s= new employee();
        s.printInfo();
    }



    
}
