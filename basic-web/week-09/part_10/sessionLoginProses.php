<?php
    include "../koneksi.php";

    $username = $_POST['username'];
    $password = md5($_POST['password']);

    $sql = "SELECT * FROM user WHERE username = '$username' AND password = '$password'";
    $result = mysqli_query($connect, $sql);
    $cek = mysqli_fetch_assoc($result);

    if($cek > 0) {
        session_start();
        $_SESSION['username'] = $username;
        $_SESSION['status'] = 'login';
        ?>
        Login success, go to 
        <a href="homeSession.php">Halaman HOME</a>
        <?php
    } else {
        ?>
        Login failed, back to
        <a href="sessionLoginForm.html">Halaman Login</a> <?php
        echo mysqli_error($connect);
    }
?>