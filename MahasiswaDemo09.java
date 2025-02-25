import java.util.Scanner;
public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa09[] arrayOfMahasiswa09 = new Mahasiswa09[3];
        String dummy;

        for(int i=0; i < 3; i++) {
            arrayOfMahasiswa09[i] = new Mahasiswa09();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa09[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa09[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa09[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa09[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------");
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : "+ arrayOfMahasiswa09[i].nim);
            System.out.println("Nama    : "+ arrayOfMahasiswa09[i].nama);
            System.out.println("Kelas   : "+ arrayOfMahasiswa09[i].kelas);
            System.out.print("IPK     : "+ arrayOfMahasiswa09[i].ipk);
            System.out.println("----------------------------------");
        }
        // arrayOfMahasiswa09[0] = new Mahasiswa09();
        // arrayOfMahasiswa09[0].nim = "244107060033";
        // arrayOfMahasiswa09[0].nama = "AGNES TITANIA KINANTI";
        // arrayOfMahasiswa09[0].kelas = "SIB-1E";
        // arrayOfMahasiswa09[0].ipk = (float) 3.75;

        // arrayOfMahasiswa09[1] = new Mahasiswa09();
        // arrayOfMahasiswa09[1].nim = "2341720172";
        // arrayOfMahasiswa09[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrayOfMahasiswa09[1].kelas = "TI-2A";
        // arrayOfMahasiswa09[1].ipk = (float) 3.36;

        // arrayOfMahasiswa09[2] = new Mahasiswa09();
        // arrayOfMahasiswa09[2].nim = "244107023006";
        // arrayOfMahasiswa09[2].nama = "DIRHAMAWAN PUTRANTO";
        // arrayOfMahasiswa09[2].kelas = "TI-2E";
        // arrayOfMahasiswa09[2].ipk = (float) 3.80;

        // System.out.println("NIM     : "+ arrayOfMahasiswa09[0].nim);
        // System.out.println("Nama    : "+ arrayOfMahasiswa09[0].nama);
        // System.out.println("Kelas   : "+ arrayOfMahasiswa09[0].kelas);
        // System.out.println("IPK     : "+ arrayOfMahasiswa09[0].ipk);
        // System.out.println("-------------------------------------");
        // System.out.println("NIM     : "+ arrayOfMahasiswa09[1].nim);
        // System.out.println("Nama    : "+ arrayOfMahasiswa09[1].nama);
        // System.out.println("Kelas   : "+ arrayOfMahasiswa09[1].kelas);
        // System.out.println("IPK     : "+ arrayOfMahasiswa09[1].ipk);
        // System.out.println("-------------------------------------");
        // System.out.println("NIM     : "+ arrayOfMahasiswa09[2].nim);
        // System.out.println("Nama    : "+ arrayOfMahasiswa09[2].nama);
        // System.out.println("Kelas   : "+ arrayOfMahasiswa09[2].kelas);
        // System.out.println("IPK     : "+ arrayOfMahasiswa09[2].ipk);
        // System.out.println("-------------------------------------");
    }
}