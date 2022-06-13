package models;

import java.util.ArrayList;

public class Pavillon {

    private Integer id;
    private String numPavillon;
    private String nbrEtage;
    private ArrayList<Chambre> chambres = new ArrayList<Chambre>();
    private static int nbr =1;
   
    public Pavillon(){
        this.id = nbr++;

    }
    public Pavillon(String numPavillon, String nbrEtage) {
        this.id = nbr++;
        this.numPavillon = numPavillon;
        this.nbrEtage = nbrEtage;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumPavillon() {
        return numPavillon;
    }
    public void setNumPavillon(String numPavillon) {
        this.numPavillon = numPavillon;
    }
    public String getNbrEtage() {
        return nbrEtage;
    }
    public void setNbrEtage(String nbrEtage) {
        this.nbrEtage = nbrEtage;
    }
    public ArrayList<Chambre> getChambres() {
        return chambres;
    }
    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }
   
    @Override
    public boolean equals(Object obj) {
      return (((Pavillon) obj).getId() == this.id);
    }
    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nbrEtage=" + nbrEtage + ", numPavillon=" + numPavillon + "]";
    }
    
}
