package ex1;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
        myList.add(2, 8);

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }

        myList.remove(1);

        System.out.println();
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }

        System.out.println();
        System.out.println(myList.clone());
        System.out.println(myList.contains(7));
        System.out.println(myList.indexOf(1));
        System.out.println(myList.get(1));
        myList.clear();
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}
