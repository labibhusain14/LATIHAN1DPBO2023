public class Table {
    private int baris;
    // banyaknya baris
    private int kolom;
    // banyaknya kolom

    Table() {} // konstruktor Table
    Table(int baris, int kolom) {
        // konstruktor langsung isi attribut
        this.baris = baris;
        this.kolom = kolom;
    }

    // Setter and Getter methods for private attributes
    // Set Baris
    public void setBaris(int baris) {
        this.baris = baris;
    }

    // Get Baris
    public int getBaris() {
        return baris;
    }

    // Set Kolom
    public void setKolom(int kolom) {
        this.kolom = kolom;
    }

    // Get Kolom
    public int getKolom() {
        return kolom;
    }

    // Membuat Metode untuk buat tabel
    public void buatBaris(String[] isi, int batas, int idx, int name, int nim, int prodi, int fakultas) {
        int i = 0, j = 0;

        // jika index = 0 (membuat kerangka tabel atas)
        if(idx == 0){
            System.out.print("+");
            // Membuat perulangan sebanyak 5x (banyak jumlah elemen dalam 1 baris)
            for(i=0; i < isi.length; i++) {
                // jika i = 0
                if(i == 0){
                    // Membuat perulangan sebanyak 4x("No" + 2spasi)
                    for(j=0; j < 4; j++) {
                        System.out.print("-");
                    }
                }
                // jika i = 1
                if(i == 1){
                System.out.print("+");
                    // Membuat perulangan sebanyak kata terpanjang pada baris nama + 2spasi
                    for(j=0; j < name + 2; j++) {
                        System.out.print("-");
                    }
                }
                // jika i = 2
                if(i == 2){
                    System.out.print("+");
                    // Membuat perulangan sebanyak kata terpanjang pada baris Nim + 2spasi
                    for(j=0; j < nim + 2; j++) {
                        System.out.print("-");
                    }
                }
                // jika i = 3
                if(i == 3){
                    System.out.print("+");
                    // Membuat perulangan sebanyak kata terpanajgn pada baris prodi + 2spasi
                    for(j=0; j < prodi + 2; j++) {
                        System.out.print("-");
                    }
                }
                // jika i = 4
                if(i == 4){
                    System.out.print("+");
                    // Membuat perulangan sebanyak kata terpanajgn pada fakultas + 2spasi
                    for(j=0; j < fakultas + 2; j++) {
                        System.out.print("-");
                    }
                }
            }
            System.out.print("+");
            System.out.println("");
        }

        // Membuat baris untuk jdul
        if (idx == 0){
            System.out.print("|No  ");
            System.out.print("|Nama");
            for (j=0 ; j < name - 2 ; j++){//Membuat perulangan sesuai dengan kata terpanjang
                System.out.print(" "); //meminta uoutputan berupa spasi 
            }
            System.out.print("|NIM");
            for (j=0 ; j < nim - 1 ; j++){//Membuat perulangan sesuai dengan kata terpanjang
                System.out.print(" "); //meminta uoutputan berupa spasi 
            }
            System.out.print("|Prodi");
            for (j=0 ; j < prodi - 3 ; j++){//Membuat perulangan sesuai dengan kata terpanjang
                System.out.print(" "); //meminta uoutputan berupa spasi 
            }
            System.out.print("|Fakultas");
            for (j=0 ; j < fakultas - 6 ; j++){//Membuat perulangan sesuai dengan kata terpanjang
                System.out.print(" "); //meminta uoutputan berupa spasi 
            }
            System.out.print("|");     
            System.out.println("");
        }

        // jika index = 0 (membuat kerangka tabel bawah judul)
        if(idx == 0){
            System.out.print("+");
            for(i=0; i < isi.length; i++) {
                if(i == 0){
                    for(j=0; j < 4; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 1){
                System.out.print("+");
                    for(j=0; j < name + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 2){
                    System.out.print("+");
                    for(j=0; j < nim + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 3){
                    System.out.print("+");
                    for(j=0; j < prodi + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 4){
                    System.out.print("+");
                    for(j=0; j < fakultas + 2; j++) {
                        System.out.print("-");
                    }
                }
            }
            System.out.print("+");
            System.out.println("");
        }

        // buat baris isi
        for(i=0; i < isi.length; i++) {
            if(i == 0){
                System.out.print("|" + isi[i] + "   ");
            }
            else if(i == 1){
                System.out.print("|" + isi[i]);
                for (j=0 ; j < name - isi[i].length() + 2 ; j++){//Membuat perulangan sesuai dengan kata terpanjang
                    System.out.print(" "); //meminta uoutputan berupa spasi 
                }
            }
            else if(i == 2){
                System.out.print("|" + isi[i]);
                for (j=0 ; j < nim - isi[i].length() + 2 ; j++){//Membuat perulangan sesuai dengan kata terpanjang
                    System.out.print(" "); //meminta uoutputan berupa spasi 
                }
            }
            else if(i == 3){
                System.out.print("|" + isi[i]);
                for (j=0 ; j < prodi - isi[i].length() + 2 ; j++){//Membuat perulangan sesuai dengan kata terpanjang
                    System.out.print(" "); //meminta uoutputan berupa spasi 
                }
            }
            else if(i == 4){
                System.out.print("|" + isi[i]);
                for (j=0 ; j < fakultas - isi[i].length() + 2 ; j++){//Membuat perulangan sesuai dengan kata terpanjang
                    System.out.print(" "); //meminta uoutputan berupa spasi 
                }
            }
            if(i == isi.length - 1){
                System.out.print("|");
            }
        }
        System.out.println("");

        // Membuat kerangka tabel pada baris terakhir
        if(idx == batas - 1) {
            System.out.print("+");
            for(i=0; i < isi.length; i++) {
                if(i == 0){
                    for(j=0; j < 4; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 1){
                    System.out.print("+");
                    for(j=0; j < name + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 2){
                    System.out.print("+");
                    for(j=0; j < nim + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 3){
                    System.out.print("+");
                    for(j=0; j < prodi + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 4){
                    System.out.print("+");
                    for(j=0; j < fakultas + 2; j++) {
                        System.out.print("-");
                    }
                }
            }
            System.out.print("+");
            System.out.println("");
        }
    }
}