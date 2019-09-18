import java.util.ArrayList;
import java.util.Collections;


public class Lesson11 {

    public int inputNumberA() {
        int a = 1 + (int) (Math.random() * 100);
        System.out.println("Число a = " + a);
        return a;
    }

    public int inputNumberB() {
        int b = 1 + (int) (Math.random() * 100);
        System.out.println("Число b = " + b);
        return b;
    }

    public int inputNumberC() {
        int c = 1 + (int) (Math.random() * 100);
        System.out.println("Число c = " + c);
        return c;
    }

    public int inputNumberX() {
        int x = 1 + (int) (Math.random() * 100);
        System.out.println("Число x = " + x);
        return x;
    }

    public int inputNumberY() {
        int y = 1 + (int) (Math.random() * 100);
        System.out.println("Число y = " + y);
        return y;
    }


    public ArrayList<Integer> brick(int a, int b, int c) {

        ArrayList<Integer> brick = new ArrayList<>();

        brick.add(0, a);
        brick.add(1, b);
        brick.add(2, c);

        Collections.sort(brick);

        return brick;

    }

    public ArrayList<Integer> port(int x, int y) {
        ArrayList<Integer> port = new ArrayList<>();

        port.add(0, x);
        port.add(1, y);

        Collections.sort(port);

        return port;
    }

    public void equalsObject(ArrayList<Integer> brick, ArrayList<Integer> port) {

        System.out.println("Кирпич: " + brick);
        System.out.println("Отверстие: " + port);

        int index = brick.get(0);
        int index1 = brick.get(1);

        int index2 = port.get(0);
        int index3 = port.get(1);

        if (index >= index2 || index1 >= index3) {
            System.out.println("Кирпич не проходит");
        } else {
            System.out.println("Кирпич проходит");
        }

    }
}
