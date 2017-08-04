package Bhaskar.assignment;

class Cycle{
    public void balance(){
        System.out.println("Cycle balanced");
    }
}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Unicycle balanced");
    }
}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("Bicycle balanced");
    }
}
class Tricycle extends Cycle{
    public void tricycle(){
        System.out.println("Tricycle not balanced");
    }
}

public class CycleHeirarchy {
    public static void main(String[] args) {
        Cycle[] cyc=new Cycle[3];
        cyc[0]=new Unicycle();
        cyc[1]=new Bicycle();
        cyc[2]=new Tricycle();
        for(Cycle c:cyc){       //balance method on being absent in tricycle is being called on cycle
        c.balance();
        }
        ((Unicycle)cyc[0]).balance();
        ((Bicycle)cyc[1]).balance();
        ((Tricycle)cyc[2]).balance();

    }
}
