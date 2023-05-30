package HomeWork4;

import java.util.LinkedList;

public class MyQueue {
    LinkedList<Integer> testList = new LinkedList<>();

    public void enqueue(int element) {
        testList.addLast(element);
    }

    public int dequeue() {
        if (!testList.isEmpty()) {
            return testList.pollFirst();
        } else {
            throw new RuntimeException("Queue is empty.");
        }
    }

    public int first() {
        if (!testList.isEmpty()) {
            return testList.peekFirst();
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }
    public void removeAll(){
        while (!testList.isEmpty()){
            testList.remove();
        }
    }

    public void print() {
        System.out.println(testList);
    }

}
