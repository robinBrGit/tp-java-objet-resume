package dev;

public abstract class Document {

	protected String titre;
	protected String auteur;

	public Document() {
	}

	public Document(String titre, String auteur) {
		this.titre = titre;
		this.auteur = auteur;
	}

	public abstract float coutDocument();
	public abstract boolean isEmpruntable();
	public abstract String getTypeDocument();

}
