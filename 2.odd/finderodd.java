
import java.util.Scanner;

public class finderodd{
    public  static void findervalue(int start, int end){
      for(int i = start ; i<=end; i++){
        if (i % 2 !=0 ) {
        
            System.out.println(i);
            
        }
      }
    } 
 
      
    public static void main(String[]args){
        Scanner src = new Scanner(System.in);
        System.out.println("enter Start value");
         int a = src.nextInt();
         System.out.println("enter end value");
          int b = src.nextInt();
  
          
           findervalue(a,b);
      

           src.close();
    }
  }
