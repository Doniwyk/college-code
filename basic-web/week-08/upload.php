<?php 
if (isset($_POST["submit"])) {
    $targetDirectory = "documents/";
    $targetFile = $targetDirectory . basename($_FILES["documentToUpload"]["name"]);
    $documentFileType = strtolower(pathinfo($targetFile, PATHINFO_EXTENSION));

    $allowedExtensions = array("txt", "pdf", "doc", "docx");
    $maxFileSize = 10 * 1024 * 1024; // 5 MB

    if (in_array($documentFileType, $allowedExtensions) && $_FILES["documentToUpload"]["size"] <= $maxFileSize) {
        if (move_uploaded_file($_FILES["documentToUpload"]["tmp_name"], $targetFile)) {
            echo "Dokumen berhasil ditambahkan";
            // echo "<br> <img src='$targetFile' width='200' alt='thumbnail'>";
        } else {
            echo "Dokumen gagal ditambahkan";
        }
    } else {
        echo "Jenis dokumen tidak valid atau melebihi ukuran maksimal yang diizinkan";
    }
}
?> 