<?php
function displayNum(int $jumlah, int $indeks = 1){
    echo "Perulangan ke-{$indeks}<br/>";
    if ($indeks < $jumlah) {
        displayNum($jumlah, $indeks+1);
    }
}

displayNum(20);

// for ($i=1; $i<=25 ; $i++) { 
//     echo "Perulangan ke-{$i}<br/>";
// }
?>