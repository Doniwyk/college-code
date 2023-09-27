<?php
$price = 120_000;
$disc = 1/5;
if ($price > 100_000) {
    $finalPrice = $price - ($price * $disc);
}
echo "Total yang harus dibayar: Rp.$finalPrice"
?>