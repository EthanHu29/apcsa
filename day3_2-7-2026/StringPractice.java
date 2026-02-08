import java.util.*;
public class StringPractice{
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        int n = name.length();
        int cnt = 0;
        for(int i = 0; i<n-2; i++){
            if((name.charAt(i) == 'a' || name.charAt(i) == 'A') && (name.charAt(i+1) == 'a' || name.charAt(i+1) == 'A') && (name.charAt(i+2) == 'a' || name.charAt(i+2) == 'A')){
                cnt ++;
            }
        }
        System.out.println(cnt);
        return;
    }
}
