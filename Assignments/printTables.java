import java.util.*;
public class PrintTables {

    public void printMultiplicationTable(int num){

    
       for(int i=1;i<=10;i++){
        System.out.println(num + "*" +i + "=" +(num*i));
       }
    }
 public static void main(String[]args){
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
     PrintTables obj = new PrintTables();
     obj.printMultiplicationTable(num);

 }
    
}