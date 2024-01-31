import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          int count=1;
          String res="";
          int n = str.length();
          for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1))
              {
                count++;
              }
              else{
                if(count>1){
                    res+= str.charAt(i-1)+Integer.toString(count);
                }
                else{
                    res+=str.charAt(i-1);
                }
                count=1;
              }
          }
          if(str.charAt(n-1)==str.charAt(n-2)){
            res+= str.charAt(n-1)+Integer.toString(count);
          }
          else{
            res+=str.charAt(n-1);
          }
          System.out.println(res);
    }
}
