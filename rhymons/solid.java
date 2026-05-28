package rhymons;
public class solid {
    public static void main(String[]args){
        int n = 5;
        for(int i = 1; i<=n; i++){
            int spacses = n-i;
            for(int j=1; j<=spacses; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
