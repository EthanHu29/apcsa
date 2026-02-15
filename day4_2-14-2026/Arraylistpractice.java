import java.util.*;

public class Arraylistpractice{
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        for(int i = 0; i<n; i++){
            a.add(keyboard.nextInt());
        }
        for(int i = n-1 ; i>=0; i--){
            System.out.println(a.get(i));
        }
        int totalremove = 0;
        for(int i = 0; i<n-totalremove; i++){
            if(a.get(i) == 5){
                a.remove(i);
                totalremove += 1;
            }
        }
        for(int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
        //read in n and then followed by n integers. 
        //you should store these n numbers into an arraylist. 
        //then go through the arraylist backward and print out every number in it
    }
}