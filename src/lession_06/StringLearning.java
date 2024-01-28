package lession_06;

public class StringLearning {
    public static void main(String[] args) {
        int a =1;
        int b=a;
        b=2;
        System.out.println(a);
        System.out.println(b);
        String s1="Cat";
        String s2="Cat";
        String s3=new String("Cat");

        System.out.println("s1==s2"+ (s1.equals(s2)));
        System.out.println("S1 == s3 " + (s1.equals(s3)));


        char[] s1Characters=s1.toCharArray();
        char[] s3Characters=s3.toCharArray();
        boolean isEqual=false;
        if (s1Characters.length==s3Characters.length){
            isEqual=true;
        }
    }
}
