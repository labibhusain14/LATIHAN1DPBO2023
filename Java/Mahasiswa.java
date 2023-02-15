public class Mahasiswa {

    // Membuat Private attributes:
    // Nama Mahasiswa
    private String nama;
    // Nim Mahasiswa
    private int nim;
    // Program Studi Mahasiswa
    private String prodi;
    // Fakultas Mahasiswa
    private String fakultas;

    Mahasiswa(){} // konstruktor Mahasiswa

    Mahasiswa(String nama,int nim, String prodi, String fakultas) {
        // konstruktor langsung isi attribut
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    // Setter and Getter methods for private attributes

    // Set Nama
    public void setNama(String namaMahasiswa) {
        this.nama = namaMahasiswa;
    }

    // Get Nama
    public String getNama() {
        return nama;
    }

    // Set Nim
    public void setNim(int nimMahasiswa) {
        this.nim = nimMahasiswa;
    }

    // Get Nim
    public int getNim() {
        return nim;
    }

    // Set Prodi
    public void setProdi(String programStudi) {
        this.prodi = programStudi;
    }

    // Get Prodi
    public String getProdi() {
        return prodi;
    }
    
    // Set Fakultas
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Get Fakultas
    public String getFakultas() {
        return this.fakultas;
    }
}