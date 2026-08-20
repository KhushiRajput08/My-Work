import java.util.*;

public class AgeChecker {
    public void  CheckAge(int age){
       if(age<18){
        System.out.println("minor");
       }else if(age<60){
        System.out.println("adult");
       }else{
         System.out.println("senior citizen");
       }

    }

    public static void main(String[]args){
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
           AgeChecker obj = new AgeChecker();
       obj.CheckAge(age);
    }
    
}

