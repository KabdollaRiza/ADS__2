import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{

    private T[] array = (T[]) new Object[5];
    private int size;

    public MyArrayList(){
        size=0;
    }


    @Override
    public void add(T item) {
        if(size>=array.length)
            increaseBuffer();
        array[size++] = item;
    }

    @Override
    public void set(int index, T item) {

    }

    @Override
    public void add(int index, T item) {
        if(size>=array.length)
            increaseBuffer();
        checkIndex(index);
        array[index] = item;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("index not correct");
        }
    }

    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[array.length*2];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];  //copy each element from old to new
        }
        array = newArr; //change reference of arr from old memory location to new
    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index+1; i <size ; i++) {
            array[i-1] = array[i];
        }
        size--;
    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {
        array = (T[]) new Object[5];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
