package dev;

import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Document> lesDocuments;

    public Bibliotheque() {
        this.lesDocuments = new ArrayList<Document>();
    }

    public ArrayList<Document> getLesDocuments() {
        return lesDocuments;
    }

    public void setLesDocuments(ArrayList<Document> lesDocuments) {
        this.lesDocuments = lesDocuments;
    }

    public void addDocument(Document undocument){
        this.lesDocuments.add(undocument);
    }
    public int nombreDvd(){
        int nbDvd = 0;
        for(int i =0;i<lesDocuments.size();i++){
            if(lesDocuments.get(i).getTypeDocument().equals("DVD")){
                nbDvd++;
            }
        }
        return nbDvd;
    }
}
