package dimond;
public class dimomnd {
    public static void main(String[]args){
        int n =4 ;
        // 1st hlf ke liye 
        for(int i =1; i<=n; i++){
            
            // spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            // 1st a part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // 2nd part ke liye 
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            // lower part ke liye
            for(int i=n; i>=1; i--){
                // 1st lower part ke liye spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //1st lower past
                for(int j=1 ; j<=i; j++){
                    System.out.print("*");
                }
                // second lower part
                for(int j=2; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
           
        
        }
}
