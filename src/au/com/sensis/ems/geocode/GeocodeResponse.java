package au.com.sensis.ems.geocode;

import au.com.sensis.ems.types.GeocodedAddress;
import au.com.sensis.ems.types.Pagination;

/**
 * GeocodeResponse - Objectification of geocode stuff
 * @author Todd Pierce
 * Twitter: {@literal @}Toddulus
 *
 */
public class GeocodeResponse {
    
    private GeocodedAddress[] results;

    private Pagination pagination;
    
    /**
     * @return the results
     */
    public GeocodedAddress[] getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(GeocodedAddress[] results) {
        this.results = results;
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
