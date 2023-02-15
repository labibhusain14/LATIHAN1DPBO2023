# Import library and file.
from Mahasiswa import Mahasiswa
from Table import Table

# ------------ Membuat Variabel ----------------
# - nomor = variabel untuk mengatur menu
# - namaMhs,nimMhs, prodiMhs, fakultasMhs = String untuk menyimpan nilai sementara dari masing2 nilai
# - display = variable utk mengatur jalannya program
# - idx = sebagai index nilai (indek update / delete)
# - max = sebagai batas inputan menu tambah
# - Mahasiswaa = list yang berisi objek dari kelas Mahasiswa

nomor = 0
namaMhs = ""
prodiMhs = ""
fakultasMhs = ""
display = 0
idx = 0
nimMhs = 0
max = 0
Mahasiswaa = []

# Tampilan untuk pilihan menu
print("--------- Silahkan Pilih Menu ---------")
print("[1] Tambah Data")
print("[2] Ubah Data")
print("[3] Hapus Data")
print("[4] Tampil Data")
print("[5] Keluar")


# Program akan terus berjalan sampai display != 0
while display == 0:
    # Scan nomor pada menu
    print("\nLatihan DPBO> ", end='')
    nomor = int(input())

    # jika pilih menu nomor 1
    if nomor == 1:
        # Scan banyak mahasiswa yang ingin di input
        print("Latihan DPBO> Jumlah Mahasiswa : ", end='')
        max = int(input())

        # Looping sebanyak max
        for i in range(max):
            # Mendata per-Mahasiswa
            print("-----------------------------------------")
            print("Latihan DPBO> Data Mahasiswa ke-", i+1)

            # Meminta scan nama
            print("Latihan DPBO> Masukkan Nama : ", end='')
            namaMhs = str(input())

            # Meminta scan nim
            print("Latihan DPBO> Masukkan NIM : ", end='')
            nimMhs = int(input())

            # Meminta scan prodi
            print("Latihan DPBO> Masukkan Program Studi: ", end='')
            prodiMhs = str(input())

            # Meminta scan fakultas
            print("Latihan DPBO> Masukkan Fakultas : ", end='')
            fakultasMhs = str(input())

            # Masukkan inputan ke dalam list untuk kelas mahasiswa
            Mahasiswaa.append(
                Mahasiswa(namaMhs, nimMhs, prodiMhs, fakultasMhs))
        # print ketika berhasil menambah data
        print(max, "Data has been successfully entered!")
    # jika pilih menu nomor 2
    elif nomor == 2:
        # Ketika terdapat elemen dalam list
        if len(Mahasiswaa) > 0:
            print(
                # Scan idx untuk mahasiswa yang ingin diubah datanya
                "Latihan DPBO> Silahkan isi nomor data mahasiswa yang ingin diubah : ",  end='')
            idx = int(input())

            # Jika idx yang diberikan merupakan bagian dari daftar list
            if idx <= len(Mahasiswaa):

                # Meminta scan nama
                print("Latihan DPBO> Masukkan Nama : ", end='')
                namaMhs = input()

                # Meminta scan nim
                print("Latihan DPBO> Masukkan NIM : ", end='')
                nimMhs = int(input())

                # Meminta scan prodi
                print("Latihan DPBO> Masukkan Program Studi: ", end='')
                prodiMhs = input()

                # Meminta scan fakultas
                print("Latihan DPBO> Masukkan Fakultas : ", end='')
                fakultasMhs = input()

                # print ketika berhasil mengubah data
                print("Data Updated Succesfully")

                # ubah isi nilai untuk masing2 nilai
                Mahasiswaa[idx-1].setNama(namaMhs)
                Mahasiswaa[idx-1].setNim(nimMhs)
                Mahasiswaa[idx-1].setProdi(prodiMhs)
                Mahasiswaa[idx-1].setFakultas(fakultasMhs)
            else:
                # Jika idx yang diberikan merupakan bukan bagian dari daftar list
                print(
                    "There is no data list yet, please fill in the data list first!")
        # JIka tidak ada elemn dalam list
        else:
            print(
                "There is no data list yet, please fill in the data list first!")
    # jika pilih menu nomor 3
    elif nomor == 3:
        # Ketika terdapat elemen dalam list
        if len(Mahasiswaa) > 0:
            # Scan idx untuk mahasiswa yang ingin dihapus datanya
            print(
                "Latihan DPBO> Silahkan isi nomor data mahasiswa yang ingin dihapus : ", end='')
            idx = int(input())

            # Jika idx yang diberikan merupakan bagian dari daftar list
            if idx <= len(Mahasiswaa):
                # Hapus data sesuai index
                Mahasiswaa.pop(idx-1)
                # print ketika berhasil megnhapus data
                print("Data Deleted Succesfully")
            else:
                # Jika idx yang diberikan bukan bagian dari daftar list
                print(
                    "There is no data list yet, please fill in the data list first!")
        else:
            # JIka tidak ada elemn dalam list
            print(
                "There is no data list yet, please fill in the data list first!")
    # Jika pilih menu nomor 4
    elif nomor == 4:
        # Ketika terdapat elemen dalam list
        if len(Mahasiswaa) > 0:
            # Membuat objek tab dari kelas Table dengan panjang
            # baris sesuai dengan jumlah elemen dalam list dan kolom sebesar 5
            tab = Table(len(Mahasiswaa), 5)
            maxName = 4     # "nama" = 4
            maxNim = 3  # "nim" = 3
            maxProdi = 5    # "prodi" = 5
            maxFakultas = 8  # "fakultas" = 8

            # Perulangan untuk mencaari yang terpanjang pada baris nama
            for mhs in Mahasiswaa:
                if maxName < len(mhs.getNama()):
                    maxName = len(mhs.getNama())
            # Perulangan untuk mencaari yang terpanjang pada baris nim
            for mhs in Mahasiswaa:
                if maxNim < len(str(mhs.getNim())):
                    maxNim = len(str(mhs.getNim()))
            # Perulangan untuk mencaari yang terpanjang pada baris prodi
            for mhs in Mahasiswaa:
                if maxProdi < len(mhs.getProdi()):
                    maxProdi = len(mhs.getProdi())
            # Perulangan untuk mencaari yang terpanjang pada baris fakultas            for mhs in Mahasiswaa:
                if maxFakultas < len(mhs.getFakultas()):
                    maxFakultas = len(mhs.getFakultas())

            i = 0  # inisialisasi nilai i
            # Membuat perulangan untuk menampilkan output beserta tabel
            for mhs in Mahasiswaa:
                # Membuat list untuk elemen yang mau di print
                llist = []
                # Memasukan setiap elemen ke dalam list
                llist.insert(0, str(i+1))
                llist.insert(1, mhs.getNama())
                llist.insert(2, str(mhs.getNim()))
                llist.insert(3, mhs.getProdi())
                llist.insert(4, mhs.getFakultas())

                # Memanggil metode buat baris
                tab.buatBaris(llist, len(Mahasiswaa), i, maxName,
                              maxNim, maxProdi, maxFakultas)
                i += 1  # iteasi i
        else:
            print("There is no data list yet, please fill in the data list first!")
    # jika pilih menu nomor 5
    elif nomor == 5:
        print("Thank You for Using This Program!!")
        display = 1
    # jika pilih nomor yang tidak ada di menu
    else:
        print("The menu does not exist, please select the menu correctly!")
