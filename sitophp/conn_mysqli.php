<?php 



$host='localhost';
$dbname='java2016';
$username='root';
$password='';




// mysqli, procedural way
$mysqli = mysqli_connect('localhost','username','password','database');
 
// mysqli, object oriented way
$mysqli = new mysqli('localhost','username','password','database');


$params = array(':username' => 'test', ':email' => $mail, ':last_login' => time() - 3600);
     


$query = $mysqli->prepare('
    SELECT * FROM users
    WHERE username = ?
    AND email = ?
    AND last_login > ?');
     
$query->bind_param('sss', 'test', $mail, time() - 3600);
$query->execute();


