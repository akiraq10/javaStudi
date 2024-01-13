package lession_2;

public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //Prefix: ++a
        //Postfix:b++

        /*
        * prefix > right operand > assign value into left operand > postfix
        * a=2 b=2
        * c=4
        * b=3
         */
        int c = ++a + b++;

        //breakpoint(s)
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
    }
}
