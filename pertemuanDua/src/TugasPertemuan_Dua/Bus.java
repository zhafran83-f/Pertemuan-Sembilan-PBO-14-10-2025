/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan_Dua;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Bus extends Kendaraan implements Mesin, Kru {

    public void menjalankan() {
        System.out.println("Menuju arah barat");
    }

    public void cekOli() {
        System.out.println("Oli telah dicek dan dalam kondisi baik");
    }

    public void cekRetarder() {
        System.out.println("Retarder dalam kondisi prima");
    }

    public void cekKondisiAC() {
        System.out.println("AC dalam kondisi sempurna tanpa kerusakan");
    }

    public void mengemudikan() {
        System.out.println("Untuk mengantar penumpang");
    }

    public void mengecekTiket() {
        System.out.println("Tiket penumpang sesuai dengan armada");
    }

    public void menaruhBarang_DiBagasi() {
        System.out.println("Bagasi penumpang telah ditandai dan ada dibagasi");
    }

    public void melayaniPenumpang() {
        System.out.println("Penumpang dilayani dengan fasilitas Snack, Bantal dan Selimut");
    }

    public void berkendaraDenganAman() {
        System.out.println("Kru hanya boleh berkendara maksimal 110 km/h");
    }
    public void testSuper(int jumlahRoda, int KapasitasMesin, int KapasitasPenumpang, String NamaKendaraan, String BahanBakar) {
        super.getJumlahRoda();
        super.getKapasitasMesin();
        super.getKapasitasPenumpang();
        super.getNamaKendaraan();
        super.getBahanBakar();
    }
    
    public static void main(String[] args) {
        Bus transportasi = new Bus();
        transportasi.mengemudikan();
        transportasi.menjalankan();
        transportasi.cekOli();
        transportasi.cekRetarder();
        transportasi.cekKondisiAC();
        transportasi.mengecekTiket();
        transportasi.menaruhBarang_DiBagasi();
        transportasi.melayaniPenumpang();
        transportasi.berkendaraDenganAman();
    }
}
