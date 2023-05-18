package Operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        System.out.println(i==2);   //true
        System.out.println(i==3);   //false
        System.out.println(i==j);   //false
        System.out.println(i>j);    //false
        System.out.println(i<j);    //true
        System.out.println(2>3);    //false
        System.out.println(2<3);    //true
        System.out.println(i!=2);   //false
        System.out.println(j!=2);   //true
    }
}
