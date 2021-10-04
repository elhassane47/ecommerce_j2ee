package metier;

public class User {
	//static ylah zedtha
	private static int id ;
	private String nom ;
	private String prenom ;
	private String ville ;
	private String email ;
	private String tel ;
	private String sexe ;
	private String activite ;
	private String  username;
    private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String nom, String prenom, String ville, String email,
			String tel, String sexe, String activite, String username,
			String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.email = email;
		this.tel = tel;
		this.sexe = sexe;
		this.activite = activite;
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
	}
	public User(String nom, String prenom, String ville, String email,
			String tel, String sexe, String activite, String username,
			String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.email = email;
		this.tel = tel;
		this.sexe = sexe;
		this.activite = activite;
		this.username = username;
		this.password = password;
	}
	
}
