package lap4;

public class FindMinInArray {
    public static int minValue(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 9, 8, 6, 7, 1};
        int index = minValue(arr);
        System.out.println("This array has smallest element is " + arr[index] + " at position " + index);
    }
}
