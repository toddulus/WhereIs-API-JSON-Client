package au.com.sensis.ems.map;

import au.com.sensis.ems.types.Bounds;

public class MapByBoundsRequest extends MapRequest {
    
    private Bounds bounds;

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
