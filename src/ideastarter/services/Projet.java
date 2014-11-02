/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.services;

/**
 *
 * @author attia
 */
public class Projet {
    
    private String nom;
    private String description;
    private int nbrVues;
    private int nbrContributions;
    private int dateDebut;
    private String commentaire;
    private int budgetRequis;

    public Projet() {
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbrVues() {
        return nbrVues;
    }

    public void setNbrVues(int nbrVues) {
        this.nbrVues = nbrVues;
    }

    public int getNbrContributions() {
        return nbrContributions;
    }

    public void setNbrContributions(int nbrContributions) {
        this.nbrContributions = nbrContributions;
    }

    public int getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(int dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getBudgetRequis() {
        return budgetRequis;
    }

    public void setBudgetRequis(int budgetRequis) {
        this.budgetRequis = budgetRequis;
    }
    
    
}
