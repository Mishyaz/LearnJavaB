package ex14;

public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    private int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
