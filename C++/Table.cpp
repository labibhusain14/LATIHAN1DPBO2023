// Import library.
#include <iostream>
#include <string>
// Using standard namespace.
using namespace std;

// Membuat kelas Table
class Table
{
private:
    // banyaknya baris
    int baris;
    // banyaknya kolom
    int kolom;

public:
    Table() {} // konstruktor Table
    Table(int baris, int kolom)
    {
        // konstruktor langsung isi attribut
        this->baris = baris;
        this->kolom = kolom;
    }

    // Setter and Getter methods for private attributes
    // Set Baris
    void setBaris(int baris)
    {
        this->baris = baris;
    }

    // Get Baris
    int getBaris()
    {
        return baris;
    }

    // Set Kolom
    void setKolom(int kolom)
    {
        this->kolom = kolom;
    }

    // Get Kolom
    int getKolom()
    {
        return kolom;
    }

    // Membuat Metode untuk buat tabel
    void buatBaris(string isi[], int batas, int idx, int name, int nim, int prodi, int fakultas)
    {
        int i = 0, j = 0;

        // jika index = 0 (membuat kerangka tabel atas)
        if (idx == 0)
        {
            cout << "+";
            // Membuat perulangan sebanyak 5x (banyak jumlah elemen dalam 1 baris)
            for (i = 0; i < 5; i++)
            {
                // jika i = 0
                if (i == 0)
                {
                    // Membuat perulangan sebanyak 4x("No" + 2spasi)
                    for (j = 0; j < 4; j++)
                    {
                        cout << "-";
                    }
                }
                // jika i = 0
                if (i == 1)
                {
                    cout << "+";
                    // Membuat perulangan sebanyak kata terpanjang pada baris nama + 2spasi
                    for (j = 0; j < name + 2; j++)
                    {
                        cout << "-";
                    }
                }
                // jika i = 2
                if (i == 2)
                {
                    cout << "+";
                    // Membuat perulangan sebanyak kata terpanjang pada baris Nim + 2spasi
                    for (j = 0; j < nim + 2; j++)
                    {
                        cout << "-";
                    }
                }
                // jika i = 3
                if (i == 3)
                {
                    cout << "+";
                    // Membuat perulangan sebanyak kata terpanajgn pada baris prodi + 2spasi
                    for (j = 0; j < prodi + 2; j++)
                    {
                        cout << "-";
                    }
                }
                // jika i = 4
                if (i == 4)
                {
                    cout << "+";
                    // Membuat perulangan sebanyak kata terpanajgn pada fakultas + 2spasi
                    for (j = 0; j < fakultas + 2; j++)
                    {
                        cout << "-";
                    }
                }
            }
            cout << "+";
            cout << "" << endl;
        }

        // Membuat baris untuk jdul
        if (idx == 0)
        {
            cout << "|No  ";
            cout << "|Nama";
            for (j = 0; j < name - 2; j++)
            {
                // meminta uoutputan berupa spasi
                cout << " ";
            }
            cout << "|NIM";
            for (j = 0; j < nim - 1; j++)
            {
                // meminta uoutputan berupa spasi
                cout << " ";
            }
            cout << "|Prodi";
            for (j = 0; j < prodi - 3; j++)
            {
                // meminta uoutputan berupa spasi
                cout << " ";
            }
            cout << "|Fakultas";
            for (j = 0; j < fakultas - 6; j++)
            {
                // meminta uoutputan berupa spasi
                cout << " ";
            }
            cout << "|";
            cout << "" << endl;
        }
        // jika index = 0 (membuat kerangka tabel bawah judul)
        if (idx == 0)
        {
            cout << "+";
            for (i = 0; i < 5; i++)
            {
                if (i == 0)
                {
                    for (j = 0; j < 4; j++)
                    {
                        cout << "-";
                    }
                }
                if (i == 1)
                {
                    cout << "+";
                    for (j = 0; j < name + 2; j++)
                    {
                        cout << "-";
                    }
                }
                if (i == 2)
                {
                    cout << "+";
                    for (j = 0; j < nim + 2; j++)
                    {
                        cout << "-";
                    }
                }
                if (i == 3)
                {
                    cout << "+";
                    for (j = 0; j < prodi + 2; j++)
                    {
                        cout << "-";
                    }
                }
                if (i == 4)
                {
                    cout << "+";
                    for (j = 0; j < fakultas + 2; j++)
                    {
                        cout << "-";
                    }
                }
            }
            cout << "+";
            cout << "" << endl;
        }
        // buat baris isi
        for (i = 0; i < 5; i++)
        {
            if (i == 0)
            {
                cout << "|" + isi[i] + "   ";
            }
            else if (i == 1)
            {
                cout << "|" + isi[i];
                for (j = 0; j < name - isi[i].length() + 2; j++)
                {
                    cout << " ";
                }
            }
            else if (i == 2)
            {
                cout << "|" + isi[i];
                for (j = 0; j < nim - isi[i].length() + 2; j++)
                {
                    cout << " ";
                }
            }
            else if (i == 3)
            {
                cout << "|" + isi[i];
                for (j = 0; j < prodi - isi[i].length() + 2; j++)
                {
                    cout << " ";
                }
            }
            else if (i == 4)
            {
                cout << "|" + isi[i];
                for (j = 0; j < fakultas - isi[i].length() + 2; j++)
                {
                    cout << " ";
                }
            }
            if (i == 5 - 1)
            {
                cout << "|";
            }
        }
        cout << "" << endl;

        // Membuat kerangka tabel pada baris terakhir
        if (idx == batas - 1)
        {
            cout << "+";
            for (i = 0; i < 5; i++)
            {
                if (i == 0)
                {
                    for (j = 0; j < 4; j++)
                    {
                        cout << "-";
                    }
                }
                if (i == 1)
                {
                    cout << "+";
                    for (j = 0; j < name + 2; j++)
                    {
                        cout << "-";
                    }
                }
                if (i == 2)
                {
                    cout << "+";
                    for (j = 0; j < nim + 2; j++)
                    {
                        cout << "-";
                    }
                }
                if (i == 3)
                {
                    cout << "+";
                    for (j = 0; j < prodi + 2; j++)
                    {
                        cout << "-";
                    }
                }
                if (i == 4)
                {
                    cout << "+";
                    for (j = 0; j < fakultas + 2; j++)
                    {
                        cout << "-";
                    }
                }
            }
            cout << "+";
            cout << "" << endl;
        }
    }

    // Destruktor
    ~Table()
    {
    }
};