<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="metier.gestionElectro"  %>
  <%@page import="metier.User"  %>
 
 <%@ page import="java.util.List" %> 
 
  <%@page import="metier.Electro"  %>
 <% gestionElectro gst= new gestionElectro(); %>
 <% User u = (User)session.getAttribute("login"); %>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
<title>Anoca|annoncer une multimedia</title>
<link rel="stylesheet" href="css/bootstrap.min.css"><!-- bootstrap-CSS -->
<link rel="stylesheet" href="css/bootstrap-select.css"><!-- bootstrap-select-CSS -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" /><!-- style.css -->
<link rel="stylesheet" href="css/font-awesome.min.css" /><!-- fontawesome-CSS -->
<link rel="stylesheet" href="css/menu_sideslide.css" type="text/css" media="all"><!-- Navigation-CSS -->
<!-- meta tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Resale Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //meta tags -->
<!--fonts-->
<link href='//fonts.googleapis.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!--//fonts-->	
<!-- js -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/bootstrap.js"></script>
<script src="js/bootstrap-select.js"></script>
<script>
  $(document).ready(function () {
    var mySelect = $('#first-disabled2');

    $('#special').on('click', function () {
      mySelect.find('option:selected').prop('disabled', true);
      mySelect.selectpicker('refresh');
    });

    $('#special2').on('click', function () {
      mySelect.find('option:disabled').prop('disabled', false);
      mySelect.selectpicker('refresh');
    });

    $('#basic2').selectpicker({
      liveSearch: true,
      maxOptions: 1
    });
  });
</script>
<!-- language-select -->
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<link href="css/jquery.uls.css" rel="stylesheet"/>
<link href="css/jquery.uls.grid.css" rel="stylesheet"/>
<link href="css/jquery.uls.lcd.css" rel="stylesheet"/>
<!-- Source -->
<script src="js/jquery.uls.data.js"></script>
<script src="js/jquery.uls.data.utils.js"></script>
<script src="js/jquery.uls.lcd.js"></script>
<script src="js/jquery.uls.languagefilter.js"></script>
<script src="js/jquery.uls.regionfilter.js"></script>
<script src="js/jquery.uls.core.js"></script>
<script>
			$( document ).ready( function() {
				$( '.uls-trigger' ).uls( {
					onSelect : function( language ) {
						var languageName = $.uls.data.getAutonym( language );
						$( '.uls-trigger' ).text( languageName );
					},
					quickList: ['en', 'hi', 'he', 'ml', 'ta', 'fr'] //FIXME
				} );
			} );
		</script>
