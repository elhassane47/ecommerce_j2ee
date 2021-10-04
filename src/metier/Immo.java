package metier;

public class Immo {
	private static int id_immo ;
	private String reference ;
	private String descriptiion ;
	private float surface ;
	private String annaceur ;
	private float prix;
	private String  adresse;
	private String  telephone ;
	private String ville;
	public static int getId_immo() {
		return id_immo;
	}
	public static void setId_immo(int id_immo) {
		Immo.id_immo = id_immo;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDescriptiion() {
		return descriptiion;
	}
	public void setDescriptiion(String descriptiion) {
		this.descriptiion = descriptiion;
	}
	public float getSurface() {
		return surface;
	}
	public void setSurface(float surface) {
		this.surface = surface;
	}
	public String getAnnaceur() {
		return annaceur;
	}
	public void setAnnaceur(String annaceur) {
		this.annaceur = annaceur;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Immo(String reference, String descriptiion, float surface,
			String annaceur, float prix, String adresse, String telephone,
			String ville) {
		super();
		this.reference = reference;
		this.descriptiion = descriptiion;
		this.surface = surface;
		this.annaceur = annaceur;
		this.prix = prix;
		this.adresse = adresse;
		this.telephone = telephone;
		this.ville = ville;
	}
	public Immo() {
		super();
	}
	
	
	

}
