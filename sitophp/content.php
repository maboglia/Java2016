    <!-- Page Content -->
    <div class="container">

        <div class="row">
            <div class="col-lg-12 text-center">

            	<?php 
            		switch ($_GET['pagina']) {

                        //quello che passo via GET lo vedo scritto nella barra url del browser. ha la limitazione dei 255 caratteri
                        //quello che passo via POST no! ...ma possso comunque vederlo, quindi non è super sicuro anche questo canale
            			case 'about':
            				echo "<h1>pagina about</h1>";
            				include 'about.html';
            				break;
            			
            			case 'studenti':
            				echo "<h1>studenti</h1>";
            				include 'aula.php';
            				break;
            			
            			case 'docenti':
            				echo "<h1>docenti</h1>";
            				include 'docenti.php';
            				break;
            			
            			case 'contatti':
            				echo "<h1>pagina contatti</h1>";
            				include 'form_contatti.php';
            				break;
            			
            			default:
            				echo "<h1>pagina home</h1>";
            				include 'home.php';
            				break;
            		}

            	 ?>


                
            </div>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->