package model;
// Generated Apr 19, 2019 1:41:01 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Utilisateur generated by hbm2java
 */
public class Utilisateur  implements java.io.Serializable {


     private Integer idUtilisateur;
     private String nomUtilisateur;
     private String motDePasse;
     private String nom;
     private String prenom;
     private String email;
     private String role;
     private byte[] avatarChemin;
     private Date dateInscription;
     private Date dateModification;
     private Set groupeAUtilisateurs = new HashSet(0);
     private Set commentaires = new HashSet(0);
     private Set projetActivites = new HashSet(0);
     private Set fichiers = new HashSet(0);

    public Utilisateur() {
    }

	
    public Utilisateur(String nomUtilisateur, String motDePasse, String nom, String prenom, String email, String role, byte[] avatarChemin, Date dateInscription, Date dateModification) {
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.role = role;
        this.avatarChemin = avatarChemin;
        this.dateInscription = dateInscription;
        this.dateModification = dateModification;
    }
    public Utilisateur(String nomUtilisateur, String motDePasse, String nom, String prenom, String email, String role, byte[] avatarChemin, Date dateInscription, Date dateModification, Set groupeAUtilisateurs, Set commentaires, Set projetActivites, Set fichiers) {
       this.nomUtilisateur = nomUtilisateur;
       this.motDePasse = motDePasse;
       this.nom = nom;
       this.prenom = prenom;
       this.email = email;
       this.role = role;
       this.avatarChemin = avatarChemin;
       this.dateInscription = dateInscription;
       this.dateModification = dateModification;
       this.groupeAUtilisateurs = groupeAUtilisateurs;
       this.commentaires = commentaires;
       this.projetActivites = projetActivites;
       this.fichiers = fichiers;
    }
   
    public Integer getIdUtilisateur() {
        return this.idUtilisateur;
    }
    
    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
    public String getNomUtilisateur() {
        return this.nomUtilisateur;
    }
    
    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }
    public String getMotDePasse() {
        return this.motDePasse;
    }
    
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    public byte[] getAvatarChemin() {
        return this.avatarChemin;
    }
    
    public void setAvatarChemin(byte[] avatarChemin) {
        this.avatarChemin = avatarChemin;
    }
    public Date getDateInscription() {
        return this.dateInscription;
    }
    
    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
    public Date getDateModification() {
        return this.dateModification;
    }
    
    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }
    public Set getGroupeAUtilisateurs() {
        return this.groupeAUtilisateurs;
    }
    
    public void setGroupeAUtilisateurs(Set groupeAUtilisateurs) {
        this.groupeAUtilisateurs = groupeAUtilisateurs;
    }
    public Set getCommentaires() {
        return this.commentaires;
    }
    
    public void setCommentaires(Set commentaires) {
        this.commentaires = commentaires;
    }
    public Set getProjetActivites() {
        return this.projetActivites;
    }
    
    public void setProjetActivites(Set projetActivites) {
        this.projetActivites = projetActivites;
    }
    public Set getFichiers() {
        return this.fichiers;
    }
    
    public void setFichiers(Set fichiers) {
        this.fichiers = fichiers;
    }




}


