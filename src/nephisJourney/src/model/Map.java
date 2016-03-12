package nephisJourney.src.model;

import java.io.Serializable;

/**
 *
 * @author adamh_000
 */
public class Map implements Serializable {

    //class instance variables
    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    public Map() {
    }

    public Map(int rowCount, int columnCount) {
        if (rowCount < 1 || columnCount < 1) {
        System.out.println("The number of rows and columns must"
                + " be greater than zero.");
        return;
    
    }
     
    this.rowCount = rowCount;

     
    this.columnCount = columnCount;

    // create a 2-D array for Location objects
     
    this.locations = new Location[rowCount][columnCount];

    for (int row = 0; row < rowCount; row++) {
        for (int column = 0; column < columnCount; column++) {
            // create and initialize new Location object instance
            Location location = new Location();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);

            // assign the Location object to the 
            // current position in array
            locations[row][column] = location;
        }
    }
    }

public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
        public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.rowCount;
        hash = 89 * hash + this.columnCount;
        return hash;
    }

    
    @Override
        public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }
    @Override
        public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    public void setrowCount(int i) {
        System.out.println("*** setrowCount stub function called ***");
    }

    public void setcolumnCount(int i) {
        System.out.println("*** setcolumncount stub function called ***");
    }

    public Location[][] getLocations() {
        System.out.println("*** getLocations stub function called ***");
        return null;
    }
    
    
    
}
