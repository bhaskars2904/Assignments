package Bhaskar.JavaAssignment2;

class Constructor{
    String str;
    Constructor(String str){
        this.str=str;
        System.out.println("String argument is "+str);
    }
}
public class prob4 {
    public static void main(String[] args) {
        Constructor x=new Constructor("Bhaskar");
        Constructor a[]= new Constructor[2];
        Constructor y=new Constructor("Sharma");
        a[0]=x;
        a[1]=y;
    }
}

