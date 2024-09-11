public class Typecasting {
    public static void main(String[] args) {
        byte b = 10;
        short s = b; // implicit type casting
        System.out.println(s);
        System.out.println("implicit type casting");

        char c = 97;
        int i = c;
        System.out.println("explicit type casting");

        System.out.println(i);
    }
}
