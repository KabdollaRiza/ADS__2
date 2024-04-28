import java.security.PublicKey;

public class MyMinHeap<T> {
    private MyArrayList<T> items;

    public MyMinHeap() {
        items = new MyArrayList<>();
    }

    public boolean empty(){
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public T getMin(){
        if (empty()) {
            return null;
        }
        return items.get(0);
    }

    public T extractMin(){
        if (empty()) {
            return null;
        }
        T min = items.get(0);
        items.set(0, items.get(size() - 1)); // Replace root with the last element
        items.remove(size() - 1); // Remove the last element
        return min;
    }

    public void insert(T item){
        items.add(item); // Add the new item
    }



}
