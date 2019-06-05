package dev;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bibliotheque uneBibliotheque = new Bibliotheque();
        Livre unLivre = new Livre("Pinocchio","Carlo Collodi",304,true);
        uneBibliotheque.addDocument(unLivre);
        Video video1 = new Video("Glass","M. Night Shyamalan",Support.DVD);
        Video video2 = new Video("DRAGONS 3 : LE MONDE CACHÉ","Dean DeBlois",Support.DVD);
        Video video3 = new Video("ALITA : BATTLE ANGEL","Robert Rodriguez",Support.DVD);
        uneBibliotheque.addDocument(video1);
        uneBibliotheque.addDocument(video2);
        uneBibliotheque.addDocument(video3);

        System.out.println(uneBibliotheque.nombreDvd());

    }
}
