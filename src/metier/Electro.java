package metier;

public class Electro {
	private static int id_electro ;
	private String reference ;
	private String description ;
	private String telephone ;
	private String annanceur ;
	private String ville ;
	private float prix ;
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Electro(String reference, String description, String annanceur,
			String ville, float prix) {
		super();
		this.reference = reference;
		this.description = description;
		this.annanceur = annanceur;
		this.ville = ville;
		this.prix = prix;
	}
	public Electro(String reference, String description, String telephone,
			String annanceur, String ville, float prix) {
		super();
		this.reference = reference;
		this.description = description;
		this.telephone = telephone;
		this.annanceur = annanceur;
		this.ville = ville;
		this.prix = prix;
	}
	public Electro() {
		super();
	}
	public static int getId_electro() {
		return id_electro;
	}
	public static void setId_electro(int id_electro) {
		Electro.id_electro = id_electro;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAnnanceur() {
		return annanceur;
	}
	public void setAnnanceur(String annanceur) {
		this.annanceur = annanceur;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	

}
