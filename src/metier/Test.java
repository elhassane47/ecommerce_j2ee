package metier;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class Test {
public static void main(String[] args)
	{
	   IElectro metier = new gestionElectro();
	  // User u = new User(6,"hassqxxxqan","gargllem","errla","bfffb@gm","065fffgg55","mascggggulin","acheffggggt", "errazzzhass","hhhhh");
  /*   Electro e = new Electro("pc", "pc dial faraji","sss" , "meknes", 15);
     Electro e1 = new Electro("pc portable", "pc dial mahmoud","errahass" , "fes", 17);
     Electro e2 = new Electro("pc", "pc dial omar","sss" , "meknes", 18);
     Electro e3 = new Electro("pc", "pc dial sif","errahass" , "meknes", 200);
     Electro e4 = new Electro("pc", "pc dial maataoui","errahass" , "meknes", 150);
     Electro e5 = new Electro("pc", "pc dial aklouh","sss" , "meknes", 1545);*/

	   //metier.addElectro(e);
	//metier.addElectro(e1);
	//metier.addElectro(e2);
	//metier.addElectro(e3);
	//metier.addElectro(e4);
	//metier.addElectro(e5);<
	   List<Electro> ll = metier.listeElectro();
	   for(Electro e: ll)
	   {
          System.out.println(e.getVille());
	   }
	 
	 /*  List <User> liste = metier.listeUser();
	   for (User usr :liste)
	   {
		   System.out.print(usr.getId());
		   System.out.println(usr.getEmail());
	   }*/
	  /* User us = metier.getUser("errahass");
	   
	   System.out.println("-------------"); 
	   System.out.println(us.getEmail());
	   metier.suppUser("errahass");
	System.out.println("3louu");*/
	 /*  Immo um =new  Immo("ref01", "dar faraji",(float) 120.5,"faraji", 500000,  "madrassa", "0655555","BMO");
	   Immo um1 =new  Immo("ref02", "dar mahmoud",(float) 120.5,"faraji",500000,  "madrassa", "0655555","mhamid");
	   Immo um2 =new  Immo("ref03", "dar aklouh",(float) 120.5,"faraji", 500000,  "madrassa", "0655555","saada");
	   Immo um3 =new  Immo("ref04", "dar rajim",(float) 120.5,"faraji", 500000,  "madrassa", "0655555","bim");
gestionImm gg = new gestionImm();
try {
	gg.addImo(um);
	gg.addImo(um1);
	gg.addImo(um2);
	gg.addImo(um3);

} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}

/*
	List<Electro> elect = metier.listeElectro();
	for(Electro e :elect)
	{
		   System.out.println(e.getAnnanceur());

	}*/
	 //  Emploi em = new Emploi("khedma", "renault", "chariika kbiiiiiiiiiiiiiraaaaa bzaaaaaaaaaaaaaaaaaaaffffffffffffffff", "chawech", "bac+90", "prive", "errachidia", 4000.5);
	//gestionEmploi gss= new gestionEmploi();
	//Emploi ex = new Emploi("rr", "mahmouxdev", "chaezrika mziana","ingenieur","bac+7", "bantque", "kech","a discuter", "17777", "mahmoudev@gmail.com");
	//try {
	//	gss.addEmploi(ex);
	//} catch (SQLException e) {
		// TODO Auto-generated catch block
	//	e.printStackTrace();
	//}
	//for(Emploi x:gss.listeEmploi())
	//{
	//	System.out.println(x.getTitre());
//	}
	//	
		
	}

}
