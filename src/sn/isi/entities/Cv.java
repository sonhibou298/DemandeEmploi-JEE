package sn.isi.entities;

public class Cv {
	private int id;
	private String nom;
	private String prenom;
	private int age;
	private String email;
	private int telephone;
	private String adresse;
	private String specialite;
	private String nivEtude;
	private String expProf;
	private int idDemandeur;
	
	public Cv() {
		
	}

	public Cv(int id, String nom, String prenom, int age, String email, int telephone, String adresse,
			String specialite, String nivEtude, String expProf, int idDemandeur) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.specialite = specialite;
		this.nivEtude = nivEtude;
		this.expProf = expProf;
		this.idDemandeur = idDemandeur;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getNivEtude() {
		return nivEtude;
	}

	public void setNivEtude(String nivEtude) {
		this.nivEtude = nivEtude;
	}

	public String getExpProf() {
		return expProf;
	}

	public void setExpProf(String expProf) {
		this.expProf = expProf;
	}

	public int getIdDemandeur() {
		return idDemandeur;
	}

	public void setIdDemandeur(int idDemandeur) {
		this.idDemandeur = idDemandeur;
	}
	
	
	
	
}
