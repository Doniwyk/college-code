<?php
$targetDirectory = "uploads/";

if (!file_exists($targetDirectory)) {
    mkdir($targetDirectory, 0777, true);
}

if ($_FILES['files']['name'][0]) {
    $totalFiles = count($_FILES['files']['name']);

    for ($i=0; $i < $totalFiles; $i++) { 
        $filesName = $_FILES['files']['name'][$i];
        $targetFile = $targetDirectory . $filesName;

        if (move_uploaded_file($_FILES['files']['tmp_name'][$i], $targetFile)) {
            echo "File $filesName berhasil diunggah <br>";
        } else {
            echo "Gagal mengunggah file $filesName <br>";
        }
    }
} else {
    echo "Tidak ada file yang diunggah";
}
?>