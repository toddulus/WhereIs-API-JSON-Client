package au.com.sensis.ems.route;

import au.com.sensis.ems.types.Bounds;


/**
 * Handle sub-subclass 
 * @author Todd Pierce
 * Twitter: {@literal @}Toddulus
 */
public class Segment {

    private int segmentId;
    private String roadType;
    // private Point[][] geometry; 
    private Bounds bounds;
    private double duration;
    /**
     * @return the segmentId
     */
    public int getSegmentId() {
        return segmentId;
    }
    /**
     * @param segmentId the segmentId to set
     */
    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }
    /**
     * @return the roadType
     */
    public String getRoadType() {
        return roadType;
    }
    /**
     * @param roadType the roadType to set
     */
    public void setRoadType(String roadType) {
        this.roadType = roadType;
    }
    /**
     * @return the geometry
     */
//    public Point[][] getGeometry() {
//        return geometry;
//    }
    /**
     * @param geometry the geometry to set
     */
//    public void setGeometry(Point[][] geometry) {
//        this.geometry = geometry;
//    }
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
     * @return the duration
     */
    public double getDuration() {
        return duration;
    }
    /**
     * @param duration the duration to set
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }
    
}
