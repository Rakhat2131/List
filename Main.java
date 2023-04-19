
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(7);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(999);

        printer(list);
    }

    public static void printer(MyList<Integer> list) {
        for (var elem : list) {
            System.out.print(elem + " ");
        }
    }
}