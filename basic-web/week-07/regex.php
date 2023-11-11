<?php
$pattern = '/[a-z]/';
$text = 'This is a Sample Text';

if (preg_match($pattern, $text)) {
    echo "Huruf kecil ditemukan!";
} else {
    echo "Tidak ada huruf kecil";
}

echo "<br>";

$pattern = '/[0-9]/';
$text = 'There are 123 apples';

if (preg_match($pattern, $text, $matches)) {
    echo "Cocokkan: " . $matches[0];
} else {
    echo "Tidak ada angka";
}

echo "<br>";

$pattern = '/apple/';
$replacement = 'banana';
$text = 'I like apple pie.';
$now_text = preg_replace($pattern, $replacement, $text);
echo $now_text;

echo "<br>";

$pattern = '/go*d/';
$text = 'god is good';
if(preg_match($pattern, $text, $matches)) {
    echo "Cocokkan: " . $matches[0];
} else {
    echo "Tidak ada cocokkan";
} 

echo "<br>";

$pattern = '/go?d/';
$text = 'god is good';

if (preg_match($pattern, $text, $matches)) {
    echo "Cocokkan: " . $matches[0];
} else {
    echo "Tidak ada cocokkan";
}

echo "<br>";

$pattern = '/go{1,2}d/';
$text = 'god is good';

if (preg_match($pattern, $text, $matches)) {
    echo "Cocokkan: " . $matches[0];
} else {
    echo "Tidak ada cocokkan";
}

?>