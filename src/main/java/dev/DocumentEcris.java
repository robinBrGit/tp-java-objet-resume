package dev;

public abstract class DocumentEcris extends Document {
    protected int nbPages;


    public DocumentEcris(String titre, String auteur, int nbPages) {
        super(titre, auteur);
        this.nbPages = nbPages;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    @Override
    public float coutDocument() {
        return this.nbPages*0.50f;
    }


}
