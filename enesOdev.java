import java.util.Scanner;

public class enesOdev {
    public static void main(String args[]) {

        int [] dizi = new int[5];
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Tam Sayı Giriniz: ");
            dizi [i] = scanner.nextInt();

        }

        for (int e = 0;  e < dizi.length; e++) {
            for (int r = 1; r < dizi.length ; r++) {
                if (dizi[r] < dizi[r - 1]) {
                    int temp = dizi[r];
                    dizi[r] = dizi[r - 1];
                    dizi[r - 1] = temp;
                }
            }
        }
        for (int f = 0; f < dizi.length; f++) {

            System.out.print(f+1+".Sayı: "+dizi [f] + "\n");
        }
    }
}
