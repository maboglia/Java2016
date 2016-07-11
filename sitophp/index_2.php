<html lang="en">
<head>
	<meta charset="utf8">
	<title>mia pagina php</title>
	<style type="text/css">
		tr {border-bottom: 1px solid #ccc;}
		td {border: 1px solid #eee;padding:3px;}
	</style>
</head>
<body>

<h1>mia pagina in php</h1>

<?php
	//phpinfo();
	//1) PHP è un linguaggio di programmazione
	//2) posso usare i comment su una linea
	/*
	3) posso usare i commenti su più linee,
	ma non i commenti javadoc
	*/
	 //4) ci sono le variabili, sono più semplici da gestire rispetto a Java

	//non devo gestire i tipi

	$prova = 100;
	//echo $prova;
	

	$prova = "Stringa";
	//echo $prova;


	$prova = true;
	//echo $prova;

	//5) per concatenare le variabili uso il .

	$stringa1 = "Hello";
	$stringa2 = "World";

	$ciao_mondo = $stringa1 . " " . $stringa2 ."!";

	//6) posso usare le condizioni
	if (!$prova == true) 
		echo $ciao_mondo;
	else
		echo "non ti saluto";
	
	echo "<br/>";

	//7) anche il costrutto switch
	switch ($prova) {
		case true:
			echo $ciao_mondo;
			break;
		
		default:
			echo "non ti saluto";
			break;
	}

	//8) ballo coi loop
	echo "<table class='table'>";
	for ($i=0; $i < 100; $i++) { 
		echo "<tr>";
			echo "<td>Dico</td>" 
			. "<td>".$i."</td>" 
			. "<td>volte</td>" 
			. "<td>".$ciao_mondo."</td>";
		echo "</tr>";
	}
	echo "</table>";

	for ($i=0; $i < 10; $i++) { 
		
		?>
			<p>test html</p>
		<?php

	}


	//echo "<p>questo è testo scritto in php</p>";


?>

</body>
</html>
