import java.util.*;
public class Sum {

    public void calculateSum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum = sum+i;
            
        }
        System.out.println("the sum of number from 1 to n is"+sum);
    }
    public static void main(String[]args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Sum obj = new Sum();
        obj.calculateSum(n);
     


    }
}