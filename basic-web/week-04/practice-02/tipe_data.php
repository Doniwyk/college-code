<?php
    $a = 10;
    $b = 5;
    $c = $a + 5;
    $d = $b + (10 * 5);
    $e = $d - $c;

    echo "Variable a: {$a} <br>";
    echo "Variable b: {$b} <br>";
    echo "Variable c: {$c} <br>";
    echo "Variable d: {$d} <br>";
    echo "Variable e: {$e} <br><br>";

    var_dump($e);

    $nilaiMatematika = 5.1;
    $nilaiIPA = 6.7;
    $nilaiBahasaIndonesia = 9.3;

    $rataRata = ($nilaiMatematika + $nilaiIPA + $nilaiBahasaIndonesia) / 3;

    echo "Matematika: {$nilaiMatematika} <br>";
    echo "IPA: {$nilaiIPA} <br>";
    echo "Bahasa Indonesia: {$nilaiBahasaIndonesia} <br>";
    echo "Rata-rata: {$rataRata} <br><br>";

    var_dump($rataRata);

    $apakahSiswaLulus = true;
    $apakahSiswaSudahUjian = false;

    var_dump($apakahSiswaLulus);
    var_dump($apakahSiswaSudahUjian);
    echo "<br><br>";

    $namaDepan = "Ibnu";
    $namaBelakang = "Jakaria";

    $namaLengkap = "{$namaDeapn} {$namaBelakang}";
    $namaLengkap2 = $namadepan . ' ' . $namaBelakang;

    echo "Nama Depan: {$namaDepan} <br>";
    echo 'Nama Belakang: ' . $namaBelakang . '<br>';

    echo $namaLengkap;

    $listMahasiswa  = ["Wahai Abdullah", "Elmo Bachtiar", "Lendis Fabri"];
    echo "<br>", $listMahasiswa[0];
?>