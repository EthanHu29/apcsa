import java.util.*;
public class Branching {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        if (a<=b && a<=c){
            System.out.println(a);
            if(b<=c){
                System.out.println(b);
                System.out.println(c);
            }
            else{
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if (b<=a && b<=c){
            System.out.println(b);
            if(a<=c){
                System.out.println(a);
                System.out.println(c);
            }
            else{
                System.out.println(c);
                System.out.println(a);
            }
        }
        else{
            System.out.println(c);
            if(a<=b){
                System.out.println(a);
                System.out.println(b);
            }
            else{
                System.out.println(b);
                System.out.println(a);
            }
        }
        keyboard.close();

    }
}