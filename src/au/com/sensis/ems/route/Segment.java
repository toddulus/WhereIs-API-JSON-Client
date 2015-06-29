package au.com.sensis.ems.route;

import au.com.sensis.ems.types.Bounds;
import au.com.sensis.ems.types.Point;


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
    private double distance;
    private Point startPoint;
    private SegmentInstruction instruction;
    

    /**
     * @return the instruction
     */
    public SegmentInstruction getInstruction() {
        return instruction;
    }
    /**
     * @param instruction the instruction to set
     */
    public void setInstruction(SegmentInstruction instruction) {
        this.instruction = instruction;
    }
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
    
    public class SegmentInstruction {
        
        private String street;
        /**
         * @return the street
         */
        public String getStreet() {
            return street;
        }
        /**
         * @return the suburb
         */
        public String getSuburb() {
            return suburb;
        }
        /**
         * @return the textualInstruction
         */
        public String getTextualInstruction() {
            return textualInstruction;
        }
        /**
         * @param street the street to set
         */
        public void setStreet(String street) {
            this.street = street;
        }
        /**
         * @param suburb the suburb to set
         */
        public void setSuburb(String suburb) {
            this.suburb = suburb;
        }
        /**
         * @param textualInstruction the textualInstruction to set
         */
        public void setTextualInstruction(String textualInstruction) {
            this.textualInstruction = textualInstruction;
        }
        private String suburb;
        private String textualInstruction;
        
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
    
}
