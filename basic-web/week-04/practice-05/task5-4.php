<?php
$nilai_siswa = [
    ["nama" => "Alice", "nilai" => 85],
    ["nama" => "Bob", "nilai" => 92],
    ["nama" => "Charlie", "nilai" => 78],
    ["nama" => "David", "nilai" => 64],
    ["nama" => "Eva", "nilai" => 90],
];

$total_nilai = 0;
foreach ($nilai_siswa as $siswa) {
    $total_nilai += $siswa["nilai"];
}
$jumlah_siswa = count($nilai_siswa);
$rata_rata_kelas = $total_nilai / $jumlah_siswa;

echo "Rata-rata kelas adalah: " . number_format($rata_rata_kelas, 2) . "<br>";

echo "Daftar nilai siswa di atas rata-rata kelas:<br>";
foreach ($nilai_siswa as $siswa) {
    if ($siswa["nilai"] > $rata_rata_kelas) {
        echo $siswa["nama"] . ": " . $siswa["nilai"] . "<br>";
    }
}
?>
