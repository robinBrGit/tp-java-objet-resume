package dev;

public final class Video extends Document {

	private Support support;

	public Video(String titre, String auteur, Support support) {
		super(titre, auteur);
		this.support = support;
	}

	public Support getSupport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}

	@Override
	public float coutDocument() {
		return 70;
	}

	@Override
	public boolean isEmpruntable() {
		return true;
	}
	@Override
	public String getTypeDocument() {
		return this.support.getName();
	}
}
