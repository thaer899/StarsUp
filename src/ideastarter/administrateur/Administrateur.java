/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.administrateur;

/**
 *
 * @author attia
 */
public class Administrateur {
    private String Nom;
    private String Prenom;
    private String Pseudo;
    private String MotPasse;
    private String Email;

    public Administrateur() {
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String Pseudo) {
        this.Pseudo = Pseudo;
    }

    public String getMotPasse() {
        return MotPasse;
    }

    public void setMotPasse(String MotPasse) {
        this.MotPasse = MotPasse;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
