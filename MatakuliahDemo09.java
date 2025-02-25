import java.util.Scanner;
public class MatakuliahDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah09[] arrayOfMatakuliah09 = new Matakuliah09[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------");

            arrayOfMatakuliah09[i] = new Matakuliah09(kode, nama, sks, jumlahJam);
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : "+ arrayOfMatakuliah09[i].kode);
            System.out.println("Nama       : "+ arrayOfMatakuliah09[i].nama);
            System.out.println("Sks        : "+ arrayOfMatakuliah09[i].sks);
            System.out.println("Jumlah Jam : "+ arrayOfMatakuliah09[i].jumlahJam);
            System.out.println("----------------------------------");
        }
    }
}