<?php 



$host='localhost';
$dbname='java2016';
$username='root';
$password='';



// PDO
$pdo = new PDO("mysql:host=localhost;dbname=java2016", 'root', '');




// $params = array(':username' => 'test', ':email' => $mail, ':last_login' => time() - 3600);
   

// $pdo->prepare('
//     SELECT * FROM users
//     WHERE username = :username
//     AND email = :email
//     AND last_login > :last_login');
     

//$pdo->prepare('SELECT * FROM studenti');

// $pdo->execute($params);



class Studente {
    public $Studenti_ID;
    public $Nome;
    public $Cognome;
    public $Regione;
     
    public function info()
    {
        return '#'.$this->Studenti_ID
        .': '
        .$this->Nome
        .' '
        .$this->Cognome
        .'Regione '
        .$this->Regione;
    }
}
// PDO

$query=("SELECT * FROM studenti");

$result = $pdo->query($query);
$result->setFetchMode(PDO::FETCH_CLASS, 'Studente');
 
while ($user = $result->fetch()) {
    echo $user->info()."<br/>\n";
}

	