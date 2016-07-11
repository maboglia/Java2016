<table class="table table-striped">

<?php 

include 'conn.php';

$sql = "select * from docenti";

$query = mysql_query($sql);



while ($result = mysql_fetch_array($query)) {
	
	echo "<tr><td>"
		.$result[Cognome]
		."</td><td>"
		.$result[Nome]
		."</td></tr>";

}

?>
</table>