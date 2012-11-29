package au.com.sensis.ems.types;

public class Point {
    
    private double lon;
    
    private double lat;
    
    public Point() {
            
    }
    
    public Point(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }
    /**
     * @return the lon
     */
    public double getlon() {
        return lon;
    }
    /**
     * @param lon the lon to set
     */
    public void setlon(double lon) {
        this.lon = lon;
    }
    /**
     * @return the latitiude
     */
    public double getlat() {
        return lat;
    }
    /**
     * @param latitiude the latitiude to set
     */
    public void setlat(double lat) {
        this.lat = lat;
    }
    
    

}
