package models;

public class Responsable extends Personne{
    
    private String password;

    public Responsable() {}

    public Responsable(String nom, String prenom, String email, Integer telephone, String password) {
        super(nom, prenom, email, telephone);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString()+" Responsable [password=" + password + "]";
    }

}
