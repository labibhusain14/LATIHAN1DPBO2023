# Membuat kelas table
class Table:
    # Membuat atribut Private
    # banyaknya baris dan kolom
    __baris = 0
    __kolom = 0

    # Constructor with default initialization
    def __init__(self, baris=0, kolom=0):
        self.__baris = baris
        self.__kolom = kolom

    # Setter and Getter methods for private attributes
    # Set Baris
    def setBaris(self, baris):
        self.__baris = baris

    # Get Baris
    def getBaris(self):
        return self.__baris

    # Set KOlom
    def setKolom(self, kolom):
        self.__kolom = kolom

    # Get KOlom
    def getKolom(self):
        return self.__kolom

    # Membuat Metode untuk buat tabel
    def buatBaris(self, isi, batas, idx, name, nim, prodi, fakultas):
        i = 0
        j = 0

        # buat table bagian atas
        if idx == 0:
            print("+", end="")
            for i in range(5):
                if i == 0:
                    for j in range(4):
                        print("-", end="")
                if i == 1:
                    print("+", end="")
                    for j in range(name + 2):
                        print("-", end="")
                if i == 2:
                    print("+", end="")
                    for j in range(nim + 2):
                        print("-", end="")
                if i == 3:
                    print("+", end="")
                    for j in range(prodi + 2):
                        print("-", end="")
                if i == 4:
                    print("+", end="")
                    for j in range(fakultas + 2):
                        print("-", end="")
            print("+")

        # buat baris untuk judul
        if idx == 0:
            print("|No  ", end="")
            print("|Nama", end="")
            for j in range(name - 2):
                print(" ", end="")
            print("|NIM", end="")
            for j in range(nim - 1):
                print(" ", end="")
            print("|Prodi", end="")
            for j in range(prodi - 3):
                print(" ", end="")
            print("|Fakultas", end="")
            for j in range(fakultas - 6):
                print(" ", end="")
            print("|")

        # buat kerangka tabel bawah judul
        if idx == 0:
            print("+", end="")
            for i in range(5):
                if i == 0:
                    for j in range(4):
                        print("-", end="")
                if i == 1:
                    print("+", end="")
                    for j in range(name + 2):
                        print("-", end="")
                if i == 2:
                    print("+", end="")
                    for j in range(nim + 2):
                        print("-", end="")
                if i == 3:
                    print("+", end="")
                    for j in range(prodi + 2):
                        print("-", end="")
                if i == 4:
                    print("+", end="")
                    for j in range(fakultas + 2):
                        print("-", end="")
            print("+")

        # buat baris isi
        for i in range(5):
            if i == 0:
                print("|" + isi[i] + "   ", end="")
            elif i == 1:
                print("|" + isi[i], end="")
                for j in range(name - len(isi[i]) + 2):
                    print(" ", end="")
            elif i == 2:
                print("|" + isi[i], end="")
                for j in range(nim - len(isi[i]) + 2):
                    print(" ", end="")
            elif i == 3:
                print("|" + isi[i], end="")
                for j in range(prodi - len(isi[i]) + 2):
                    print(" ", end="")
            elif i == 4:
                print("|" + isi[i], end="")
                for j in range(fakultas - len(isi[i]) + 2):
                    print(" ", end="")
            if i == (5 - 1):
                print("|", end="")
        print("")

        # Membuat kerangka tabel pada baris tearkhir
        if idx == batas - 1:
            print("+", end="")
            for i in range(5):
                if i == 0:
                    for j in range(4):
                        print("-", end="")
                if i == 1:
                    print("+", end="")
                    for j in range(name + 2):
                        print("-", end="")
                if i == 2:
                    print("+", end="")
                    for j in range(nim + 2):
                        print("-", end="")
                if i == 3:
                    print("+", end="")
                    for j in range(prodi + 2):
                        print("-", end="")
                if i == 4:
                    print("+", end="")
                    for j in range(fakultas + 2):
                        print("-", end="")
            print("+")
