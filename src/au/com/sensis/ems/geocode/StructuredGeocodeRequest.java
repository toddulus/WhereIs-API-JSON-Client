package au.com.sensis.ems.geocode;

import au.com.sensis.ems.types.Address;
import au.com.sensis.ems.types.Bounds;

public class StructuredGeocodeRequest extends GeocodeRequest {

    private Address address;
    
    private Bounds bounds;

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
