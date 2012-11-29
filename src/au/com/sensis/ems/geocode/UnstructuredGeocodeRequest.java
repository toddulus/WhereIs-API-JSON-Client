package au.com.sensis.ems.geocode;

import au.com.sensis.ems.types.Bounds;

public class UnstructuredGeocodeRequest extends GeocodeRequest {

    private String query;
    
    private Bounds bounds;
    
    public UnstructuredGeocodeRequest() {
        super();
    }
    
    public UnstructuredGeocodeRequest(String query) {
        super();
        this.query = query;
    }

    /**
     * @return the query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query the query to set
     */
    public void setQuery(String query) {
        this.query = query;
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
