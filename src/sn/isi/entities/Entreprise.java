package sn.isi.entities;

public class Entreprise {
	private int idEntreprise;
	private String nomEntreprise;
	private String email;
	private String password;
	private int telephone;
	private String adresse;
	
	public Entreprise() {
	
	}

	public Entreprise(int idEntreprise, String nomEntreprise, String email, String password, int telephone,
			String adresse) {
		super();
		this.idEntreprise = idEntreprise;
		this.nomEntreprise = nomEntreprise;
		this.email = email;
		this.password = password;
		this.telephone = telephone;
		this.adresse = adresse;
	}

	public int getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(int idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	
	@Override
	public String toString() {return nomEntreprise;}
	
}
