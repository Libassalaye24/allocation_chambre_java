package models;

import java.time.LocalDate;

public class EtudiantNonBoursier extends Etudiant{
    
    private String adresse;

    public EtudiantNonBoursier(String nom, String prenom, String email, Integer telephone, String matricule,
            LocalDate dateNaissance, String adresse) {
        super(nom, prenom, email, telephone, matricule, dateNaissance);
        this.adresse = adresse;
    }

    public EtudiantNonBoursier() {}

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return super.toString()+"EtudiantNonBoursier [adresse=" + adresse ;
    }

}
