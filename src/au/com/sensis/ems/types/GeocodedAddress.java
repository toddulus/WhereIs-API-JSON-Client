package au.com.sensis.ems.types;

public class GeocodedAddress {

    private String id;
    private Address address;
    private String granularity;
    private Point streetPoint;
    private Point centrePoint;
    private Bounds bounds;
    private boolean approximated;
    
    /**
     * @return the approximated
     */
    public boolean isApproximated() {
        return approximated;
    }
    /**
     * @param approximated the approximated to set
     */
    public void setApproximated(boolean approximated) {
        this.approximated = approximated;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    /**
     * @return the granularity
     */
    public String getGranularity() {
        return granularity;
    }
    /**
     * @param granularity the granularity to set
     */
    public void setGranularity(String granularity) {
        this.granularity = granularity;
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
}