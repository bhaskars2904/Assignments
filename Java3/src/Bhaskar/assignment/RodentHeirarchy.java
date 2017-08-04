package Bhaskar.assignment;

class Rodent{
    Rodent(){
        System.out.print("Rodent reference variable is pointing to ");
    }
    void eat(){
        System.out.println("Rodent eats");
    }
    void place(){
        System.out.println("Rodent lives");
    }
    void tail(){
        System.out.println("Rodent has tail");
    }
}
class Mouse extends Rodent{
    Mouse(){
        System.out.println(" Mouse class");
    }
    void eat(){
        System.out.println("Mouse eats");
    }
}
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println(" Gerbil class");
    }
    void place(){
        System.out.println("Gerbil lives");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println(" Hamster class");
    }
    void tail(){
        System.out.println("Hamster has tail");
    }
}
public class RodentHeirarchy {
    public static void main(String[] args){
        Rodent[] r=new Rodent[3];
        r[0]=new Mouse();   //While the reference variable of superclass points to objects of
        r[1]=new Gerbil();  //subclass, the default constructor of superclass object is being
        r[2]=new Hamster(); //called with each subclass' default constructors
//        Rodent m,g,h;
//        m=r[0];
//        g=r[1];
//        h=r[2];
        for(Rodent rodent:r){
            rodent.eat();
            rodent.tail();
            rodent.place();
            System.out.println("\n");
        }
//        m.eat();            //Base class methods as well as overridden methods being called
//        m.place();
//        m.tail();
//        g.place();
//        g.eat();
//        g.tail();
//        h.tail();
//        h.place();
//        h.eat();
    }
}
