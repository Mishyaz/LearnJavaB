package ex4;

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
//            y = x - y;
//            y = y + x;
/*            y = y + 2;
            if (y > 4) {
                y = y - 1;
            }*/
/*            x = x + 1;
            y = y + x;*/
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
