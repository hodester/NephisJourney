package nephisJourney.src.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Hodes
 */
public class LiahonaReferences implements Serializable{
    //class instance variables
    private String locationName;
    private String scriptureReference;

    public LiahonaReferences() {
    }
    
    

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getScriptureReference() {
        return scriptureReference;
    }

    public void setScriptureReference(String scriptureReference) {
        this.scriptureReference = scriptureReference;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.locationName);
        hash = 71 * hash + Objects.hashCode(this.scriptureReference);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LiahonaReferences other = (LiahonaReferences) obj;
        if (!Objects.equals(this.locationName, other.locationName)) {
            return false;
        }
        if (!Objects.equals(this.scriptureReference, other.scriptureReference)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LiahonaReferences{" + "locationName=" + locationName + ", scriptureReference=" + scriptureReference + '}';
    }
    
    
}
