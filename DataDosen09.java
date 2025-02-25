public class DataDosen09 {
    public static void dataSemuaDosen(Dosen09[] arrayOfDosen09){
        int i = 1;
        for(Dosen09 dosen : arrayOfDosen09) {
            System.out.println("Data Dosen ke-" + i++);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("----------------------------------");
        }
    }
}