<!-- //language-select -->
</head>
<body>
	<!-- Navigation -->

		<!-- //Navigation -->
	<!-- header -->
	<header>
		<div class="w3ls-header"><!--header-one--> 
			
			<div class="w3ls-header-right">
				<ul>
					<li class="dropdown head-dpdn">
						<a href="signin.html" aria-expanded="false"><i class="fa fa-user" aria-hidden="true"></i><%=u.getUsername() %></a>
					</li>
					<li class="dropdown head-dpdn">
						<a href="anoca.jsp"><i class="fa fa-question-circle" aria-hidden="true"></i> Deconnexion</a>
					</li>
					
					<li class="dropdown head-dpdn">
						<div class="header-right">			
	<!-- Large modal -->
			
		</div>
					</li>
				</ul>
			</div>
			
			<div class="clearfix"> </div> 
		</div>
		<div class="container">
			<div class="agile-its-header">
				<div class="logo">
					<h1><a href="indexo.jsp"><span>A</span>noca</a></h1>
				</div>
				
				<div class="clearfix"></div>
			</div>
		</div>
	</header>
	<!-- //header -->
	<!-- breadcrumbs -->
	<div class="w3layouts-breadcrumbs text-center">
		<div class="container">
			<span class="agile-breadcrumbs"><a href="indexo.jsp"><i class="fa fa-home home_1"></i></a> / <span>Ajouter une annonce</span></span>
		</div>
	</div>
	<!-- //breadcrumbs -->
	<!-- Submit Ad -->
	<div class="submit-ad main-grid-border">
		<div class="container">
			<h2 class="w3-head">Ajouter une annonce</h2>
			<div class="post-ad-form">
				<form method="post" action="postad">
					<label>Ville <span>*</span></label>
					<select class="" name="ville">
					  <option value="">choisir votre ville</option>
					   <option value="552" >Agadir</option>
                            <option value="Al hoceima" >Al hoceima</option>
                            <option value="Aoussered" >Aoussered</option>
                            <option value="Assilah" >Assilah</option>
            
                            <option value="Azrou" >Azrou</option>
                            <option value="Beni mellal" >Beni mellal</option>
                            <option value="Benslimane" >Benslimane</option>
                            <option value="Berkane" >Berkane</option>
                            <option value="Berrechid" >Berrechid</option>
                            <option value="Boujdour" >Boujdour</option>
                            <option value="Bouskoura" >Bouskoura</option>
                            <option value="Bouznika" >Bouznika</option>
                            <option value="Casablanca" >Casablanca</option>
                            <option value="Chafchaouen" >Chafchaouen</option>
                            <option value="Dakhla" >Dakhla</option>
                            <option value="El jadida" >El jadida</option>
                            <option value="Errachidia" >Errachidia</option>
                            <option value="Essaouira" >Essaouira</option>
                            <option value="Essmara" >Essmara</option>
                            <option value="F�s" >F�s</option>
                            <option value="Fkih ben salah" >Fkih ben salah</option>
                            <option value="Guelmim" >Guelmim</option>
                            <option value="Guercif" >Guercif</option>
                            <option value="Ifrane" >Ifrane</option>
                            <option value="K�nitra" >K�nitra</option>
                            <option value="Kabila" >Kabila</option>
                            <option value="Khenifra" >Khenifra</option>
                            <option value="Khmissat" >Khmissat</option>
                            <option value="Khouribga" >Khouribga</option>
                            <option value="Ksar el kebir" >Ksar el kebir</option>
                            <option value="Laayoune" >Laayoune</option>
                            <option value="Larache" >Larache</option>
                            <option value="Marrakech" >Marrakech</option>
                            <option value="Martil" >Martil</option>
                            <option value="Mekn�s" >Mekn�s</option>
                            <option value="Melilia" >Melilia</option>
                            <option value="Midelt" >Midelt</option>
                            <option value="Mohammedia" >Mohammedia</option>
                            <option value="Nador" >Nador</option>
                            <option value="Oualidia" >Oualidia</option>
                            <option value="Ouarzazate" >Ouarzazate</option>
                            <option value="Ouazzane" >Ouazzane</option>
                            <option value="Oujda" >Oujda</option>
                            <option value="Rabat" >Rabat</option>
                            <option value="591" >Safi</option>
                            <option value="Safi" >Saidia</option>
                            <option value="Sal�" >Sal�</option>
                            <option value="tanger" >Tanger</option>
                            <option value="taza" >Taza</option>
                            <option value="temara" >Temara</option>
                            <option value="tetouan" >Tetouan</option>
							
					</select>
					<div class="clearfix"></div>
					<label>Reference <span>*</span></label>
					<input type="text" class="phone" name="reference" placeholder="">
					<div class="clearfix"></div>
					<label>Description <span>*</span></label>
					<textarea class="mess" placeholder="Write few lines about your product" name="description"></textarea>
					<div class="clearfix"></div>
					<label>Nom <span>*</span></label>
					<input type="text" class="name" placeholder="" name="annanceur">
					<div class="clearfix"></div>
					<label>Prix <span>*</span></label>
					<input type="text" class="name" placeholder="" name="prix">
					<div class="clearfix"></div>
					<label>Telephone <span>*</span></label>
					<input type="text" class="name" placeholder="" name="telephone">
					<div class="clearfix"></div>
					
					<input type="submit" value="Ajouter">
					<div class="clearfix"></div>
					

                </form>
                <!--
				<div class="upload-ad-photos">
				<label>Photos for your ad :</label>	
					<div class="photos-upload-view">
						<form id="upload" action="index.html" method="POST" enctype="multipart/form-data">

						<input type="hidden" id="MAX_FILE_SIZE" name="MAX_FILE_SIZE" value="300000" />

						<div>
							<input type="file" id="fileselect" name="fileselect[]" multiple="multiple" />
							<div id="filedrag">or drop files here</div>
						</div>

						<div id="submitbutton">
							<button type="submit">Upload Files</button>
						</div>

						</form>

						<div id="messages">
						<p>Status Messages</p>
						</div>
						</div>
					<div class="clearfix"></div>
						<script src="js/filedrag.js"></script>
				</div>
					 <!--<div class="personal-details">
					
					<form>
						<label>Your Name <span>*</span></label>
						<input type="text" class="name" placeholder="">
						<div class="clearfix"></div>
						<label>Your Mobile No <span>*</span></label>
						<input type="text" class="phone" placeholder="">
						<div class="clearfix"></div>
						<label>Your Email Address<span>*</span></label>
						<input type="text" class="email" placeholder="">
						<div class="clearfix"></div>
						<p class="post-terms">By clicking <strong>post Button</strong> you accept our <a href="terms.html" target="_blank">Terms of Use </a> and <a href="privacy.html" target="_blank">Privacy Policy</a></p>
					<input type="submit" value="Post">					
					<div class="clearfix"></div>
					</form>
					</div>-->
			</div>
		</div>	
	</div>
	<!-- // Submit Ad -->
	<!--footer section start-->		
		<footer>
			<div class="w3-agileits-footer-top">
				<div class="container">
											
				</div>	
			</div>	
			<div class="agileits-footer-bottom text-center">
			<div class="container">
				<div class="w3-footer-logo">
					<h1><a href="index.html"><span>A</span>noca</a></h1>
				</div>
				<div class="w3-footer-social-icons">
					<ul>
						<li><a class="facebook" href="#"><i class="fa fa-facebook" aria-hidden="true"></i><span>Facebook</span></a></li>
						<li><a class="twitter" href="#"><i class="fa fa-twitter" aria-hidden="true"></i><span>Twitter</span></a></li>
						<li><a class="flickr" href="#"><i class="fa fa-flickr" aria-hidden="true"></i><span>Flickr</span></a></li>
						<li><a class="googleplus" href="#"><i class="fa fa-google-plus" aria-hidden="true"></i><span>Google+</span></a></li>
						<li><a class="dribbble" href="#"><i class="fa fa-dribbble" aria-hidden="true"></i><span>Dribbble</span></a></li>
					</ul>
				</div>
				
				<div class="clearfix"></div>
			</div>
		</div>
		</footer>
        <!--footer section end-->
</body>
		<!-- Navigation-JavaScript -->
			<script src="js/classie.js"></script>
			<script src="js/main.js"></script>
		<!-- //Navigation-JavaScript -->
		<!-- here stars scrolling icon -->
			<script type="text/javascript">
				$(document).ready(function() {
					/*
						var defaults = {
						containerID: 'toTop', // fading element id
						containerHoverID: 'toTopHover', // fading element hover id
						scrollSpeed: 1200,
						easingType: 'linear' 
						};
					*/
										
					$().UItoTop({ easingType: 'easeOutQuart' });
										
					});
			</script>
			<!-- start-smoth-scrolling -->
			<script type="text/javascript" src="js/move-top.js"></script>
			<script type="text/javascript" src="js/easing.js"></script>
			<script type="text/javascript">
				jQuery(document).ready(function($) {
					$(".scroll").click(function(event){		
						event.preventDefault();
						$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
					});
				});
			</script>
			<!-- start-smoth-scrolling -->
		<!-- //here ends scrolling icon -->
</html>