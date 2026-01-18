import java.util.*;
public class Arcarea {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        double angle = keyboard.nextDouble();
        double radius = keyboard.nextDouble();
        double arclength = (angle/360)*radius*2*Math.PI;
        System.out.println(arclength);
    }
}
