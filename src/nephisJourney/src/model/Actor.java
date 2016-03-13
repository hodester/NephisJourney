package nephisJourney.src.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author adamh_000
 */
public class Actor implements Serializable {

    private final String description;
    private final Point coordinates;

    public Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String name = null;
        return "Actor{" + "name=" + name + ", description="
                + description + ", coordinates=" + coordinates + '}';
    }

}
