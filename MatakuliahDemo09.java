import java.util.Scanner;
public class MatakuliahDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlahMatakuliah = Integer.parseInt(sc.nextLine());

        Matakuliah09[] arrayOfMatakuliah09 = new Matakuliah09[jumlahMatakuliah];

        for(int i=0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah09[i] = new Matakuliah09();
            arrayOfMatakuliah09[i].tambahData(sc);
        }

        for(int i=0; i < jumlahMatakuliah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah09[i].cetakInfo();
        }
    }
}