package model;
// Generated Apr 19, 2019 1:41:01 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Groupe generated by hbm2java
 */
public class Groupe  implements java.io.Serializable {


     private Integer idGroupe;
     private String nomGroupe;
     private Set groupeAUtilisateurs = new HashSet(0);
     private Set projetAGroupes = new HashSet(0);

    public Groupe() {
    }

	
    public Groupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }
    public Groupe(String nomGroupe, Set groupeAUtilisateurs, Set projetAGroupes) {
       this.nomGroupe = nomGroupe;
       this.groupeAUtilisateurs = groupeAUtilisateurs;
       this.projetAGroupes = projetAGroupes;
    }
   
    public Integer getIdGroupe() {
        return this.idGroupe;
    }
    
    public void setIdGroupe(Integer idGroupe) {
        this.idGroupe = idGroupe;
    }
    public String getNomGroupe() {
        return this.nomGroupe;
    }
    
    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }
    public Set getGroupeAUtilisateurs() {
        return this.groupeAUtilisateurs;
    }
    
    public void setGroupeAUtilisateurs(Set groupeAUtilisateurs) {
        this.groupeAUtilisateurs = groupeAUtilisateurs;
    }
    public Set getProjetAGroupes() {
        return this.projetAGroupes;
    }
    
    public void setProjetAGroupes(Set projetAGroupes) {
        this.projetAGroupes = projetAGroupes;
    }




}


