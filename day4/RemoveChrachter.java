import java.util.Scanner;

public class RemoveChrachter {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String:");
       String str = sc.nextLine();
       System.out.println("Enter the x:");
    //    String w = sc.nextLine();

    //    char x = w.charAt(0);
    char x = sc.next().charAt(0);
    String res="";
    for(int i=0;i<str.length();i++){
          if(str.charAt(i)==x){
            continue;
          }
          res+=str.charAt(i);
      } 
      System.out.println("Result string: ");
      System.out.println(res);
    }
   
}
