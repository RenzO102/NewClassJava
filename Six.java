public class Six {
    public static void main(String[] args) {
        /*System.out.println(sum(5, 3));
        System.out.println(sum(1.5, 1.3));

        sixstudent s = new sixstudent();
        s.setName("sasha");
        String name =s.getName();
        System.out.println(name);*/

        Advicee a = new Advicee();
        Advice b = new Advice();
        a.name();
        b.name();
    }


    public static void foo() {
        //тело метода public - общедоступный
    }

    public static int sum(int a, int b) {
        int x;
        x = a + b;
        return x;
        // с целыми
    }

    public static double sum(double a, double b) {
        double x;
        x = a + b;
        return x;
        // с дробными
    }
}
