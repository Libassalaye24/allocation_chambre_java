package models;

import java.time.LocalDate;

public abstract class Etudiant extends Personne{

    protected String matricule;
    protected LocalDate dateNaissance;
    
    public Etudiant(String nom, String prenom, String email, Integer telephone, String matricule,
            LocalDate dateNaissance) {
        super(nom, prenom, email, telephone);
        this.matricule = matricule;
        this.dateNaissance = dateNaissance;
    }

    Etudiant(){}
    
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }


    @Override
    public String toString() {
        return super.toString() + "matricule " + this.matricule + " : DateNaissance " 
        ;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    
}
