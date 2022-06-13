package interfaces;

import java.util.ArrayList;

import models.Chambre;
import models.Pavillon;

public interface IPavillon {
    
    public void addPavillon(Pavillon pavillon);
    public void affichePavillon();
    public void addPavillon(Pavillon pavillon, ArrayList<Chambre> chambres);
    public Pavillon recherchePavillon(int id);
    public void modifierPavillon(Pavillon c);



}
