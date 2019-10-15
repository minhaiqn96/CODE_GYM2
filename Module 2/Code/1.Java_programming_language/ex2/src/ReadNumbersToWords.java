import java.util.Scanner;

public class ReadNumbersToWords {
    public void oneNumb(int numb) {
        switch (numb) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("night");
                break;
            case 10:
                System.out.println("ten");
                break;
        }
    }

    public void twoNumbTeen(int numb) {
        int DV = numb % 10;
        switch (DV) {
            case 1:
                System.out.println("eleven");
                break;
            case 2:
                System.out.println("twelve");
                break;
            case 3:
                System.out.println("thirteen");
                break;
            case 4:
                System.out.println("fourteen");
                break;
            case 5:
                System.out.println("fitteen");
                break;
            case 6:
                System.out.println("sixteen");
                break;
            case 7:
                System.out.println("seventeen");
                break;
            case 8:
                System.out.println("eighteen");
                break;
            case 9:
                System.out.println("nineteen");
                break;
        }
    }

    public void twoNumbSpecial(int twoPos, int onePos) {
        switch (twoPos) {
            case 1:
                System.out.print("Ten ");
                break;
            case 2:
                System.out.print("twenty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("forty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixty ");
                break;
            case 7:
                System.out.print("seventy ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
                break;
        }
        oneNumb(onePos);
    }

    public void twoNumberEven(int numb) {
        int onePos;
        int twoPos;
        onePos = numb % 10;
        twoPos = numb / 10;
        twoNumbSpecial(twoPos, onePos);
    }

    public void threeNumb(int numb) {
        int onePos;
        int twoPos;
        int threePos;
        onePos = numb % 10;
        twoPos = (numb % 100) / 10;
        threePos = numb / 100;
        switch (threePos) {
            case 1:
                System.out.print("One hundred ");
                break;
            case 2:
                System.out.print("Two hundred ");
                break;
            case 3:
                System.out.print("Three hundred ");
                break;
            case 4:
                System.out.print("Four hundred ");
                break;
            case 5:
                System.out.print("Five hundred ");
                break;
            case 6:
                System.out.print("Six hundred ");
                break;
            case 7:
                System.out.print("Seven hundred ");
                break;
            case 8:
                System.out.print("Eight hundred ");
                break;
            case 9:
                System.out.print("Nine hundred ");
                break;
        }
        if (twoPos == 0) {
            oneNumb(onePos);
        } else if (twoPos == 1) {
            twoNumbTeen(onePos);
        } else {
            twoNumbSpecial(twoPos, onePos);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter the value number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            ReadNumbersToWords read = new ReadNumbersToWords();

            if (number <= 10) {
                read.oneNumb(number);
            } else if (number < 20) {
                read.twoNumbTeen(number);
            } else if (number < 100) {
                read.twoNumberEven(number);
            } else {
                read.threeNumb(number);
            }
        }
    }
}