package au.com.sensis.ems.map;

public class MapRequest {

    /**
     * Height in pixels.
     */
    private Integer height;

    /**
     * Width in pixels.
     */
    private Integer width;

    /**
     * List of requested layers.
     */
    private Layer[] layers;

    /**
     * List of geometry data.
     */
    private GeometryWrapper[] mapData;

    /**
     * @return the height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * @return the layers
     */
    public Layer[] getLayers() {
        return layers;
    }

    /**
     * @param layers the layers to set
     */
    public void setLayers(Layer[] layers) {
        this.layers = layers;
    }

    /**
     * @return the mapData
     */
    public GeometryWrapper[] getMapData() {
        return mapData;
    }

    /**
     * @param mapData the mapData to set
     */
    public void setMapData(GeometryWrapper[] mapData) {
        this.mapData = mapData;
    }

}
