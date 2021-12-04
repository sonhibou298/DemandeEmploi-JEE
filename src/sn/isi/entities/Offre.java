package sn.isi.entities;

public class Offre {
	private int idO;
	private String description;
	private int idEntreprise;
	
	public Offre() {
		super();
	}

	public Offre(int idO, String description, int idEntreprise) {
		super();
		this.idO = idO;
		this.description = description;
		this.idEntreprise = idEntreprise;
	}

	public int getIdO() {
		return idO;
	}

	public void setIdO(int idO) {
		this.idO = idO;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(int idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	
}
