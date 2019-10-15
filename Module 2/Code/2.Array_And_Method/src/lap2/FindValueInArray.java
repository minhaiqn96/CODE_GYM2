package lap2;
import java.util.Scanner;

public class FindValueInArray {
    public int findFruit(String[] fruit, String input) {
//        public static int findFruit(String input) { //them "static"
        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].equals(input)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] fruit = {"apple", "orange", "coconut", "strawberry"};
        int index;
        String input;
        FindValueInArray findValueInArray = new FindValueInArray();//them static khong can tao doi tuong
        System.out.println("Enter the Fruit: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        index = findValueInArray.findFruit(fruit, input);//them static => index=findFruit(input);
        if (index != -1) {
            System.out.println("Found " + input + " at position " + index + " in array");
        } else {
            System.out.println("No found " + input + " in array");
        }

    }
}
