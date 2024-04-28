public class MyQueue<T> {
    private MyLinkedList<T> items;

    public MyQueue(){
        items  = new MyLinkedList<>();
    }

    public boolean empty(){
        return items.isEmpty();
    }

    public int size(){
        return items.size();
    }

    public T peek(){
        return get(0);
    }

    private T get(int i) {
        return items.get(i);
    }

    public T enqueue(T newItem){
        addBack(newItem);
        return newItem;
    }
    private void addBack(T newItem) {
        items.addLast(newItem);
    }
    public T dequeue(){
        T removingItem = peek();
        items.removeFirst();
        return removingItem;
    }


}
