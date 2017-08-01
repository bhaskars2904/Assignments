package Bhaskar.JavaAssignment2;

import java.util.ArrayList;
import java.lang.*;
import java.util.*;

class vampire{
    public ArrayList<Integer> breaknum(int num){
        int x;
        ArrayList<Integer> a=new ArrayList<Integer>();
        while(num!=0){
            x=num%10;
            num=num/10;
            a.add(x);
        }
        return a;
    }

    public static int numOfDigits(long i){
        int numOfDigits = 1;
        for(long j = 10;j<=i; j = j*10){
            numOfDigits = numOfDigits+1;
        }
        return numOfDigits;
    }
}
public class main {
    public static long power(int base, int exp){
        long ans = 1;
        while(exp > 0){
            ans = ans*base;
            exp--;
        }
        return ans;
    }
    public static void main(String[] args) {
        long p, q, r;
        int COUNT_LIMIT = 100;
        int count = 0;

        List<Long> vampireList = new ArrayList<Long>();

        for (p =1; count < COUNT_LIMIT; p++) {
            int digitOfP = vampire.numOfDigits(p);
            for (q =p; q < power(10,(digitOfP))&&count<COUNT_LIMIT; q++) {
                r = p * q;
                if(vampire.numOfDigits(r) != vampire.numOfDigits(p)*2 || (p%10 == 0 && q%10 == 0)){
                    continue;
                }
                vampire v = new vampire();
                ArrayList<Integer> x = v.breaknum((int) p);
                ArrayList<Integer> y = v.breaknum((int) q);
                ArrayList<Integer> z = v.breaknum((int) r);
                int i;
                ArrayList<Integer> cmbnd = new ArrayList<Integer>();
                cmbnd.addAll(x);
                cmbnd.addAll(y);
                Collections.sort(cmbnd);
                Collections.sort(z);
                boolean isVampire = true;
                for (i = 0; i < z.size(); i++) {
                    if (cmbnd.get(i) != z.get(i)){
                        isVampire = false;
                        break;
                    }
                }
                if (isVampire) {
                    if(!vampireList.contains(r)){
                        vampireList.add(r);
                        count++;
                    }
                }
            }
        }
        Collections.sort(vampireList);
        vampireList.forEach(n -> System.out.println(" n : "+n));
        System.out.println("count : "+count);
    }
}