public class MyStack<T> {
    private MyArrayList<T> items;

    public MyStack() {
        items = new MyArrayList<>();
    }
    public void push(T item){
        items.add(item);
    }

    public T peek() {
        if (isEmpty())
            throw new java.util.EmptyStackException();
        return items.get(items.size() - 1);
    }
    public T pop() {
        if (isEmpty())
            throw new java.util.EmptyStackException();
        T element = items.get(items.size() - 1);
        items.remove(items.size() - 1);
        return element;
    }
    public boolean isEmpty(){
        return items.isEmpty();
    };

    public int size() {
        return items.size();
    }

}
