package dynamicphonelist;

public class PhoneListNode {
    private String name;
    private String phone;
    private PhoneListNode next;

    public PhoneListNode(String name, String phone) {
        this.name = name;
        this.phone = phone;
        next = null;
    }

    public void setData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return name + " " + phone;
    }

    public String toString() {
        return name + " " + phone;
    }

    public void setNext(PhoneListNode nextPtr) {
        this.next = nextPtr;
    }

    public PhoneListNode getNext() {
        return next;
    }
}
