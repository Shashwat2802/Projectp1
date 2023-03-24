import java.util.*;
class Solve{
    public static void main(String[] args) {
       int[] a1=new int[]{1,2,3,-2,-5,-6};
       int sum=0;
       for(int i=0;i<a1.length;i++){
        sum+=a1[i];
       }
       System.out.println("The sum is :" +sum);
    }
}