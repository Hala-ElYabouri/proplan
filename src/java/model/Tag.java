package model;
// Generated Apr 19, 2019 1:41:01 AM by Hibernate Tools 3.6.0



/**
 * Tag generated by hbm2java
 */
public class Tag  implements java.io.Serializable {


     private Integer idTag;
     private Projet projet;
     private String nomTag;

    public Tag() {
    }

    public Tag(Projet projet, String nomTag) {
       this.projet = projet;
       this.nomTag = nomTag;
    }
   
    public Integer getIdTag() {
        return this.idTag;
    }
    
    public void setIdTag(Integer idTag) {
        this.idTag = idTag;
    }
    public Projet getProjet() {
        return this.projet;
    }
    
    public void setProjet(Projet projet) {
        this.projet = projet;
    }
    public String getNomTag() {
        return this.nomTag;
    }
    
    public void setNomTag(String nomTag) {
        this.nomTag = nomTag;
    }




}


