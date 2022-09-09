import java.awt.Rectangle;

public class NineMain {
    public static void main(String[] args) {

        Nine s1 = new Circle (4);
        Nine s2 = new Rectangle(5 , 4);
        Nine larger = getLargenine (s1, s2);

        System.out.println("The area of the larger shape is: " +larger.area());
    }

     public static Nine getLargenine (Nine s1, Nine s2){
        if (s1.area() > s2.area())
            return s1;
         else
            return s2;
        }
     }

