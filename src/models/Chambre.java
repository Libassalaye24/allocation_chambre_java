package models;

import utils.generateId;

public class Chambre {

    private Integer id;
    private String numEtage;
    private TypeChambre Type;
    private String numChambre;
    private Pavillon pavillon;
    private EtatChambre etat;
    public static int nbr = 1;

    public EtatChambre getEtat() {
        return etat;
    }

    public void setEtat(EtatChambre etat) {
        this.etat = etat;
    }

    public Chambre(String numEtage, TypeChambre type, Pavillon pavillon, EtatChambre etat) {
        this.numEtage = numEtage;
        Type = type;
        this.id = nbr++;
        etat = EtatChambre.DISPONIBLE;
        this.numChambre = generateId.generateUniqueId();
        this.pavillon = pavillon;
    }

    public Chambre() {
        this.id = nbr++;
        etat = EtatChambre.DISPONIBLE;
        this.numChambre = generateId.generateUniqueId();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(String numEtage) {
        this.numEtage = numEtage;
    }

    public String getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(String numChambre) {
        this.numChambre = numChambre;
    }

    public TypeChambre getType() {
        return Type;
    }

    public void setType(TypeChambre type) {
        Type = type;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    @Override
    public String toString() {
        return "Chambre [Type=" + Type + ", etat=" + etat + ", id=" + id + ", numChambre=" + numChambre + ", numEtage="
                + numEtage + ", pavillon=" + pavillon + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return (((Chambre) obj).getId() == this.id);
    }

}
