<?php
include "koneksi.php";
$username = $_POST['username'];
$password = md5($_POST['password']);

$query = "SELECT * FROM user WHERE username = '$username' AND password = '$password'";
$result = mysqli_query($connect, $query);
$cek = mysqli_num_rows($result);

if ($cek) {
    echo "Login success, go to "; ?>
    <a href="homeAdmin.html">Halaman HOME</a>
<?php
} else {
    echo "Login failed, back to "; ?> 
    <a href="loginForm.html">Halaman LOGIN</a>
<?php
    echo mysqli_error($connect);
}
?>