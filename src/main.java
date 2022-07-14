import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n, r;


        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını girin : ");
        n = input.nextInt();
        int nFac = 1;

        for (int i = 1; i <= n; i++) {
            nFac = nFac * i;

        }
        System.out.println(n + "!= " + nFac);

        System.out.print(" r sayısını girin : ");
        r = input.nextInt();
        int rFac = 1;

        for (int i = 1; i <= r; i++) {
            rFac = rFac * i;

        }
        System.out.println(r + "!= " + rFac);

        int comb = 1;
        for (int i = 1; i <= n - r; i++) {
            comb = comb * i;
        }
        System.out.println("(n-r)!= " + comb);

        int sonuc = (nFac) / ((rFac) * (comb));
        System.out.println(" Formül : n! / (r! * (n-r)!");
        System.out.println("Sonuç : " + sonuc );
    }
}


