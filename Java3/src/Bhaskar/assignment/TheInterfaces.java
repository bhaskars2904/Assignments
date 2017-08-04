package Bhaskar.assignment;

interface Pet{
    void isapet();
    void isnotapet();
}
interface Obedient{
    void isobedient();
    void isnotobedient();
}
interface Gender{
    void ismale();
    void isfemale();
}
interface GoodDog extends Pet, Obedient, Gender{
    void isgooddog();
}
class Animal{
    void anAnimal(){
        System.out.println("It is an animal");
    }
}
class Dog extends Animal implements GoodDog{
   public void isapet(){
    System.out.println("Dog is a good pet");
   }

    public void isnotapet() {
     System.out.println("Every animal is not a pet");
    }

    void petDog(Pet i){
    i.isapet();
    i.isnotapet();
   }

    public void isobedient() {
        System.out.println("Dogs are obedient");
    }

    public void isnotobedient() {
        System.out.println("Every animal is not obedient");
    }

    void obedientDog(Obedient j){
        j.isnotobedient();
        j.isobedient();
    }
    public void ismale() {
        System.out.println("Dog is male");
    }

    public void isfemale() {
        System.out.println("Dog is not female");
    }

    void genderofDog(Gender k){
        k.isfemale();
        k.ismale();
    }

    public void isgooddog() {
        System.out.println("Dog is good");
    }

    void howDog(GoodDog l){
        l.isgooddog();
    }
}
public class TheInterfaces {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.petDog(d);
        d.obedientDog(d);
        d.genderofDog(d);
        d.howDog(d);
    }
}
