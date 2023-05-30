package HomeWork4;

public class TestQueue {
    public static void main(String[] args) {
        MyQueue test = new MyQueue();
        test.enqueue(12);
        test.enqueue(11);
        test.enqueue(5);
        test.enqueue(7);
        test.print();
        System.out.println(test.dequeue());
        test.print();
        System.out.println(test.first());
        test.print();
        test.enqueue(27);
        test.enqueue(22);
        test.print();
        test.removeAll();
        test.print();
//        Проверки исключений при пустой очереди.
//        test.dequeue();
//        test.first();
        test.enqueue(15);
        test.print();
        int num = test.first();
        System.out.println(num);
    }
}
