<?php
$hostName = "localhost";
$userName = "root";
$password = "";
$dbName = "prakwebdb";
$connect = mysqli_connect($hostName, $userName, $password, $dbName);

// try {
//     $connect = mysqli_connect($hostName, $userName, $password, $dbName);
//     if ($connect) {
//         echo "Connection success <br>";
//     } else {
//         throw new Exception("Connection failed");
//     }

//     // $sql = "CREATE TABLE IF NOT EXISTS user (
//     //     id INT PRIMARY KEY,
//     //     username VARCHAR(50) NOT NULL,
//     //     password VARCHAR(50) NOT NULL)";
//     $sql = "INSERT INTO user (id, username, password) 
//         VALUES (1, 'admin', '123')";

//     if (mysqli_query($connect, $sql)) {
//         // echo "Table created successfully";
//         echo "Data inserted successfully";
//     } else {
//         // throw new Exception("Table not created " . mysqli_error($connect)); 
//         throw new Exception("Data not inserted " . mysqli_error($connect));
//     }

//     mysqli_close($connect);
// } catch (Exception $e) {
//     echo $e->getMessage();
// }
?>
