<form action="" method="post">

<label for="campoTester">Scrivi qualcosa nel campo tester:</label> 
<input type="text" name="nome" id="nome" />
<input type="text" name="cognome" id="cognome" />
<input type="text" name="campoTester" id="campoTester" />
<input type="submit" name="invia" value="invia" />


</form>


<?php 

	include 'conn.php';

	if($_POST['invia'] && $_POST['campoTester']){


		$modificaDB = "INSERT INTO studenti 
		SET 
		Cognome = '".$_POST['cognome'].
		"', Nome = '".$_POST['nome']."'";
		
		$test=mysql_query($modificaDB) or die("problemi su database: ". mysql_error() );

		if($test) 
			echo "inserito con successo!";

		echo $_POST['campoTester'];

	}


 ?>