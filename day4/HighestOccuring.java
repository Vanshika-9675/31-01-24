import java.util.*;

public class HighestOccuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
            }
            else{
                mp.put(str.charAt(i),1);
            }
        }
        int maxi=0;
        char ch='$';
        for(char key:mp.keySet()){
            if(mp.get(key)>maxi){
                maxi=mp.get(key);
                ch=key;
            }
        }
        System.out.println(ch);
    }
}
