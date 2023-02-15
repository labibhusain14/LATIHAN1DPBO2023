<?php
class Mahasiswa
{
    // Membuat atribut Private dari kelas Mahasiswa
    private $nama = '';
    private $nim = '';
    private $prodi = '';
    private $fakultas = '';
    private $image;

    # Constructor with default initialization
    public function __construct($nama = '', $nim = '', $prodi = '', $fakultas = '', $image)
    {
        $this->nama = $nama;
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
        $this->image = $image;
    }

    # Setter and Getter methods for private attributes

    # Set Nama
    public function setNama($namaMahasiswa)
    {
        $this->nama = $namaMahasiswa;
    }

    # Get Nama
    public function getNama()
    {
        return $this->nama;
    }

    # Set Nim
    public function setNim($nimMahasiswa)
    {
        $this->nim = $nimMahasiswa;
    }

    # Get Nim
    public function getNim()
    {
        return $this->nim;
    }

    # Set Prodi
    public function setProdi($programStudi)
    {
        $this->prodi = $programStudi;
    }

    # Get Prodi
    public function getProdi()
    {
        return $this->prodi;
    }

    # Set Fakultas
    public function setFakultas($fakultas)
    {
        $this->fakultas = $fakultas;
    }

    # Get Fakultas
    public function getFakultas()
    {
        return $this->fakultas;
    }

    # Set Image
    public function setImage($image)
    {
        $this->image = $image;
    }

    # Get Image
    public function getImage()
    {
        return $this->image;
    }
}
