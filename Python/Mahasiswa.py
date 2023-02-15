# class Decalaration
class Mahasiswa:
    # Membuat Private attributes.
    __nama = ""
    __nim = 0
    __prodi = ""
    __fakultas = ""

    # Constructor with default initialization
    def __init__(self, nama="", nim=0, prodi="", fakultas=""):
        self.__nama = nama
        self.__nim = nim
        self.__prodi = prodi
        self.__fakultas = fakultas

    # Setter and Getter methods for private attributes
    # Set Nama
    def setNama(self, namaMahasiswa):
        self.__nama = namaMahasiswa

    # get Nama
    def getNama(self):
        return self.__nama

    # Set Nim
    def setNim(self, nimMahasiswa):
        self.__nim = nimMahasiswa

    # Get Nim
    def getNim(self):
        return self.__nim

    # Set Prodi
    def setProdi(self, programStudi):
        self.__prodi = programStudi

    # Get Prodi
    def getProdi(self):
        return self.__prodi

    # Set Fakultas
    def setFakultas(self, fakultas):
        self.__fakultas = fakultas

    # Get Fakultas
    def getFakultas(self):
        return self.__fakultas
