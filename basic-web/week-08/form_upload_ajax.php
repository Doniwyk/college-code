<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Unggah File Gambar</title>
    <link rel="stylesheet" type="text/css" href="upload.css">
</head>
<body>
    <div class="upload-form-container">
        <h2>Unggah File Document</h2>
        <form action="upload_ajax.php" id="upload-form" method="post" enctype="multipart/form-data">
            <div class="file-input-container">
                <input type="file" name="files" id="file" class="file-input">
                <label for="file" class="file-label">Pilih File</label>
            </div>
            <button type="submit" name="submit" class="upload-button" id="upload-button" disabled>Unggah</button>
        </form>
        <div id="status" class="upload-status"></div>
    </div>
    
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
    <script src="upload.js"></script>
</body>
</html>
