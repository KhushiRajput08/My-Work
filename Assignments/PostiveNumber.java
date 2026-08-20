import java.util.*;
public class Positive {
    
   public void askForPositiveNumber(Scanner sc){
    int num;
    do{
        System.out.print("Enter a positive number");
        num=sc.nextInt();
    }while(num<=0);
    System.out.println("you enter a positive number "+num);
   }

public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
Positive obj = new Positive();
obj.askForPositiveNumber(sc);

}
    
}
