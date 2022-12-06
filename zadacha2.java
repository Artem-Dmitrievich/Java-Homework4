// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
import java.util.LinkedList;

public class zadacha2 {

    public static void main(String[] args) {

        int[] list = { 1, 2, 3, 4, 5, 6 };

        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }

        System.out.println(linkList);

        enqueue(linkList, 7);
        System.out.println(linkList);

        System.out.println(dequeue(linkList));
        System.out.println(linkList);

        System.out.println(first(linkList));
    }
// enqueue() - помещает элемент в конец очереди

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

// dequeue() - возвращает первый элемент из очереди и удаляет его

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

// first() - возвращает первый элемент из очереди, не удаляя.

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
