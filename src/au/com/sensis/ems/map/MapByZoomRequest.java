package au.com.sensis.ems.map;

import au.com.sensis.ems.types.Point;

public class MapByZoomRequest extends MapRequest {
    
    /**
     * Centre point.
     */
    private Point centre;

    /**
     * Zoom level.
     */
    private Integer zoom;

    /**
     * @return the centre
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * @param centre the centre to set
     */
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    /**
     * @return the zoom
     */
    public Integer getZoom() {
        return zoom;
    }

    /**
     * @param zoom the zoom to set
     */
    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }


}
