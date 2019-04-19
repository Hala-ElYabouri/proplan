package model;
// Generated Apr 19, 2019 1:41:01 AM by Hibernate Tools 3.6.0



/**
 * TacheATagId generated by hbm2java
 */
public class TacheATagId  implements java.io.Serializable {


     private int idTag;
     private int idTache;

    public TacheATagId() {
    }

    public TacheATagId(int idTag, int idTache) {
       this.idTag = idTag;
       this.idTache = idTache;
    }
   
    public int getIdTag() {
        return this.idTag;
    }
    
    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }
    public int getIdTache() {
        return this.idTache;
    }
    
    public void setIdTache(int idTache) {
        this.idTache = idTache;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TacheATagId) ) return false;
		 TacheATagId castOther = ( TacheATagId ) other; 
         
		 return (this.getIdTag()==castOther.getIdTag())
 && (this.getIdTache()==castOther.getIdTache());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdTag();
         result = 37 * result + this.getIdTache();
         return result;
   }   


}


