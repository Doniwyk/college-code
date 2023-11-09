<?php
function countAge($born_year, $current_year){
    $age = $current_year - $born_year;
    return $age;
}

function introducce($name, $greet = "Assalamualaikum"){
    echo $greet.", ";
    echo "Perkenalkan, nama saya ".$name."<br/>";

    echo "Umur saya adalah ".countAge(2004, 2023)." tahun<br/>";
    echo "Senang berkenalan dengan anda<br/>";
}

introducce("Doni");
?>