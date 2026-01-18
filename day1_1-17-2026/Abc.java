import java.util.*;

public class Abc {
    //read in abc as doubles
    //solve quadratic equation and print out hte two roots
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        double resultpositive = ((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double resultnegative = ((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println(resultpositive + " positive");
        System.out.println(resultnegative + " negative");
    } 
}
