package au.com.sensis.ems.route;

import au.com.sensis.ems.types.Bounds;
import au.com.sensis.ems.types.Point;

/**
 * Leg subclass 
 * @author Todd Pierce
 * Twitter: {@literal @}Toddulus
 */
public class Leg {
    private double distance;
    private double duration;
    private Point startPoint;
    private Point endPoint;
    private Bounds bounds;
    private Segment[] segments;

    /**
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }




    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }




    /**
     * @return the duration
     */
    public double getDuration() {
        return duration;
    }




    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }




    /**
     * @return the startPoint
     */
    public Point getStartPoint() {
        return startPoint;
    }




    /**
     * @param startPoint the startPoint to set
     */
    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }




    /**
     * @return the endPoint
     */
    public Point getEndPoint() {
        return endPoint;
    }




    /**
     * @param endPoint the endPoint to set
     */
    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }




    /**
     * @return the bounds
     */
    public Bounds getBounds() {
        return bounds;
    }




    /**
     * @param bounds the bounds to set
     */
    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }




    /**
     * @return the segments
     */
    public Segment[] getSegments() {
        return segments;
    }




    /**
     * @param segments the segments to set
     */
    public void setSegments(Segment[] segments) {
        this.segments = segments;
    }
}