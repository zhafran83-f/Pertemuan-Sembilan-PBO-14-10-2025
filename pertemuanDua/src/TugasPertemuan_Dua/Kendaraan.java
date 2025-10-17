/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan_Dua;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Kendaraan {

    /**
     * @return the jumlahRoda
     */
    protected int getJumlahRoda() {
        return jumlahRoda;
    }

    /**
     * @param jumlahRoda the jumlahRoda to set
     */
    protected void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    /**
     * @return the kapasitasMesin
     */
    protected int getKapasitasMesin() {
        return kapasitasMesin;
    }

    /**
     * @param kapasitasMesin the kapasitasMesin to set
     */
    protected void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    /**
     * @return the kapasitasPenumpang
     */
    protected int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    /**
     * @param kapasitasPenumpang the kapasitasPenumpang to set
     */
    protected void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    /**
     * @return the namaKendaraan
     */
    protected String getNamaKendaraan() {
        return namaKendaraan;
    }

    /**
     * @param namaKendaraan the namaKendaraan to set
     */
    protected void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    /**
     * @return the bahanBakar
     */
    protected String getBahanBakar() {
        return bahanBakar;
    }

    /**
     * @param bahanBakar the bahanBakar to set
     */
    protected void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    private int jumlahRoda;
    private int kapasitasMesin;
    private int kapasitasPenumpang;
    private String namaKendaraan;
    private String bahanBakar;
    
    public void kendaraan(){
        System.out.println("Contoh kendaraan Umum : ");
    }
    public void testThis(int jumlahRoda, int KapasitasMesin, int KapasitasPenumpang, String NamaKendaraan, String BahanBakar) {
        this.getJumlahRoda();
        this.getKapasitasMesin();
        this.getKapasitasPenumpang();
        this.getNamaKendaraan();
        this.getBahanBakar();
    }
}
