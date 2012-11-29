package au.com.sensis.ems.map;

import au.com.sensis.ems.types.Bounds;
import au.com.sensis.ems.types.Point;

import java.math.BigDecimal;

public class ViewPort {

    /**
     * Bounds.
     */
    private Bounds bounds;

    /**
     * Centre point.
     */
    private Point centre;

    /**
     * Resolution.
     */
    private BigDecimal resolution;

    /**
     * X distance.
     */
    private Double x_distance;

    /**
     * Y distance.
     */
    private Double y_distance;

    /**
     * Zoom level.
     */
    private Integer zoom;


    /**
     * @return the bounds
     */
    public final Bounds getBounds() {
        return bounds;
    }
    /**
     * @param bounds the bounds to set
     */
    public final void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }
    /**
     * @return the centre
     */
    public final Point getCentre() {
        return centre;
    }
    /**
     * @param centre the centre to set
     */
    public final void setCentre(Point centre) {
        this.centre = centre;
    }
    /**
     * @return the resolution
     */
    public final BigDecimal getResolution() {
        return resolution;
    }
    /**
     * @param resolution the resolution to set
     */
    public final void setResolution(BigDecimal resolution) {
        this.resolution = resolution;
    }
    /**
     * @return the x_distance
     */
    public final Double getX_distance() {
        return x_distance;
    }
    /**
     * @param x_distance the x_distance to set
     */
    public final void setX_distance(Double x_distance) {
        this.x_distance = x_distance;
    }
    /**
     * @return the y_distance
     */
    public final Double getY_distance() {
        return y_distance;
    }
    /**
     * @param y_distance the y_distance to set
     */
    public final void setY_distance(Double y_distance) {
        this.y_distance = y_distance;
    }
    /**
     * @return the zoom
     */
    public final Integer getZoom() {
        return zoom;
    }
    /**
     * @param zoom the zoom to set
     */
    public final void setZoom(Integer zoom) {
        this.zoom = zoom;
    }
}
