import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a , b  ;
        double c2 , c , Alan , Cevre , u , Alan2 ;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenarı giriniz : ");
        a = input.nextInt();
        System.out.println("2. Kenarı giriniz : ");
        b = input.nextInt();
        c2 = (a*a) + (b*b);
        c = Math.sqrt(c2);
        System.out.println("Üçgenin hipotenüs kenarı: " + c);
        Cevre= a+b+c;
        System.out.println("Üçgenin çevresi : " + Cevre);
        u = Cevre/2 ;
        Alan2 = u*(u-a)*(u-b)*(u-c);
        Alan = Math.sqrt(Alan2);
        System.out.println("Üçgenin alanı : " + Alan);
    }
}