<?php
function perkenalan($nama, $salam="Assalamualaikum"){
    echo $salam.", ";
    echo "Perkenalkan, nama saya". $nama."<br/>";
    echo "Senang berkenalan dengan anda<br/>";
}

perkenalan("Doni", "Hi");

echo "<hr>";

$saya = "Doni";
$ucapanSalam = "Selamat Pagi";
perkenalan($saya);

?>