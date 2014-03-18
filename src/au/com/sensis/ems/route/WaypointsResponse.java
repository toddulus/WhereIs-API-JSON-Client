package au.com.sensis.ems.route;

import java.util.List;

public class WaypointsResponse {
    
    private Waypoint startPoint;
    private Waypoint endPoint;
    private List<Waypoint> waypoints;
    private List<Integer> order;
    private RouteRequest routeRequest;
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
     * @return the waypoints
     */
    public List<Waypoint> getWaypoints() {
        return waypoints;
    }
    /**
     * @return the order
     */
    public List<Integer> getOrder() {
        return order;
    }
    /**
     * @return the routeRequest
     */
    public RouteRequest getRouteRequest() {
        return routeRequest;
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
    /**
     * @param waypoints the waypoints to set
     */
    public void setWaypoints(List<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }
    /**
     * @param order the order to set
     */
    public void setOrder(List<Integer> order) {
        this.order = order;
    }
    /**
     * @param routeRequest the routeRequest to set
     */
    public void setRouteRequest(RouteRequest routeRequest) {
        this.routeRequest = routeRequest;
    }
    
    
    

}
