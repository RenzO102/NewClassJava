public class Two {

    public static void main(String[] args) {
        int myNumber=5;
        double d = 4.5;
        d = 3.0;

        float f = (float) 4.5;

        char c = 'g';

        String s1 = new String("Who let the dogs out? ");
        String s2 = " Who Who Who Who";
        String s3 = s1 +s2; // переменные

        int num = 5;
        String a = "I have" + num + " cookies";
        System.out.println(s3);
        System.out.println(a);

        boolean b = false;
        b = true; // переменные типа true false

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }

    }
}
