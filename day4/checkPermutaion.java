
import java.util.*;

public class checkPermutaion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        //Approach 1

        // char arr1[]= str1.toCharArray();
        // char arr2[] =str2.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // System.out.println(arr1);
        // System.out.println(arr2);
        // if(Arrays.equals(arr1, arr2)){
        //     System.out.println(true);
        // }
        // else{
        //     System.out.println(false);
        // }
        // sc.close();
         
        //Approach 2
        // if(str1.length() != str2.length()){
        //     System.out.println(false);
        // }
        // int flag= 0;
        // for (int i = 0; i < str1.length(); i++) {
        //     char temp= str1.charAt(i);
        //     for(int j=0;j<str2.length() ;j++){
        //        if(str2.charAt(j)==temp){
        //          flag = 1;
        //        }
        //     }
        //     if(flag==0){
        //         System.out.println(false);
        //         break;
        //     }
        // }
        // System.out.println(true);

        //Approach 3
        int arr[] = new int[26];
        Arrays.fill(arr, 0);
        for(int i=0;i<str1.length();i++){
            arr[(str1.charAt(i)-97)]++;
            arr[(str2.charAt(i)-97)]--;
        }
        int flag=0;
        for(int x:arr){
            if(x!=0){
              flag=1;
              break;
            }
        }
        if (flag==0) {     
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
}
