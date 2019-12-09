package mate.academy.lessons.collection.LL;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(1);
        myLinkedList.add(400);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(1));
        myLinkedList.remove(0);  //myLinkedList.remove(0);
        System.out.println(myLinkedList);
    }
}