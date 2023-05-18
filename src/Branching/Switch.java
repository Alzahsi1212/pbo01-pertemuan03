package Branching;

public class Switch {
    public static void main(String[] args) {
        char nilai='A';
        int hewan=3;
        //contoh 1
        switch (hewan){
            case 1:
                System.out.println("Ayam");
                break;
            case 2:
                System.out.println("Kucing");
                break;
            case 3:
                System.out.println("Naga");
                break;
            case 4:
                System.out.println("Kura-Kura");
        }
        //contoh 2
        switch (nilai) {
            case 'A':
                System.out.println("A  : Selamat atas kemenangan mu ya");
                System.out.println("B  : Terimakasih ucapannya");
                break;
            case 'B':
                System.out.println("A  : Kawakah minjam dulu seratus hehe");
                System.out.println("B  : Aduh Masbro..");
                break;
            case 'C':
                System.out.println("Sistem error, tidak ada percakapan");
                break;
            default:
                System.out.println("A  : kada paham aku tugas nya meapa");
                System.out.println("B  : joki aja kah?");
                System.out.println("A  : gas nah");
        }

    }
}
