<?php
$umur;
if (isset($umur) && $umur > 18) {
    echo "You're an adult.";
} else {
    echo "You're not an adult or 'age' variable is not found.";
}

echo "<br>";

$data = array("name" => "Jane", "age" => 18);
if (isset($data["name"])) {
    echo "Name: " . $data["name"];
} else {
    echo "Variable 'name' is not found inside the array.";
}
?>