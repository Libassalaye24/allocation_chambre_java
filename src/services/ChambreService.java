package services;

import java.util.ArrayList;

import interfaces.IChambre;
import models.Chambre;
import models.EtatChambre;
import models.Pavillon;

public class ChambreService implements IChambre {

    private ArrayList<Chambre> bdChambres = new ArrayList<>();

    @Override
    public void addChambre(Chambre c) {
        bdChambres.add(c);
    }

    @Override
    public void afficheChambre() {
        for (Chambre chambre : bdChambres) {
            System.out.println(chambre);
        }
    }

    @Override
    public void addChambre(Chambre c, Pavillon p) {
        c.setPavillon(p);
        p.getChambres().add(c);
        bdChambres.add(c);
    }

    @Override
    public void archiveChambre(Chambre c) {
        c.setEtat(EtatChambre.ARCHIVER);
        for (int index = 0; index < bdChambres.size(); index++) {
            if (c.equals(bdChambres.get(index))) {
                bdChambres.set(index, c);
            }
        }
    }

    @Override
    public Chambre rechercheChambre(int id) {
        Chambre chambre = new Chambre();
        chambre.setId(id);

        for (Chambre ch : bdChambres) {
            if (chambre.equals(ch)) {
                return chambre;
            }
        }
        return null;
    }

    @Override
    public void modifierChambre(Chambre chambre) {
        for (int index = 0; index < bdChambres.size(); index++) {
            if (chambre.equals(bdChambres.get(index))) {
                bdChambres.set(index, chambre);
            }
        }
    }

    public ArrayList<Chambre> getBdChambres() {
        return bdChambres;
    }

    public void setBdChambres(ArrayList<Chambre> bdChambres) {
        this.bdChambres = bdChambres;
    }

    @Override
    public void afficheChambre(EtatChambre etatChambre) {

        for (Chambre chambre : bdChambres) {
            if (chambre.getEtat() == etatChambre) {
                System.out.println(chambre);
            }
        }
    }

    @Override
    public void supprimerChambre(Chambre c) {
        bdChambres.remove(c);
    }

}
