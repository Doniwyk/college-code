<html>
    <head></head>
    <body>
        <?php
        session_start();

        if($_SESSION['status'] == 'login') {
            echo "Welcome " . $_SESSION['username'];
            ?>
            <br> <a href="sessionLogOut.php"> Log Out </a>
        <?php
        } else {
            echo "You're not logged in, please go to "?>
            <a href="sessionLoginForm.html"> Log In</a>
        <?php
        }
        ?>
    </body>
</html>