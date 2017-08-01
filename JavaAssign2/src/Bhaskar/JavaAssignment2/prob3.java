package Bhaskar.JavaAssignment2;

class Cnstrctr{
    String str;
    Cnstrctr(String str){
        this.str=str;
        System.out.println("String argument is "+str);
    }
}
public class prob3 {
    public static void main(String[] args) {
        Cnstrctr x=new Cnstrctr("Bhaskar");
        Cnstrctr[] a=new Cnstrctr[2];
    }
}
