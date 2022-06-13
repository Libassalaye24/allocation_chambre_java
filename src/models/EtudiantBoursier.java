package models;

import java.time.LocalDate;

public class EtudiantBoursier extends Etudiant {

    private TypeBourse typeBourse;
    private Bourse valeur;
    public Bourse getValeur() {
        return valeur;
    }
    public void setValeur(Bourse valeur) {
        this.valeur = valeur;
    }

    private Chambre chambre;

    public EtudiantBoursier(String nom, String prenom, String email, Integer telephone, String matricule,
            LocalDate dateNaissance, TypeBourse typeBourse, Bourse valeur, Chambre chambre) {
        super(nom, prenom, email, telephone, matricule, dateNaissance);
        this.typeBourse = typeBourse;
        this.valeur = valeur;
        this.chambre = chambre;
    }
    public EtudiantBoursier() {}
   
    public TypeBourse getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(TypeBourse typeBourse) {
        this.typeBourse = typeBourse;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
    @Override
    public String toString() {
        return super.toString() + "EtudiantBoursier [chambre=" + chambre + ", typeBourse=" + typeBourse + ", valeur=" + valeur + "]";
    }

   
}
