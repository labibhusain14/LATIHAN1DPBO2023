// Import library
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
            ------------ Membuat Variabel ----------------
            - nomor = variabel untuk mengatur menu
            - namaMhs,nimMhs, prodiMhs, fakultasMhs = String untuk menyimpan nilai sementara dari masing2 nilai
            - display = variable utk mengatur jalannya program
            - idx = sebagai index nilai (indek update / delete)
            - max = sebagai batas inputan menu tambah
            - list = list yang berisi objek dari kelas Mahasiswa
        */
        int nomor = 0;
        String namaMhs, prodiMhs, fakultasMhs;
        int display = 0;
        int idx = 0;
        int nimMhs = 0;
        int max = 0;
        ArrayList<Mahasiswa> list = new ArrayList<>();

        // Tampilan untuk pilihan menu
        System.out.println("--------- Silahkan Pilih Menu ---------");
        System.out.println( "[1] Tambah Data");
        System.out.println( "[2] Ubah Data");
        System.out.println( "[3] Hapus Data");
        System.out.println( "[4] Tampil Data");
        System.out.println( "[5] Keluar");

        //Membuat scan
        Scanner scan = new Scanner(System.in);

        // Program akan terus berjalan sampai display != 0
        while(display == 0){    
            try {
                // Scan nomor pada menu
                System.out.print("\nLatihan DPBO> ");
                nomor = scan.nextInt();
            } catch (Exception e) {
                //jika input bukan integer
                System.out.println( "Input yang diberikan bukan integer!\n");
                continue;
            }
            // buat longkap baris /biar sejajar
            scan.nextLine();

            // jika pilih menu nomor 1           
            if (nomor == 1){
                try {
                    // Scan banyak mahasiswa yang ingin di input
                    System.out.print("Latihan DPBO> ");
                    System.out.print("Jumlah Mahasiswa : ");
                    max = scan.nextInt();
                    scan.nextLine();

                    // Looping sebanyak max
                    for(int i = 0; i < max; i++){
                        // Mendata per-Mahasiswa
                        System.out.println("-----------------------------------------");
                        System.out.print("Latihan DPBO> ");
                        System.out.println("Data Mahasiswa ke-" + Integer.toString(i+1));

                        // Meminta scan nama
                        System.out.print("Latihan DPBO> ");
                        System.out.print("Masukkan Nama : ");
                        namaMhs = scan.nextLine();

                        // Meminta scan nim
                        System.out.print("Latihan DPBO> ");
                        System.out.print("Masukkan NIM : ");
                        nimMhs = scan.nextInt();
                        scan.nextLine();

                        // Meminta scan prodi
                        System.out.print("Latihan DPBO> ");
                        System.out.print("Masukkan Program Studi: ");
                        prodiMhs = scan.nextLine();

                        // Meminta scan fakultas
                        System.out.print("Latihan DPBO> ");
                        System.out.print("Masukkan Fakultas : ");
                        fakultasMhs = scan.nextLine(); 

                        // Membuat objek sementara
                        Mahasiswa temp = new Mahasiswa();

                        // Masukkan input ke objek sementara
                        temp.setNama(namaMhs); temp.setNim(nimMhs); temp.setProdi(prodiMhs); temp.setFakultas(fakultasMhs);
                        // Masukkan objek sementara ke daftar list
                        list.add(temp);
                    }
                } catch (Exception e) {
                    //jika bukan integer
                    System.out.println( "Terjadi kesalahan dalam membaca input!");
                    return;
                }
                // print ketika berhasil menambah data
                System.out.println( max + " Data has been successfully entered!");

            }
            // jika pilih menu nomor 2           
            else if(nomor == 2){
                // Ketika terdapat elemen dalam list
                if(list.size() > 0){
                    // Scan idx untuk mahasiswa yang ingin diubah datanya
                    System.out.print("Latihan DPBO> ");
                    System.out.print("Silahkan isi nomor data mahasiswa yang ingin diubah : ");
                    idx = scan.nextInt();
                    scan.nextLine();
                    
                    // Jika idx yang diberikan merupakan bagian dari daftar list
                    if(idx <= list.size()){
                        // Meminta scan nama
                        System.out.print("Latihan DPBO> ");
                        System.out.print("Masukkan Nama : ");
                        namaMhs = scan.nextLine();

                        // Meminta scan nim
                        System.out.print("Latihan DPBO> ");
                        System.out.print("Masukkan NIM : ");
                        nimMhs = scan.nextInt();
                        scan.nextLine();

                        // Meminta scan prodi
                        System.out.print("Latihan DPBO> ");
                        System.out.print("Masukkan Program Studi: ");
                        prodiMhs = scan.nextLine();

                        // Meminta scan fakultas
                        System.out.print("Latihan DPBO> ");
                        System.out.print("Masukkan Fakultas : ");
                        fakultasMhs = scan.nextLine(); 

                        // print ketika berhasil mengubah data
                        System.out.println("Data Updated Succesfully");

                        // Membuat objek sementara
                        Mahasiswa temp = new Mahasiswa();

                        // Masukkan input ke objek sementara
                        temp.setNama(namaMhs); temp.setNim(nimMhs); temp.setProdi(prodiMhs); temp.setFakultas(fakultasMhs);      

                        //Mengubah data sesuai index          
                        list.set(idx-1, temp);
                    }
                    // Jika idx yang diberikan bukan bagian dari daftar list
                    else System.out.println("There is no data list yet, please fill in the data list first!");
                }
                // JIka tidak ada elemn dalam list
                else System.out.println("There is no data list yet, please fill in the data list first!");
            }
            // jika pilih menu nomor 3           
            else if(nomor == 3){
                // Ketika terdapat elemen dalam list
                if(list.size() > 0){
                    // Scan idx untuk mahasiswa yang ingin dihapus datanya
                    System.out.print("Latihan DPBO> ");
                    System.out.print("Silahkan isi nomor data mahasiswa yang ingin dihapus : ");
                    idx = scan.nextInt();

                    // Jika idx yang diberikan merupakan bagian dari daftar list
                    if(idx <= list.size()){
                        //hapus sesuai index masukan
                        list.remove(idx-1);
                        // print ketika berhasil megnhapus data
                        System.out.println("Data Deleted Succesfully");
                    }
                    // Jika idx yang diberikan bukan bagian dari daftar list
                    else System.out.println("There is no data list yet, please fill in the data list first!");
                }
                // JIka tidak ada elemn dalam list
                else System.out.println("There is no data list yet, please fill in the data list first!");
            }             
            // jika pilih menu nomor 1           
            else if(nomor == 4){
                // Ketika terdapat elemen dalam list
                if(list.size() > 0){
                    /*
                    Membuat objek tab dari kelas Table dengan panjang
                    baris sesuai dengan jumlah elemen dalam list dan kolom sebesar 5
                    */
                    Table tab = new Table(list.size(), 5);
                    int maxName = 4; // "nama" = 4 
                    int maxNim = 3; //  "nim" = 3
                    int maxProdi = 5; // "prodi" = 5
                    int maxFakultas = 8; // "fakultas" = 8

                    // Perulangan untuk mencaari yang terpanjang pada baris nama
                    for(int i=0; i < list.size(); i++){
                        if (maxName < list.get(i).getNama().length()){ 
                            maxName = list.get(i).getNama().length(); 
                        }
                    }

                    // Perulangan untuk mencaari yang terpanjang pada baris nim
                    for(int i=0; i<list.size() ; i++){
                        String nimString = String.valueOf(list.get(i).getNim());
                        int panjangnimString = nimString.length();
                        if (maxNim < panjangnimString){ 
                            maxNim = panjangnimString; 
                        }
                    }

                    // Perulangan untuk mencaari yang terpanjang pada baris prodi
                    for(int i=0; i<list.size() ; i++){
                        if (maxProdi < list.get(i).getProdi().length()){ 
                            maxProdi = list.get(i).getProdi().length(); 
                        }
                    }

                    // Perulangan untuk mencaari yang terpanjang pada baris fakultas
                    for(int i=0; i<list.size() ; i++){
                        if (maxFakultas < list.get(i).getFakultas().length()){ 
                            maxFakultas = list.get(i).getFakultas().length(); 
                        }
                    }

                    // Membuat perulangan untuk menampilkan output beserta tabel
                    for(int i =0; i < list.size(); i++) {
                        // Membuat array untuk menampung elemen yang mau di print
                        String[] arrstr = new String[5];
                        arrstr[0] = "" + Integer.toString(i+1);
                        arrstr[1] = "" + list.get(i).getNama();
                        arrstr[2] = "" + list.get(i).getNim();
                        arrstr[3] = "" + list.get(i).getProdi();
                        arrstr[4] = "" + list.get(i).getFakultas();

                        // Memanggil metode buat baris
                        tab.buatBaris(arrstr, list.size(), i, maxName, maxNim, maxProdi, maxFakultas);
                    }
                }
                // jika tidak ada elemen dalam list
                else System.out.println("There is no data list yet, please fill in the data list first!");
            }            
            // jika pilih menu nomor 5           
            else if(nomor == 5){
                System.out.println("Thank You for Using This Program!!");
                display = 1;
            }
            // jika pilih noomr yang tidak ada di menu           
            else System.out.println("The menu does not exist, please select the menu correctly!");            
        }        


    }
}


