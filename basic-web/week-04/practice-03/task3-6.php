<?php
    $total = 45;
    $taken = 28;
    $percentage = (($total - $taken)/$total) * 100;
    echo "Total: ", $total, "<br> Taken: ", $taken, "<br>";
    echo "Empty seat on percentage: ", number_format($percentage, 2), "%";
?>
