package metier;

public class Emploi {
	private static int id ;
	private String titre ;
	private String organisme ;
	private String desc_orga;
	private String poste ;
	private String profile ;
	private String secteur ;
	private String ville ;
	private String salaire ;
	private String telephone ;
	private String email ;
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Emploi(String titre, String organisme, String desc_orga,
			String poste, String profile, String secteur, String ville,
			String salaire, String telephone, String email) {
		super();
		this.titre = titre;
		this.organisme = organisme;
		this.desc_orga = desc_orga;
		this.poste = poste;
		this.profile = profile;
		this.secteur = secteur;
		this.ville = ville;
		this.salaire = salaire;
		this.telephone = telephone;
		this.email = email;
	}
	public Emploi() {
		super();
	}
	public Emploi(String titre, String organisme, String desc_orga,
			String poste, String profile, String secteur, String ville,
			String salaire) {
		super();
		this.titre = titre;
		this.organisme = organisme;
		this.desc_orga = desc_orga;
		this.poste = poste;
		this.profile = profile;
		this.secteur = secteur;
		this.ville = ville;
		this.salaire = salaire;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Emploi.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getOrganisme() {
		return organisme;
	}
	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}
	public String getDesc_orga() {
		return desc_orga;
	}
	public void setDesc_orga(String desc_orga) {
		this.desc_orga = desc_orga;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getSecteur() {
		return secteur;
	}
	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getSalaire() {
		return salaire;
	}
	public void setSalaire(String salaire) {
		this.salaire = salaire;
	} 


}
