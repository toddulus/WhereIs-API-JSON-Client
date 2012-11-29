package au.com.sensis.ems.map;

import au.com.sensis.ems.types.Point;

public class MapByRadiusRequest extends MapRequest {
    
    /**
     * Centre point.
     */
    private Point centre;

    /**
     * Zoom level.
     */
    private Integer radius;

    /**
     * @return the centre
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * @param centre the centre to set
     */
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    /**
     * @return the radius
     */
    public Integer getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(Integer radius) {
        this.radius = radius;
    }


}
