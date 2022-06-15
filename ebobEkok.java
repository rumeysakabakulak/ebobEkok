import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Küçük Olan Sayıyı Giriniz : ");
        int n1 = inp.nextInt();
        System.out.print("Büyük Olan Sayıyı Giriniz : ");
        int n2 = inp.nextInt();

        int ebob = 0;

        int k = n1;

        while (k >= 1){
            k--;
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("EBOB : " + ebob);
                break;
            }
        }
        int ekok = (n1 * n2 / ebob);
        System.out.print("EKOK : " + ekok);
    }
}
