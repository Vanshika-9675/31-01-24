import java.util.Scanner;

public class ConsecutiveDup {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         String res="";
         int n =str.length();
         for(int i=1;i<n;i++){
            if(str.charAt(i-1)!=str.charAt(i)){
               res+=str.charAt(i-1);
            }
         }
         if(res.charAt(res.length()-1)!=str.charAt(n-1)){
            res+=str.charAt(n-1);
         }
         System.out.println(res);
    }
}
