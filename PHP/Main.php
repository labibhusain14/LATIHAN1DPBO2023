<?php
// impor class mahasiswa
require('Mahasiswa.php');
// Read Data array
$mahasiswa = array(
	//Menambahkan beberapa data
	// Untuk Gambar Dapat diambil melalui gambar di internet
	new Mahasiswa('Ronaldo', 89876, 'Matematika', 'FPMIPA', "https://img.a.transfermarkt.technology/portrait/big/8198-1673305564.jpg?lm=1"),
	new Mahasiswa('Messi', 76546, 'Fisika', 'FPMIPA', "https://cdn0-production-images-kly.akamaized.net/16A3NQjrRo9iz4HREjmDDlo2dOM=/1200x1200/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/4265218/original/098933300_1671404343-20221219-Lionel-Messi-Pemain-Terbaik-Piala-Dunia-AP-4.jpg"),
	new Mahasiswa('Mbappe', 983123, 'Biologi', 'FPMIPA', "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDIML5mjNl1_YrpjT5bjG2wjo7q3BWJ73Ncw&usqp=CAU"),
	new Mahasiswa('Neymar', 4248429, 'Teknik Mesin', 'FPTK', "https://images.bisnis.com//upload/img/FjkVp7pXgAIgRvk.jpg")
);

// membuat array dari objek mahasiswa
foreach ($mahasiswa as $key => $value) {
	$data[] = array($key + 1, $value->getNama(), $value->getNim(), $value->getProdi(), $value->getFakultas(), '<img src="' . $value->getImage() . '" width="100" height="80">', '<a href="?delete=' . $key . '">Delete</a>');
}

// Hapus baris yang sesuai dari array jika parameter delete diberikan
if (isset($_GET['delete'])) {
	$index = $_GET['delete'];
	if (isset($mahasiswa[$index])) {
		unset($mahasiswa[$index]);
		foreach ($mahasiswa as $key => $value) {
			$data_deleted[] = array($key + 1, $value->getNama(), $value->getNim(), $value->getProdi(), $value->getFakultas(), '<img src="' . $value->getImage() . '" width="100" height="80">', '<a href="?delete=' . $key . '">Delete</a>');
		}
	}
}

//Membuat Tabel sebelum dihapus
echo "<h2>Data Mahasiswa</h2>";
echo "<table border='1' width='60%'>";

//Judul tabel 
echo "<tr>";
echo "<th> No </td>";
echo "<th> Nama </td>";
echo "<th> NIM </td>";
echo "<th> Prodi </td>";
echo "<th> Fakultas </td>";
echo "<th> Foto Profil </td>";
echo "<th> Aksi </td>";
echo "</tr>";

// Loop untuk menampilkan data array dalam bentuk tabel
foreach ($data as $row) {
	echo "<tr align=center>";
	foreach ($row as $cell) {
		echo "<td >" . $cell . "</td>";
	}
	echo "</tr>";
}
echo "</table>";

// Menampilkan tabel data mahasiswa yang sudah dihapus barisnya
if (isset($data_deleted)) {
	echo "<br>";
	echo "<h2>Data Mahasiswa Setelah Dihapus</h2>";
	echo "<table border='1' width='60%'>";

	//Judul tabel 
	echo "<tr>";
	echo "<th> No </td>";
	echo "<th> Nama </td>";
	echo "<th> NIM </td>";
	echo "<th> Prodi </td>";
	echo "<th> Fakultas </td>";
	echo "<th> Foto Profil </td>";
	echo "<th> Aksi </td>";
	echo "</tr>";

	// Loop untuk menampilkan data array yang sudah dihapus dalam bentuk tabel
	foreach ($data_deleted as $row) {
		echo "<tr>";
		foreach ($row as $cell) {
			echo "<td align='center'>" . $cell . "</td>";
		}
		echo "</tr>";
	}
	echo "</table>";
}
