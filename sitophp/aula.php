<table class="table table-striped">

<?php 

include 'conn.php';

if($_GET[id])

$sql = "SELECT * FROM studenti where Studenti_ID = " . $_GET[id] ;

else 
$sql = "SELECT * FROM studenti ";

$query = mysql_query($sql);



while ($result = mysql_fetch_array($query)) {
	


	echo "<tr><td><a href='?pagina=studenti&amp;id="
		.$result[Studenti_ID]."'>"
		.$result[Cognome]
		."</a></td><td>"
		.$result[Nome]		
		."</td><td>"
		.$result[5]
		."</td></tr>";

}

?>
</table>