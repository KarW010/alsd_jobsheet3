import java.util.Scanner;
public class Matakuliah09 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah09() {
        this.kode = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("Sks        : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("----------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Sks        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("----------------------------------");
    }
}