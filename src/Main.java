import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList =  new MyArrayList();
        MyLinkedList myLinkedList=new MyLinkedList<>();

        arrayList.add(11.5);
        System.out.println(arrayList.size());

        myLinkedList.add(12);
        myLinkedList.add(13);
        System.out.println(myLinkedList.size());
    }
}