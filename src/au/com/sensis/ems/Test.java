package au.com.sensis.ems;

import au.com.sensis.ems.geocode.GeocodeResponse;
import au.com.sensis.ems.geocode.UnstructuredGeocodeRequest;
import au.com.sensis.ems.map.Layer;
import au.com.sensis.ems.map.MapByZoomRequest;
import au.com.sensis.ems.map.MapResponse;
import au.com.sensis.ems.route.RouteRequest;
import au.com.sensis.ems.route.RouteResponse;
import au.com.sensis.ems.route.Waypoint;
import au.com.sensis.ems.types.Point;

import org.apache.log4j.Level;

import org.apache.log4j.Logger;

import java.io.IOException;

public class Test {
    
    public static void main(String[] args) {
        
        WhereisApiClient client = new WhereisApiClient(args[0], args[1], args[2]);
        try {
            GeocodeResponse unstructured = client.getUnstructuredGeocode(new UnstructuredGeocodeRequest("222 lonsdale street"));
            for (int i=0;i<unstructured.getResults().length;i++) {
                System.out.println(unstructured.getResults()[i].getAddress().getDisplay());
            }

            RouteResponse routeResponse = client.getRoute(new RouteRequest(new Waypoint(145.00, -33.89), new Waypoint(143.00, -32.89)));
            System.out.println(routeResponse.getRoute().getHandle().getId());

            MapByZoomRequest mapByZoomRequest = new MapByZoomRequest();
            Layer[] layers = {Layer.STREET};
            mapByZoomRequest.setLayers(layers);
            mapByZoomRequest.setCentre(new Point(145.00, -37.5));
            mapByZoomRequest.setHeight(500);
            mapByZoomRequest.setWidth(500);
            mapByZoomRequest.setZoom(10);
            MapResponse mapResponse = client.getMapByZoom(mapByZoomRequest); 
            System.out.println(mapResponse.getUrl());
            
        } catch (WhereisApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
        


}
