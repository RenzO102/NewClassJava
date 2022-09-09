public class Pointseven {

    private int x;
    private int y;

    public Pointseven(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void Scale() {
        this.x = x / 2;
        this.y = y / 2;
        System.out.println("(" + x + ", " + y + ")");
    }
}



