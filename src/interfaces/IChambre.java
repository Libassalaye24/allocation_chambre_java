package interfaces;

import models.Chambre;
import models.EtatChambre;
import models.Pavillon;

public interface IChambre {
    
    public void addChambre(Chambre c);
    public void afficheChambre();
    public void afficheChambre(EtatChambre etatChambre);
    public void addChambre(Chambre c,Pavillon p);
    public void archiveChambre(Chambre c);
    public void supprimerChambre(Chambre c);
    public Chambre rechercheChambre(int id);
    public void modifierChambre(Chambre c);


}
