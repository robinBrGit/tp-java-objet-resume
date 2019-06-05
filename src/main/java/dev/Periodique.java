package dev;

public final class Periodique extends DocumentEcris {
	private int numero;

	public Periodique(String titre, String auteur, int nbPages, int numero) {
		super(titre, auteur, nbPages);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public boolean isEmpruntable() {
		return false;
	}
	@Override
	public String getTypeDocument() {
		return "Periodique";
	}
}
