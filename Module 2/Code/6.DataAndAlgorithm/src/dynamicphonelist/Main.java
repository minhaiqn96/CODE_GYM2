package dynamicphonelist;

public class Main {
    public static void main(String[] args) {
        PhoneList aaa= new PhoneList();
        PhoneListNode node1 = new PhoneListNode("Hai", "123");
        PhoneListNode node2 = new PhoneListNode("Jacky", "456");
        PhoneListNode node3 = new PhoneListNode("Tyn", "789");
        aaa.insert(node1);
//        node1.setNext(node2);
//        node2.setNext(node3);
        aaa.print();
    }
}
