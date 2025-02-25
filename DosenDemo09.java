import java.util.Scanner;
public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen09[] arrayofDosen09 = new Dosen09[3];

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.next();
            sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            Boolean jenisKelamin = null;
            while (jenisKelamin == null) {
                System.out.print("Jenis Kelamin : ");
                String dummy = sc.nextLine();

                if(dummy.equals("Pria")) {
                    jenisKelamin = true;
                } else if (dummy.equals("Wanita")) {
                    jenisKelamin = false;
                } else {
                    System.out.println("Input tidak valid! Harap masukkan 'Pria' atau 'Wanita' dengan huruf kapital di awal.");
                }
            }

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            System.out.println("----------------------------------");

            arrayofDosen09[i] = new Dosen09(kode, nama, jenisKelamin, usia);
        }
        
        DataDosen09.dataSemuaDosen(arrayofDosen09);
    }
}