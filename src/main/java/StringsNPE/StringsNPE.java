package StringsNPE;

public class StringsNPE {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "123";

        if (!str2.equals(str1)) {        // #1
            str2 = null;                 // #2
        }

        str1 = str2;                     // #3
        str2 = str1;                     // #4

        System.out.println(str2);

        System.out.printf("Display a Number %.2f", 15.23);
    }
}
