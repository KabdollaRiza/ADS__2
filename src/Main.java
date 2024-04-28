public class Main {
    public static void main(String[] args) {
        // MyArrayList test
        MyArrayList<Integer> arrayList = new MyArrayList();
        arrayList.add(11);
        arrayList.add(13);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // MyLinkedList test
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();

        myLinkedList.add(11);
        myLinkedList.add(13);
        myLinkedList.add(15);
        System.out.println(myLinkedList.get(1));

        // MyStack with MyArrayList test
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(3);
        myStack.push(5);
        System.out.println(myStack.peek());

        // MyQueue with LinkedList test
        MyQueue<Integer> myQueue=new MyQueue<>();
        myQueue.enqueue(5);
        myQueue.enqueue(7);
        myQueue.enqueue(9);
        System.out.println(myQueue.peek());

        //MyMinHeap with MyArrayLIst
        MyMinHeap<Integer> myMinHeap=new MyMinHeap<>();
        myMinHeap.insert(12);
        myMinHeap.insert(15);
        myMinHeap.insert(16);
        System.out.println(myMinHeap.getMin());
    }
}
