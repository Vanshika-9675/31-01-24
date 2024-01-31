import java.util.Scanner;

/**
 * CountWords
 */
public class CountWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for (int j = 0; j < str.length(); j++) {
            if(str.charAt(j)==' '){
               count++;
            }
        }
        System.out.println(count+1);
        sc.close();
    }
}