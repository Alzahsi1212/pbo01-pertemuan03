package Operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    // i bernilai 0 ditambahkan i sehingga i=1 (i++)
        System.out.println(i);  // i = 1
        i++;                    // i tadi 1 sekarang ditambahkan lagi
        System.out.println(i);  // i bernilai 2
        i=i+1;                  // i++ sama dengan i=i+1
        System.out.println(i);  // i tadi 2 sekarang 3

        //penambahkan operator aritmatika
        i+=3;   //sama dengan i=i+3
        System.out.println(i);

        i*=3;   //sama dengan i=i*3
        System.out.println(i);
    }
}
