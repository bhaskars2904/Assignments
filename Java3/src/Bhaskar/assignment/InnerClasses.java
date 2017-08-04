package Bhaskar.assignment;

class OuterClass{
    void theouter(){
        System.out.println("First outer class");
    }
   static class InnerClass{
        InnerClass(int i){
            System.out.println("First inner class");
        }
   }
}
class AnotherOuterClass{
    void anotherouter(){
        System.out.println("Second outer class");
    }
    static class AnotherInnerClass extends OuterClass.InnerClass{
        AnotherInnerClass(int i){
            super(i);
           System.out.println("Extended inner class");
        }
    }
}
public class InnerClasses {
    public static void main(String[] args) {
        AnotherOuterClass.AnotherInnerClass x=new AnotherOuterClass.AnotherInnerClass(3);
    }
}
