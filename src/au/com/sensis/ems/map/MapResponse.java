package au.com.sensis.ems.map;

public class MapResponse {
    
    private ViewPort viewPort;
    private String url;
    private String encodedGraphic;
    /**
     * @return the viewPort
     */
    public ViewPort getViewPort() {
        return viewPort;
    }
    /**
     * @param viewPort the viewPort to set
     */
    public void setViewPort(ViewPort viewPort) {
        this.viewPort = viewPort;
    }
    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }
    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /**
     * @return the encodedGraphic
     */
    public String getEncodedGraphic() {
        return encodedGraphic;
    }
    /**
     * @param encodedGraphic the encodedGraphic to set
     */
    public void setEncodedGraphic(String encodedGraphic) {
        this.encodedGraphic = encodedGraphic;
    }

}
