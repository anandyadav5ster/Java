package Practice1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
       
        ArrayList<Integer> a1 = new ArrayList<>();
       
       for(int i=0;i<7;i++)
       {
            System.out.println("Enter the value :");
            String x = sc.nextLine();
            a1.add(Integer.parseInt(x));
       }
       
           
    
         System.out.println(a1);
         ArrayList<Integer> positive = new ArrayList<>();
         ArrayList<Integer> negative = new ArrayList<>();
        for(int i :a1){
            if(i>0){
                positive.add(i);
            }
            else{
                negative.add(i);
            }
        }
        System.out.println(positive);
        System.out.println(negative);
    }
}
