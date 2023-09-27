<?php
    $num1 = 10;
    $num2 = 5;
    $result = $num1 + $num2;
    echo "Hasil penjumlahan $num1 dan $num2 adalah $result ";

    $true = true;
    $false = false;
    echo "<br> Variabel benar: $true, Variabel salah: $false.";
    define("NAMA_SITUS", "WebsiteKu.com");
    define("TAHUN_PENDIRIAN", 2023);
    
    echo "<br> Selamat datang di " . NAMA_SITUS . ", situs yang didirikan pada tahun " . TAHUN_PENDIRIAN . "."
?>