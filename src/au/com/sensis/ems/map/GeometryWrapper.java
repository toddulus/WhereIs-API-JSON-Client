package au.com.sensis.ems.map;

public class GeometryWrapper {

    private Style style;
    private GeometryType type;
    private Geometry[] values;

    public GeometryWrapper() {
        
    }
    
    public GeometryWrapper(Style style, GeometryType type, Geometry[] values) {
        this.style = style;
        this.type = type;
        this.values = values;
    }
    
    /**
     * @return the style
     */
    public Style getStyle() {
        return style;
    }
    /**
     * @return the type
     */
    public GeometryType getType() {
        return type;
    }
    /**
     * @return the values
     */
    public Geometry[] getValues() {
        return values;
    }
    /**
     * @param style the style to set
     */
    public void setStyle(Style style) {
        this.style = style;
    }
    /**
     * @param type the type to set
     */
    public void setType(GeometryType type) {
        this.type = type;
    }
    /**
     * @param values the values to set
     */
    public void setValues(Geometry[] values) {
        this.values = values;
    }
}
