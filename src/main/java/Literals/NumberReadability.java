package Literals;

public class NumberReadability {
    public static void main(String[] args) {
        Integer num1 = 1000000;
        Integer num2 = 1_000_000;
        if(num2==num1)
            System.out.println(num2);
        else
            System.out.println("Not equal");
        System.out.println(num2+num1);
        /* a strange /* // /* single-line comment */
        /*No*/
    }
}
