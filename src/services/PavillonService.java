package services;

import java.util.ArrayList;

import interfaces.IPavillon;
import models.Chambre;
import models.Pavillon;

public class PavillonService implements IPavillon {

    private ArrayList<Pavillon> bdPavillons = new ArrayList<>();

    @Override
    public void addPavillon(Pavillon pavillon) 
    {
        bdPavillons.add(pavillon);
    }

    @Override
    public void addPavillon(Pavillon pavillon, ArrayList<Chambre> chambres) 
    {
        pavillon.getChambres().addAll(chambres);
        bdPavillons.add(pavillon);

    }

    @Override
    public void affichePavillon() 
    {
        for (Pavillon pavillon : bdPavillons) {
            System.out.println(pavillon);
        }
    }

    @Override
    public void modifierPavillon(Pavillon pavillon) 
    {

        for (int index = 0; index < bdPavillons.size(); index++) {
            if (pavillon.equals(bdPavillons.get(index))) {
                bdPavillons.set(index, pavillon);
            }
        }

    }

    @Override
    public Pavillon recherchePavillon(int id) 
    {
        Pavillon pavillon = new Pavillon();
        pavillon.setId(id);

        for (Pavillon pv : bdPavillons) {
            if (pavillon.equals(pv)) {
                return pavillon;
            }
        }
        return null;
    }

    public ArrayList<Pavillon> getBdPavillons() 
    {
        return bdPavillons;
    }

    public void setBdPavillons(ArrayList<Pavillon> bdPavillons) 
    {
        this.bdPavillons = bdPavillons;
    }

}
