class Node{
    int value;
    Node next;

    public Node(int d){
        value = d;
    }
}
public class linkedList{
    Node head;

    public static linkedList insert(linkedList list, int data){

        Node new_data = new Node(data);
        new_data.next = null;

        if (list.head == null){
            list.head = new_data;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_data;
        }
        return list;

    }

    public static void printList(linkedList list){

        Node current = list.head;

        while(current != null){
            
            System.out.println(current.value);

            current = current.next;
        }
    }
    public static void main(String[] ar){
        Node head = null;
        linkedList list = new linkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);

        printList(list);

    }
}