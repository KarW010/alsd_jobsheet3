public class DataDosen09 {
    public static void dataSemuaDosen(Dosen09[] arrayOfDosen09) {
        System.out.println("=== Data Semua Dosen ===");
        for (Dosen09 dosen : arrayOfDosen09) {
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("----------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen09[] arrayOfDosen09) {
        int pria = 0, wanita = 0;
        for (Dosen09 dosen : arrayOfDosen09) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen09[] arrayOfDosen09) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen09 dosen : arrayOfDosen09) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                countPria++;
            } else {
                totalWanita += dosen.usia;
                countWanita++;
            }
        }
        double rataPria = (countPria == 0) ? 0 : (double) totalPria / countPria;
        double rataWanita = (countWanita == 0) ? 0 : (double) totalWanita / countWanita;

        System.out.println("Rata-rata usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata usia Dosen Wanita : " + rataWanita);
    }

    public static void infoDosenPalingTua(Dosen09[] arrayOfDosen09) {
        Dosen09 palingTua = arrayOfDosen09[0];
        for (Dosen09 dosen : arrayOfDosen09) {
            if (dosen.usia > palingTua.usia) {
                palingTua = dosen;
            }
        }
        System.out.println("=== Dosen Paling Tua ===");
        System.out.println("Kode          : " + palingTua.kode);
        System.out.println("Nama          : " + palingTua.nama);
        System.out.println("Jenis Kelamin : " + (palingTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + palingTua.usia);
        System.out.println("----------------------------------");
    }

    public static void infoDosenPalingMuda(Dosen09[] arrayOfDosen09) {
        Dosen09 palingMuda = arrayOfDosen09[0];
        for (Dosen09 dosen : arrayOfDosen09) {
            if (dosen.usia < palingMuda.usia) {
                palingMuda = dosen;
            }
        }
        System.out.println("=== Dosen Paling Muda ===");
        System.out.println("Kode          : " + palingMuda.kode);
        System.out.println("Nama          : " + palingMuda.nama);
        System.out.println("Jenis Kelamin : " + (palingMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + palingMuda.usia);
        System.out.println("----------------------------------");
    }
}
