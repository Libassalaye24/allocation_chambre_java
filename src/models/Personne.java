package models;

public abstract class Personne {
    
    protected Integer id;
   
    protected String nom;
    protected String prenom;
    protected String email;
    protected Integer telephone;
    protected TypePersonne type;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String toString() {
        return "Nom " + this.nom +
           " : Prenom " + this.prenom +
           ", email " + this.email +
           ", telephone " + this.telephone;
    }
    public boolean equals(Object obj) {
        return (((Personne) obj).getId() == this.id);
    }

    Personne(){}
    Personne(String nom,String prenom,String email,Integer telephone){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getTelephone() {
        return telephone;
    }
    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
   
    public TypePersonne getType() {
        return type;
    }
    public void setType(TypePersonne type) {
        this.type = type;
    }
    
}
