package Bhaskar.assignment;

interface Cycles{
    void theCycle();
}

class Unicycles implements Cycles{
    public void theCycle(){
        System.out.println("Cycle factories produce Unicycles");
    }
    public void factoriesofUni(Cycles u){
        u.theCycle();
    }
}

class Bicycles implements Cycles{
    public void theCycle(){
        System.out.println("Cycle factories produce Bicycles");
    }
    public void factoriesofBi(Cycles b){
        b.theCycle();
    }
}

class Tricycles implements Cycles{
    public void theCycle(){
        System.out.println("Cycle factories produce Tricycles");
    }
    public void factoriesofTri(Cycles t){
        t.theCycle();
    }
}
public class CycleInterface {
    public static void main(String[] args) {
        Unicycles uni=new Unicycles();
        Bicycles bi=new Bicycles();
        Tricycles tri=new Tricycles();
        uni.factoriesofUni(uni);
        bi.factoriesofBi(bi);
        tri.factoriesofTri(tri);
    }
}
