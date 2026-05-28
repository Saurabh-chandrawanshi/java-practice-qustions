package butterfly;
import java.util.*;

public class star {
    public static void main(String[]args){
        int n = 5;
        // upper part
        for(int i = 1; i<=n; i++){
            // 1st hlf ke liye
             for(int j=1; j<=i; j++){
               System.out.print("*");
             }
              int spacses = 2*(n-i);
              for(int j = 1; j<=spacses; j++){
                System.out.print(" ");
              }
              for(int j=1; j<=i; j++){
                System.out.print("*");
              }
              System.out.println();
             }
              // lower part
        for(int i = n; i>=1; i--){
            // 1st hlf ke liye
             for(int j=1; j<=i; j++){
               System.out.print("*");
             }
              int spacses = 2*(n-i);
              for(int j = 1; j<=spacses; j++){
                System.out.print(" ");
              }
              for(int j=1; j<=i; j++){
                System.out.print("*");
              }
              System.out.println();
             }
        }
        }

