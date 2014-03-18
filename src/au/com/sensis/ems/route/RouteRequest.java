package au.com.sensis.ems.route;

import au.com.sensis.ems.types.Point;

import java.util.Arrays;

public class RouteRequest extends BaseRouteRequest {
    
    private String imageFormat;

    private Waypoint[] waypoints;

    /**
     * Default constructor
     */
    public RouteRequest() {
        
    }

    /**
     * Constructor with start and end, default mode is CAR
     */
    public RouteRequest(Waypoint start, Waypoint end) {
        this(Mode.VEHICLE, start, end);
    }

    /**
     * Constructor with start and end
     */
    public RouteRequest(Mode mode, Waypoint start, Waypoint end) {
        this(mode, Arrays.asList(start, end).toArray(new Waypoint[0]));
    }

    /**
     * Constructor with mode and waypoints
     */
    public RouteRequest(Mode mode, Waypoint[] waypoints) {
        this.mode = mode;
        this.waypoints = waypoints;
    }

    /**
     * @return the imageFormat
     */
    public String getImageFormat() {
        return imageFormat;
    }
    /**
     * @param imageFormat the imageFormat to set
     */
    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }
    /**
     * @return the avoidPoints
     */
    public Point[] getAvoidPoints() {
        return avoidPoints;
    }
    /**
     * @param avoidPoints the avoidPoints to set
     */
    public void setAvoidPoints(Point[] avoidPoints) {
        this.avoidPoints = avoidPoints;
    }
    /**
     * @return the waypoints
     */
    public Waypoint[] getWaypoints() {
        return waypoints;
    }
    /**
     * @param waypoints the waypoints to set
     */
    public void setWaypoints(Waypoint[] waypoints) {
        this.waypoints = waypoints;
    }
}
