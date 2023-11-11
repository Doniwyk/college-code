<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulir Aman</title>
</head>
<body>

<?php
$input = "";
$email = "";
$emailMessage = "";

// Memproses formulir ketika dikirimkan
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Mengamankan input dari formulir
    $input = $_POST["input"];
    $input = htmlspecialchars($input, ENT_QUOTES, 'UTF-8');

    // Mengamankan input email dan melakukan validasi
    $email = $_POST["email"];
    $email = htmlspecialchars($email, ENT_QUOTES, 'UTF-8');
    if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $emailMessage = "Email anda valid";
    } else {
        $emailMessage = "Email anda tidak valid";
    }
}
?>

<!-- Formulir HTML -->
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
    Masukkan teks: <input type="text" name="input" value="<?php echo htmlspecialchars($input, ENT_QUOTES, 'UTF-8'); ?>">
    <br>
    Masukkan email: <input type="text" name="email" value="<?php echo htmlspecialchars($email, ENT_QUOTES, 'UTF-8'); ?>">
    <input type="submit" value="Kirim">
</form>

<!-- Menampilkan hasil input yang aman -->
<p>Input yang aman: <?php echo $input; ?></p>

<!-- Menampilkan pesan validasi email -->
<p><?php echo $emailMessage; ?></p>

</body>
</html>
