public class Swap {

    public static void main(String[] args) {
        int a = 15, b = 38, c = 57, d = 27, e = 29, f = 35;

        System.out.println(String.format("before swapping (using +/-): a = %d, b = %d", a, b));

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(String.format("after swapping (using +): a = %d, b = %d", a, b));

        System.out.println(String.format("before swapping (using *//): c = %d, d = %d", c, d));

        c = c * d;
        d = c / d;
        c = c / d;

        System.out.println(String.format("after swapping (using *//): c = %d, d = %d", c, d));

        System.out.println(String.format("before swapping (using *//): e = %d, f = %d", e, f));

        e = e ^ f;
        f = e ^ f;
        e = e ^ f;

        System.out.println(String.format("after swapping (using ^): e = %d, f = %d", e, f));

        int a2 = 4, b2 = 7;

        System.out.println(String.format("before: a = %d, b = %d", a2, b2));

        a2 = a2 | b2;
        b2 = a2 | b2;

        System.out.println(String.format("before: a = %d, b = %d", a2, b2));
    }
}