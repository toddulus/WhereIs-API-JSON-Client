package au.com.sensis.ems.geocode;

import au.com.sensis.ems.types.Point;

public class ReverseGeocodeRequest extends GeocodeRequest {
    
    private int radius;

    private String[] granularity;

    
    public ReverseGeocodeRequest() {
        
    }
    
    public ReverseGeocodeRequest(Point point) {
        super();
        this.setLocation(point);
    }
    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return the granularity
     */
    public String[] getGranularity() {
        return granularity;
    }

    /**
     * @param granularity the granularity to set
     */
    public void setGranularity(String[] granularity) {
        this.granularity = granularity;
    }
    

}
