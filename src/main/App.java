import java.io.PrintStream;
public class App {
    public static void main(String[] args) {
        greet(System.out);
        greet2(System.out);
    }

    public static void greet(PrintStream out) {
        out.println("Hello, World!");
    }

    public static void greet2(PrintStream out) {
        out.println("Hello, World!");
    }
}