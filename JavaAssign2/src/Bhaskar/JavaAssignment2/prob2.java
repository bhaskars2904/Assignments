package Bhaskar.JavaAssignment2;

class Overloaded{
    private int num;
    private String str;

    Overloaded(int num){
        this.num=num;
    }
    Overloaded(int num, String name){
        this(num);
        str=name;
        System.out.println("Roll no.: "+this.num+" , Name: "+this.str);
    }
}
public class prob2{
    public static void main(String[] args) {
      Overloaded o=new Overloaded(13199, "Bhaksar");
    }
}
