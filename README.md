WhereIs-API-JSON-Client
=======================

A Java client for WhereIs API v2

To use, make sure you are registered to use Whereis API 2, and have a valid token and password. Go do that now, while I wait here.

Oh, you're back? Good, let's continue. Here's how you use it:


<code>

    // create the client
    WhereisApiClient client = new WhereisApiClient(TOKEN, PASSWORD, PATH_TO_WHEREIS_API);

    // geocode request
    GeocodeResponse unstructured = client.getUnstructuredGeocode(new UnstructuredGeocodeRequest("222 lonsdale street, melbourne"));
    
    //perform route request
    RouteResponse routeResponse = client.getRoute(new RouteRequest(new Waypoint(145.00, -33.89), new Waypoint(143.00, -32.89)));
    
    // perform simple map request
    MapByZoomRequest mapByZoomRequest = new MapByZoomRequest();
    Layer[] layers = {Layer.STREET};
    mapByZoomRequest.setLayers(layers);
    mapByZoomRequest.setCentre(new Point(145.00, -37.5));
    mapByZoomRequest.setHeight(500);
    mapByZoomRequest.setWidth(500);
    mapByZoomRequest.setZoom(10);
    MapResponse mapResponse = client.getMapByZoom(mapByZoomRequest); 
    
    // and many many more
</code> 

