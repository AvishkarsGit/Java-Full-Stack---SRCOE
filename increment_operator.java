public class increment_operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = ++a + b--;
        int d = ++c + a-- + ++b;
        System.out.println(--a);
        System.out.println(--b);
        System.out.println(c++);
        System.out.println(d++);
    }
}
