package model;
// Generated Apr 19, 2019 1:41:01 AM by Hibernate Tools 3.6.0



/**
 * TacheATag generated by hbm2java
 */
public class TacheATag  implements java.io.Serializable {


     private TacheATagId id;
     private Tache tacheByIdTag;
     private Tache tacheByIdTache;

    public TacheATag() {
    }

    public TacheATag(TacheATagId id, Tache tacheByIdTag, Tache tacheByIdTache) {
       this.id = id;
       this.tacheByIdTag = tacheByIdTag;
       this.tacheByIdTache = tacheByIdTache;
    }
   
    public TacheATagId getId() {
        return this.id;
    }
    
    public void setId(TacheATagId id) {
        this.id = id;
    }
    public Tache getTacheByIdTag() {
        return this.tacheByIdTag;
    }
    
    public void setTacheByIdTag(Tache tacheByIdTag) {
        this.tacheByIdTag = tacheByIdTag;
    }
    public Tache getTacheByIdTache() {
        return this.tacheByIdTache;
    }
    
    public void setTacheByIdTache(Tache tacheByIdTache) {
        this.tacheByIdTache = tacheByIdTache;
    }




}


