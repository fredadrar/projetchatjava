package modele;

import java.sql.Date;

public class PostBean {
	private String contenu;
	private Date heure;

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getHeure() {
		return heure;
	}

	public void setHeure(Date heure) {
		this.heure = heure;
	}

}
