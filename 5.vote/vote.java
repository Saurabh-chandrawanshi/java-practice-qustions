import java.util.Scanner;

public class vote {
    public static void eligiable(int age){
        
        if (age>=18) {
            System.out.println("you are eliagible to vote "+age);
            
        }else{
            System.out.println("your age is "+ age +" you are not eligible to vote");
        }
    }
    public static void main(String[]args){
        Scanner src = new Scanner(System.in);
        System.out.println("Enter your age = ");
        int a = src.nextInt();
        eligiable(a);
        src.close();
    }
}
