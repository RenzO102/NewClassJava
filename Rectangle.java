public class Rectangle  extends Nine {

   int lenght;
   int widht;


    public Rectangle (int lenght, int wight){
        this.lenght = lenght;
        this.widht = wight;
    }
    public double area() {
       return widht * lenght;
    }
}
