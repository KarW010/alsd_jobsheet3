import java.util.Scanner;
public class MatakuliahDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah09[] arrayOfMatakuliah09 = new Matakuliah09[3];

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah09[i] = new Matakuliah09("", "", 0, 0);
            arrayOfMatakuliah09[i].tambahData(sc);
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah09[i].cetakInfo();
        }
    }
}