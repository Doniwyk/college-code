<?php
    function perkenalan($nama, $salam="Assalamualaikum") {
        echo $salam. ", ";
        echo "Perkenalkan, nama saya " .$nama. "<br/>";
        echo "Senang berkenalan denganmu <br/>";
    }

    perkenalan("Doni", "Hallo");

    echo "<hr>";

    $saya = "Doni";
    $ucapanSalam = "Selamat Pagi";

    perkenalan($saya);
?>