// Import library and file.
#include <iostream>
#include <bits/stdc++.h>
#include "Mahasiswa.cpp"
#include "Table.cpp"
#include <cmath>
#include <string>

// Using standard namespace.
using namespace std;
int main()
{
    /*
        ------------ Membuat Variabel ----------------
        - nomor = variabel untuk mengatur menu
        - namaMhs,nimMhs, prodiMhs, fakultasMhs = String untuk menyimpan nilai sementara dari masing2 nilai
        - display = variable utk mengatur jalannya program
        - idx = sebagai index nilai (indek update / delete)
        - max = sebagai batas inputan menu tambah
        - llist = list yang berisi objek dari kelas Mahasiswa
    */
    int nomor = 0;
    string namaMhs, prodiMhs, fakultasMhs;
    int display = 0;
    int idx = 0;
    int nimMhs = 0;
    int max = 0;
    list<Mahasiswa> llist;

    // Tampilan untuk pilihan menu
    cout << "--------- Silahkan Pilih Menu ---------" << endl;
    cout << "[1] Tambah Data" << endl;
    cout << "[2] Ubah Data" << endl;
    cout << "[3] Hapus Data" << endl;
    cout << "[4] Tampil Data" << endl;
    cout << "[5] Keluar"
         << "\n";

    // Program akan terus berjalan sampai display != 0
    while (display == 0)
    {
        // Scan nomor pada menu
        cout << "\n"
             << "Latihan DPBO> ";
        cin >> nomor;

        // jika pilih menu nomor 1
        if (nomor == 1)
        {
            // Scan banyak mahasiswa yang ingin di input
            cout << "Latihan DPBO> ";
            cout << "Jumlah Mahasiswa : ";
            cin >> max;

            // Looping sebanyak max
            for (int i = 0; i < max; i++)
            {
                // Mendata per-Mahasiswa
                cout << "-----------------------------------------" << endl;
                cout << "Latihan DPBO> ";
                cout << "Data Mahasiswa ke-" << i + 1 << endl;

                // Meminta scan nama
                cout << "Latihan DPBO> ";
                cout << "Masukkan Nama : ";
                // digunakan untuk membuang whitespace yang tersisa dalam buffer input sebelum memanggil getline()
                getline(cin >> ws, namaMhs);

                // Meminta scan nim
                cout << "Latihan DPBO> ";
                cout << "Masukkan NIM : ";
                cin >> nimMhs;

                // Meminta scan prodi
                cout << "Latihan DPBO> ";
                cout << "Masukkan Program Studi: ";
                getline(cin >> ws, prodiMhs);

                // Meminta scan fakultas
                cout << "Latihan DPBO> ";
                cout << "Masukkan Fakultas : ";
                getline(cin >> ws, fakultasMhs);

                // Membuat objek sementara
                Mahasiswa temp;

                // Masukkan input ke objek sementara
                temp.setNama(namaMhs);
                temp.setNim(nimMhs);
                temp.setProdi(prodiMhs);
                temp.setFakultas(fakultasMhs);

                // Masukkan objek sementara ke daftar list
                llist.push_back(temp);
            }
            // print ketika berhasil menambah data
            cout << max << " Data has been successfully entered!" << endl;
        }
        // jika pilih menu nomor 1
        else if (nomor == 2)
        {
            // Ketika terdapat elemen dalam list
            if (llist.size() > 0)
            {
                // Scan idx untuk mahasiswa yang ingin diubah datanya
                cout << "Latihan DPBO> ";
                cout << "Silahkan isi nomor data mahasiswa yang ingin diubah : ";
                cin >> idx;

                // Jika idx yang diberikan merupakan bagian dari daftar list
                if (idx <= llist.size())
                {
                    // Meminta scan nama
                    cout << "Latihan DPBO> ";
                    cout << "Masukkan Nama : ";
                    getline(cin >> ws, namaMhs);

                    // Meminta scan nim
                    cout << "Latihan DPBO> ";
                    cout << "Masukkan NIM : ";
                    cin >> nimMhs;

                    // Meminta scan prodi
                    cout << "Latihan DPBO> ";
                    cout << "Masukkan Program Studi: ";
                    getline(cin >> ws, prodiMhs);

                    // Meminta scan fakultas
                    cout << "Latihan DPBO> ";
                    cout << "Masukkan Fakultas : ";
                    getline(cin >> ws, fakultasMhs);

                    // print ketika berhasil mengubah data
                    cout << "Data Updated Succesfully" << endl;

                    auto iter = llist.begin(); // inisialisasi iterator pada awal list
                    advance(iter, idx - 1);    // memindahkan iterator ke posisi ke-(idx-1)

                    // ubah isi nilai untuk masing2 nilai
                    iter->setNama(namaMhs);
                    iter->setNim(nimMhs);
                    iter->setProdi(prodiMhs);
                    iter->setFakultas(fakultasMhs);
                }
                // Jika idx yang diberikan merupakan bukan bagian dari daftar list
                else
                    cout << "There is no data list yet, please fill in the data list first!" << endl;
            }
            // JIka tidak ada elemn dalam list
            else
                cout << "There is no data list yet, please fill in the data list first!" << endl;
        }
        // jika pilih menu nomor 3 (Delete)
        else if (nomor == 3)
        {
            // Ketika terdapat elemen dalam list
            if (llist.size() > 0)
            {
                // Scan idx untuk mahasiswa yang ingin dihapus datanya
                cout << "Latihan DPBO> ";
                cout << "Silahkan isi nomor data mahasiswa yang ingin dihapus : ";
                cin >> idx;

                // Jika idx yang diberikan merupakan bagian dari daftar list
                if (idx <= llist.size())
                {
                    auto iter = llist.begin(); // inisialisasi iterator pada awal list
                    advance(iter, idx - 1);    // memindahkan iterator ke posisi ke-(idx-1)
                    // Hapus data
                    llist.erase(iter);

                    // print ketika berhasil megnhapus data
                    cout << "Data Deleted Succesfully" << endl;
                }
                // Jika idx yang diberikan bukan bagian dari daftar list
                else
                    cout << "There is no data list yet, please fill in the data list first!" << endl;
            }
            // JIka tidak ada elemn dalam list
            else
                cout << "There is no data list yet, please fill in the data list first!" << endl;
        }
        // jika pilih menu nomor 3 (Tampil)
        else if (nomor == 4)
        {
            // Ketika terdapat elemen dalam list
            if (llist.size() > 0)
            {
                /*
                Membuat objek tab dari kelas Table dengan panjang
                baris sesuai dengan jumlah elemen dalam list dan kolom sebesar 5
                */
                Table tab = Table(llist.size(), 5);
                int maxName = 4;     // "nama" = 4
                int maxNim = 3;      //  "nim" = 3
                int maxProdi = 5;    // "prodi" = 5
                int maxFakultas = 8; // "fakultas" = 8
                int i = 0;

                // Perulangan untuk mencaari yang terpanjang pada baris nama
                for (list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++)
                {
                    if (maxName < it->getNama().length())
                    {
                        maxName = it->getNama().length();
                    }
                }

                // Perulangan untuk mencaari yang terpanjang pada baris nim
                for (list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++)
                {
                    int panjangNimString = log10(it->getNim());

                    if (maxNim < panjangNimString)
                    {
                        maxNim = panjangNimString;
                    }
                }

                // Perulangan untuk mencaari yang terpanjang pada baris prodi
                for (list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++)
                {
                    if (maxProdi < it->getProdi().length())
                    {
                        maxProdi = it->getProdi().length();
                    }
                }

                // Perulangan untuk mencaari yang terpanjang pada baris fakultas
                for (list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++)
                {
                    if (maxFakultas < it->getFakultas().length())
                    {
                        maxFakultas = it->getFakultas().length();
                    }
                }

                i = 0; // inisialisasi nilai i
                // Membuat perulangan untuk menampilkan output beserta tabel
                for (list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++)
                {
                    // Membuat array untuk elemen yang mau di print
                    string arrstr[5];
                    // Memasukan setiap elemen ke dalam array
                    arrstr[0] = to_string(i + 1); // mengubah i+1 menjadi string
                    arrstr[1] = it->getNama();
                    arrstr[2] = to_string(it->getNim()); // mengubah i+1 menjadi string
                    arrstr[3] = it->getProdi();
                    arrstr[4] = it->getFakultas();

                    // Memanggil metode buat baris
                    tab.buatBaris(arrstr, llist.size(), i, maxName, maxNim, maxProdi, maxFakultas);
                    i++; // iterasi i
                }
            }
            // jika tidak ada elemen dalam list
            else
                cout << "There is no data list yet, please fill in the data list first!" << endl;
        }
        // jika pilih menu nomor 5 (keluar) -> dispay =1
        else if (nomor == 5)
        {
            cout << "Thank You for Using This Program!!" << endl;
            display = 1;
        }
        // Jika nomor yang dipilih tidak ada dalam menu
        else
            cout << "The menu does not exist, please select the menu correctly!" << endl;
    }
}
