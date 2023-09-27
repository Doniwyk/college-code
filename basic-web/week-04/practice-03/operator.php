<?php
    $a = 10;
    $b = 5;

    $hasilTambah = $a + $b;
    $hasilKurang = $a - $b;
    $hasilKali = $a * $b;
    $hasilBagi = $a / $b;
    $sisaBagi = $a & $b;
    $pangkat = $a ** $b;

    echo "10 + 5 = ", $hasilTambah, "<br>";
    echo "10 - 5 = ", $hasilKurang, "<br>";
    echo "10 x 5 = ", $hasilKali, "<br>";
    echo "10 / 5 = ", $hasilBagi, "<br>";
    echo "10 % 5 = ", $sisaBagi, "<br>";
    echo "10 ^ 5 = ", $pangkat, "<br><br>";

    $hasilSama = $a == $b;
    $hasilTidakSama = $a != $b;
    $hasilLebihKecil = $a < $b;
    $hasilLebihBesar = $a > $b;
    $hasilLebihKecilSama = $a <= $b;
    $hasilLebihBesarSama = $a >= $b;

    echo "a = b: ", $hasilSama, "<br>";
    echo "a != b: ", $hasilTidakSama, "<br>";
    echo "a < b: ", $hasilLebihKecil, "<br>";
    echo "a > b: ", $hasilLebihBesar, "<br>";
    echo "a <= b: ", $hasilLebihKEcilSama, "<br>";
    echo "a >= b: ", $hasilLebihBesarSama, "<br><br>";

    $hasilAnd = $a && $b;
    $hasilOr = $a || $b;
    $hasilNotA = !$a;
    $hasilNotB = !$b;

    echo "a and b: ", $hasilAnd, "<br>";
    echo "a or b: ", $hasilOr, "<br>";
    echo "not a: ", $hasilNotA, "<br>";
    echo "not b: ", $hasilNotB, "<br><br>";

    echo "a+=b: ", $a += $b, "<br>";
    echo "a-=b: ", $a -= $b, "<br>";
    echo "a*=b: ", $a *= $b, "<br>";
    echo "a/=b: ", $a /= $b, "<br>";
    echo "a%=b: ", $a %= $b, "<br><br>";

    $hasilIdentik = $a === $b;
    $hasilTidakIdentik = $a !== $b;

    echo "a identik b: ", $hasilIdentik, "<br>";
    echo "a tidak identik b: ", $hasilTidakIdentik;

?>