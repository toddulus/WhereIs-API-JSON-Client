package au.com.sensis.ems.types;

public class Street {
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the suffix
     */
    public String getSuffix() {
        return suffix;
    }
    /**
     * @param suffix the suffix to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    private String name;
    private String suffix;
    private String type;

}
