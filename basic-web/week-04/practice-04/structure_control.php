<?php
    $numValue = 92;

    if ($numValue >= 90 && $numValue <= 100) {
        echo "Nilai huruf: A";
    } elseif ($numValue >= 80 && $numValue < 90) {
        echo "Nilai huruf: B";
    } elseif ($numValue >= 70 && $nilaiNumerik < 80) {
        echo "Nilai huruf: C";
    } elseif ($numValue < 70) {
        echo "Nilai huruf: D";
    }
    echo "<br>";

    $currentDistance = 0;
    $targetDistance = 500;
    $dailyUp = 30;
    $day = 0;
    
    while ($currentDistance < $targetDistance) {
        $currentDistance += $dailyUp;
        $day++;
    }

    echo "Atlet tersebut memerlukan $hari  untuk mencapai jarak 500 kilometer.<br>";

    $totalField = 10;
    $plantPerField = 5;
    $fruitPerPlant = 10;
    $totalFruit = 0;

    for ($i = 1; $i <= $totalField ; $i++) { 
        $totalFruit += ($plantPerField * $fruitPerPlant);
    }

    echo "Jumlah buah yang akan dipanen adalah: $totalFruit <br>";
    
    $testScore = [85, 92, 78, 96, 88];
    $totalScore = 0;

    foreach($testScore as $score) {
        $totalScore += $score;
    }

    echo "Total skor ujian adalah: $totalScore <br>";

    $studentScore = [85, 92, 58, 64, 90, 55, 88, 79, 70, 96];
    foreach ($studentScore as $score) {
        if ($score < 60) {
            echo "Nilai: $score (Tidak lulus) <br>";
        }
        echo "Nilai: $score (lulus) <br>";
    }
?>