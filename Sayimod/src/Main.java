import java.util.Scanner;

class BolenlerinOrtalamasi {
    public static void main(String[] args) {
        int k,adet=0, toplam=0;
        double ortalama;
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
         k = scan.nextInt();



        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }


            ortalama = (double) toplam / adet;
            System.out.println("ortalama: " + ortalama);

    }
}
