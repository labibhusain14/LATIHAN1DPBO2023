// Import library.
#include <iostream>
#include <string>
// Using standard namespace.
using namespace std;

// membuat kelas Mahasiswa
class Mahasiswa
{
private:
    // Membuat Private attributes.
    string nama;
    int nim;
    string prodi;
    string fakultas;

public:
    Mahasiswa() {} // konstruktor Mahasiswa
    Mahasiswa(string nama, int nim, string prodi, string fakultas)
    {
        // konstruktor langsung isi attribut
        this->nama = nama;
        this->nim = nim;
        this->prodi = prodi;
        this->fakultas = fakultas;
    }

    // Setter and Getter methods for private attributes
    // Set Nama
    void setNama(string namaMahasiswa)
    {
        this->nama = namaMahasiswa;
    }

    // Get Nama
    string getNama()
    {
        return nama;
    }

    // Set Nim
    void setNim(int nimMahasiswa)
    {
        this->nim = nimMahasiswa;
    }

    // Get Nim
    int getNim()
    {
        return nim;
    }

    // Set Prodi
    void setProdi(string programStudi)
    {
        this->prodi = programStudi;
    }

    // Get Prodi
    string getProdi()
    {
        return prodi;
    }

    // Set Fakultas
    void setFakultas(string fakultas)
    {
        this->fakultas = fakultas;
    }

    // Get Fakultas
    string getFakultas()
    {
        return this->fakultas;
    }

    // Destruktor
    ~Mahasiswa()
    {
    }
};