import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         System.out.println("All the substrings generated: ");
        for(int i=0;i<str.length();i++){
            String substr = "";
            for(int j=i;j<str.length();j++){
               substr+=str.charAt(j);
               System.out.println(substr);
            }
        }
        sc.close();
       }
}
