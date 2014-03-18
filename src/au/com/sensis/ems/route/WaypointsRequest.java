package au.com.sensis.ems.route;

import java.util.List;

public class WaypointsRequest extends BaseRouteRequest {
    
    private Waypoint startPoint;
    
    private Waypoint endPoint;
    
    private List<Waypoint> waypoints;
    
    public WaypointsRequest(Waypoint startPoint, Waypoint endPoint, List<Waypoint> waypoints) {
        super();
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.waypoints = waypoints;
    }

    public WaypointsRequest(Waypoint startPoint, Waypoint endPoint, List<Waypoint> waypoints, Mode mode, Method method, boolean tolls) {
        super(mode, method, tolls);
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.waypoints = waypoints;
    }
    
    /**
     * @return the waypoints
     */
    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

    /**
     * @param waypoints the waypoints to set
     */
    public void setWaypoints(List<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }

    /**
     * @return the startPoint
     */
    public Waypoint getStartPoint() {
        return startPoint;
    }

    /**
     * @return the endPoint
     */
    public Waypoint getEndPoint() {
        return endPoint;
    }

    /**
     * @param startPoint the startPoint to set
     */
    public void setStartPoint(Waypoint startPoint) {
        this.startPoint = startPoint;
    }

    /**
     * @param endPoint the endPoint to set
     */
    public void setEndPoint(Waypoint endPoint) {
        this.endPoint = endPoint;
    }
    
    

}
