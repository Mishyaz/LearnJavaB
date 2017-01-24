package ex13;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Gav Gav!");
        } else if (size > 14) {
            System.out.println("Wuf Wuf!");
        } else {
            System.out.println("Tyaf Tyaf!");
        }
    }
}
