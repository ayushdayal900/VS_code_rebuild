package Loops;
import java.util.*;

public class multiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Table of "+num+" is below.");
        for(int i=1; i<=10; i++)
        {
            System.out.println(num*i);
        }
        
        
    }
}
