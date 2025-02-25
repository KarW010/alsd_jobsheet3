import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen09[] arrayOfDosen09 = new Dosen09[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            String jenisKelaminInput = sc.nextLine();
            boolean jenisKelamin = jenisKelaminInput.equals("Pria");
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen09[i] = new Dosen09(kode, nama, jenisKelamin, usia);
            System.out.println("----------------------------------");
        }

        DataDosen09.dataSemuaDosen(arrayOfDosen09);

        DataDosen09.jumlahDosenPerJenisKelamin(arrayOfDosen09);

        DataDosen09.rerataUsiaDosenPerJenisKelamin(arrayOfDosen09);

        DataDosen09.infoDosenPalingTua(arrayOfDosen09);

        DataDosen09.infoDosenPalingMuda(arrayOfDosen09);
    }
}
