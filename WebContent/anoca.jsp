<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="metier.User"  %>
<%@page import="metier.Electro"  %>
<%@page import="metier.Immo"  %>

<%@page import="java.util.List"  %>

<%@page import="metier.gestionElectro"  %>
<%@page import="metier.gestionImm"  %>

<% gestionElectro gst = new gestionElectro();  %>
<% gestionImm gest = new gestionImm();  %>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Anoca | Acceuil</title>
<link rel="stylesheet" href="css/bootstrap.min.css"><!-- bootstrap-CSS -->
<link rel="stylesheet" href="css/bootstrap-select.css"><!-- bootstrap-select-CSS -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" /><!-- style.css -->
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" /><!-- flexslider-CSS -->
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
						<a href="signin.html" aria-expanded="false"><i class="fa fa-user" aria-hidden="true"></i>se connecter </a>
					</li>
					<li class="dropdown head-dpdn">
						<a href="signup.html"><!--  <i class="fa fa-question-circle" aria-hidden="true"></i> -->inscription</a>
					</li>
					
					
				</ul>
			</div>
			
			<div class="clearfix"> </div> 
		</div>
		<div class="container">
			<div class="agile-its-header">
				<div class="logo">
					<h1><a href="index.html"><span>A</span>noca</a></h1>
				</div>
				<div class="agileits_search">
					
				</div>	
				<div class="clearfix"></div>
			</div>
		</div>
	</header>
	<!-- //header -->
	<!-- Slider -->
		
		<!-- //Slider -->
		<!-- content-starts-here -->
		<div class="main-content">
			<div class="w3-categories">
				<h3>Choisir votre Categoie</h3>
				<div class="container">
				<!--
					<div class="col-md-3">
						<div class="focus-grid w3layouts-boder1">
							<a class="btn-8" href="categories.html">
								<div class="focus-border">
									<div class="focus-layout">
										<div class="focus-image"><i class="fa fa-mobile"></i></div>
										<h4 class="clrchg">Mobiles</h4>
									</div>
								</div>
							</a>
						</div>
					</div>
					-->
					<div class="col-md-4">
						<div class="focus-grid w3layouts-boder2">	
						<a class="btn-8" href="mobiles.jsp">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-laptop"></i></div>
									<h4 class="clrchg"> Electroniques & multimedia</h4>
								</div>
							</div>
						</a>
					</div>
					</div>
					
					<!--  
					<div class="col-md-4">
					<div class="focus-grid w3layouts-boder4">
						<a class="btn-8" href="categories.html#parentVerticalTab4">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-motorcycle"></i></div>
									<h4 class="clrchg">Bikes</h4>
								</div>
							</div>
						</a>
					</div>	
					</div>
					
					<div class="col-md-4">
					<div class="focus-grid w3layouts-boder5">
						<a class="btn-8" href="categories.html#parentVerticalTab5">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-wheelchair"></i></div>
									<h4 class="clrchg">Furnitures</h4>
								</div>
							</div>
						</a>
					</div>
					</div>
			
					-->
					<!--  
					<div class="col-md-3">
					<div class="focus-grid w3layouts-boder6">
						<a class="btn-8" href="categories.html#parentVerticalTab6">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-paw"></i></div>
									<h4 class="clrchg">Pets</h4>
								</div>
							</div>
						</a>
					</div>	
					</div>
					
					<div class="col-md-3">
					<div class="focus-grid w3layouts-boder7">
						<a class="btn-8" href="categories.html#parentVerticalTab7">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-book"></i></div>
									<h4 class="clrchg">Books, Sports & Hobbies</h4>
								</div>
							</div>
						</a>
					</div>	
					</div>
                     -->
                     <!-- 
					<div class="col-md-4">
					<div class="focus-grid w3layouts-boder8">
						<a class="btn-8" href="categories.html#parentVerticalTab8">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-asterisk"></i></div>
									<h4 class="clrchg">Fashion</h4>
								</div>
							</div>
						</a>
					</div>	
					</div>
					 --> 
					<!--
					<div class="col-md-3">
					<div class="focus-grid w3layouts-boder9">
						<a class="btn-8" href="categories.html#parentVerticalTab9">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-gamepad"></i></div>
									<h4 class="clrchg">Kids</h4>
								</div>
							</div>
						</a>
					</div>	
					</div>
					-->
					<!--  
					<div class="col-md-4">
					<div class="focus-grid w3layouts-boder10">
						<a class="btn-8" href="categories.html#parentVerticalTab10">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-shield"></i></div>
									<h4 class="clrchg">Services</h4>
								</div>
							</div>
						</a>
					</div>
					</div>
					-->
					<div class="col-md-4">
					<div class="focus-grid w3layouts-boder11">
						<a class="btn-8" href="categories.html#parentVerticalTab11">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-at"></i></div>
									<h4 class="clrchg">Emploi</h4>
								</div>
							</div>
						</a>
					</div>
					</div>
					<div class="col-md-4">
					<div class="focus-grid w3layouts-boder12">
						<a class="btn-8" href="immobilier.jsp">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-home"></i></div>
									<h4 class="clrchg">Immobilier</h4>
								</div>
							</div>
						</a>
					</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<!-- most-popular-ads -->
			
			<!-- most-popular-ads -->									
			<div class="trending-ads">
				<div class="container">
				<!-- slider -->
				<div class="agile-trend-ads">
					<h2>les annonces populaires </h2>
							<ul id="flexiselDemo3">
								<li>
								<% List<Electro> liste = gst.listeElectro();
								  for(int i=0 ; i <4;i++)
								  {
									  Electro el = liste.get(i);
								  
								  %>
									<div class="col-md-3 biseller-column">
										<a href="single.html">
											<img src="images/p1.jpg" alt="" />
											<span class="price"><%=el.getPrix() %> DHS</span>
										</a> 
										<div class="w3-ad-info">
											<h5><%=el.getDescription() %></h5>
											<span><%=el.getVille() %></span>
										</div>
									
									</div>
									<% } %>
									
									
								</li>
								<li>
								<% List<Immo> lol = gest.listeImmo();
								  for(int i=0;i<4;i++)
								   { Immo im = lol.get(i);
								   
								   
								   %>
									<div class="col-md-3 biseller-column">
										<a href="single.html">
											<img src="images/p9.jpg" alt="" />
											<span class="price"><%=im.getPrix() %> DHS</span>
										</a> 
										<div class="w3-ad-info">
											<h5><%=im.getDescriptiion() %></h5>
											<span><%=im.getVille() %></span>
										</div>
									</div>
									<% } %>
									
								</li>
						</ul>
					</div>   
			</div>
			<!-- //slider -->				
			</div>
			<!--partners-->
			
		<!--//partners-->	
		<!-- mobile app -->
		
			<!-- //mobile app -->
		</div>
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
		<!-- Navigation-Js-->
			<script type="text/javascript" src="js/main.js"></script>
			<script type="text/javascript" src="js/classie.js"></script>
		<!-- //Navigation-Js-->
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
		<script type="text/javascript" src="js/jquery.flexisel.js"></script><!-- flexisel-js -->	
					<script type="text/javascript">
						 $(window).load(function() {
							$("#flexiselDemo3").flexisel({
								visibleItems:1,
								animationSpeed: 1000,
								autoPlay: true,
								autoPlaySpeed: 5000,    		
								pauseOnHover: true,
								enableResponsiveBreakpoints: true,
								responsiveBreakpoints: { 
									portrait: { 
										changePoint:480,
										visibleItems:1
									}, 
									landscape: { 
										changePoint:640,
										visibleItems:1
									},
									tablet: { 
										changePoint:768,
										visibleItems:1
									}
								}
							});
							
						});
					   </script>
		<!-- Slider-JavaScript -->
			<script src="js/responsiveslides.min.js"></script>	
			 <script>
			$(function () {	
			  $("#slider").responsiveSlides({
				auto: true,
				pager: false,
				nav: true,
				speed: 500,
				maxwidth: 800,
				namespace: "large-btns"
			  });

			});
		  </script>
		<!-- //Slider-JavaScript -->
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
</body>		
</html>		