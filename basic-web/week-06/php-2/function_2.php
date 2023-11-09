<?php
function calculateAge($born_year, $current_year) {
    $age = $current_year - $born_year; 
    return $age;
} 

function introduce ($name, $greet="Assalamualaikum") {
    echo $greet. ", ";
    echo "my name is " . $name . "<br/>";

    echo "I'm " . calculateAge(2004, 2023) . " years old. <br/>"; 
    echo "Nice to meet you <br/>";
}

introduce("Doni")
?> 