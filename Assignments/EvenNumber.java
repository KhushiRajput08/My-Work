public class EvenNumbers{ 
    public void printEvenNumbers(){
        int i=1;
        while(i<=50){
            if(i%2==0){
                System.out.println(i+"");
            }
            i++;
        }

    }
    public static void main(String[]args){
      EvenNumbers obj = new EvenNumbers();
       obj.printEvenNumbers();
   
    }
}
