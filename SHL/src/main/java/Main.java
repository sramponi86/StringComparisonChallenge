import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        StringComp comparison = new StringComp();

        System.out.println("Insert the first string");
        String firstString = obj.nextLine();
        System.out.println("First string: " + firstString);
        System.out.println("Insert the second string");
        String secondString = obj.nextLine();
        System.out.println("Second string: " + secondString);

        firstString = comparison.cleanString(firstString);
        secondString = comparison.cleanString(secondString);

        //System.out.println(comparison.compareStrings(firstString,secondString));
        if(comparison.compareStrings(firstString,secondString))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        firstString = String.valueOf(comparison.sortStrings(firstString));
        secondString = String.valueOf(comparison.sortStrings(secondString));
        System.out.println("String: " + firstString + " and " + secondString + " are " + comparison.cmpStrings(firstString,secondString));
    }
}
