package au.com.sensis.ems.geocode;

import au.com.sensis.ems.types.Pagination;
import au.com.sensis.ems.types.Point;

public abstract class GeocodeRequest {
    
    private Point location;
    
    private Pagination pagination;
    
    private String[] granularities;

    /**
     * @return the granularities
     */
    public String[] getGranularities() {
        return granularities;
    }
    /**
     * @param granularities the granularities to set
     */
    public void setGranularities(String[] granularities) {
        this.granularities = granularities;
    }
    /**
     * @return the location
     */
    public Point getLocation() {
        return location;
    }
    /**
     * @param location the location to set
     */
    public void setLocation(Point location) {
        this.location = location;
    }
    /**
     * @return the pagination
     */
    public Pagination getPagination() {
        return pagination;
    }
    /**
     * @param pagination the pagination to set
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
    
    

}
