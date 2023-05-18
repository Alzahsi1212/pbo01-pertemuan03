package Branching;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 63000;
        double totalBeli = 25000;
        double totalUang = 45000;

        //statement 1
        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang kurang, jangan jajan mahal");
        } else if (uangDiDompet>totalBelanja){
            double kembalian = uangDiDompet-totalBelanja;
            System.out.println("Uang cukup, ini kembaliannya "+kembalian);
        } else {
            System.out.println("Uangnya pas"); //statement 3
        }
        //statement 2
        if (totalUang<totalBeli){
            System.out.println("Uang kurang, jangan jajan mahal");
        } else {
            System.out.println("Uang cukup, gas beli"); }
    }
}
