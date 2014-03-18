package au.com.sensis.ems.route;

import au.com.sensis.ems.types.Point;

public abstract class BaseRouteRequest {

    protected Mode mode;
    private Method method;
    private boolean tolls;
    protected Point[] avoidPoints;

    public BaseRouteRequest() {
        this(Mode.VEHICLE, Method.FASTEST, false);
    }
    
    public BaseRouteRequest(Mode mode, Method method, boolean tolls) {
        this.mode = mode;
        this.method = method;
        this.tolls = tolls;
    }

    /**
     * @return the mode
     */
    public Mode getMode() {
        return mode;
    }

    /**
     * @param mode the mode to set
     */
    public void setMode(Mode mode) {
        this.mode = mode;
    }

    /**
     * @return the method
     */
    public Method getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
    public void setMethod(Method method) {
        this.method = method;
    }

    /**
     * @return the tolls
     */
    public boolean isTolls() {
        return tolls;
    }

    /**
     * @param tolls the tolls to set
     */
    public void setTolls(boolean tolls) {
        this.tolls = tolls;
    }

}