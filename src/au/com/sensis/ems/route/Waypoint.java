package au.com.sensis.ems.route;

import au.com.sensis.ems.types.Point;
import au.com.sensis.ems.types.Street;

public class Waypoint {

    private Point streetPoint;
    private Point centrePoint;
    private Street street;
    
    public Waypoint() {
        
    }
    
    public Waypoint(double lon, double lat) {
        this.streetPoint = new Point(lon, lat);
    }
    /**
     * @return the streetPoint
     */
    public Point getStreetPoint() {
        return streetPoint;
    }
    /**
     * @param streetPoint the streetPoint to set
     */
    public void setStreetPoint(Point streetPoint) {
        this.streetPoint = streetPoint;
    }
    /**
     * @return the centrePoint
     */
    public Point getCentrePoint() {
        return centrePoint;
    }
    /**
     * @param centrePoint the centrePoint to set
     */
    public void setCentrePoint(Point centrePoint) {
        this.centrePoint = centrePoint;
    }
    /**
     * @return the street
     */
    public Street getStreet() {
        return street;
    }
    /**
     * @param street the street to set
     */
    public void setStreet(Street street) {
        this.street = street;
    }
}
