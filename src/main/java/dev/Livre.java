package dev;

public final class Livre extends DocumentEcris {
	private boolean empruntable;

	public Livre(String titre, String auteur, int nbPages, boolean empruntable) {
		super(titre, auteur, nbPages);
		this.empruntable = empruntable;
	}

	@Override
	public boolean isEmpruntable() {
		return this.empruntable;
	}

	@Override
	public String getTypeDocument() {
		return "Livre";
	}
}
