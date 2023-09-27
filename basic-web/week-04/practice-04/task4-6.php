<?php
$score = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];

sort($score);

$slice_start = 2;
$slice_length = count($score) - 4;
$trimmed_scores = array_slice($score, $slice_start, $slice_length);

$total_score = array_sum($trimmed_scores);

$average_score = $total_score / $slice_length;

echo "Total nilai setelah mengabaikan dua nilai tertinggi dan dua nilai terendah: $total_score<br>";
echo "Rata-rata nilai: $average_score";
?>
