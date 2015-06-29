package au.com.sensis.ems;

import au.com.sensis.ems.detail.DetailRequest;
import au.com.sensis.ems.detail.DetailResponse;
import au.com.sensis.ems.geocode.GeocodeResponse;
import au.com.sensis.ems.geocode.ReverseGeocodeRequest;
import au.com.sensis.ems.geocode.StructuredGeocodeRequest;
import au.com.sensis.ems.geocode.UnstructuredGeocodeRequest;
import au.com.sensis.ems.map.MapByBoundsRequest;
import au.com.sensis.ems.map.MapByRadiusRequest;
import au.com.sensis.ems.map.MapByZoomRequest;
import au.com.sensis.ems.map.MapRequest;
import au.com.sensis.ems.map.MapResponse;
import au.com.sensis.ems.rank.RankRequest;
import au.com.sensis.ems.route.RouteRequest;
import au.com.sensis.ems.route.RouteResponse;
import au.com.sensis.ems.route.WaypointsRequest;
import au.com.sensis.ems.route.WaypointsResponse;
import au.com.sensis.ems.validation.ValidationResponse;

import org.apache.http.conn.params.ConnRoutePNames;

import org.apache.http.HttpHost;

import org.apache.log4j.Logger;


import org.apache.http.impl.client.BasicResponseHandler;

import org.apache.http.client.ResponseHandler;

import com.google.gson.Gson;

import org.apache.http.entity.StringEntity;

import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.client.HttpClient;

import org.apache.http.client.methods.HttpPost;

import org.apache.http.HttpResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Whereis API Client - Unofficial Java client for the Whereis JSON API
 * To use this you need to be a registered user of the API, so get onto that first. Come back here when you're done. I'll wait. 
 *
 * Hi, welcome back. Did you get the token and password? Good. Now we can get started. To use, do something like this:
 *     {@code 
 *     WhereisApiClient client = new WhereisApiClient(TOKEN, PASSWORD, PATH_TO_WHEREIS_API);
 *     // geocode request
 *     GeocodeResponse unstructured = client.getUnstructuredGeocode(new UnstructuredGeocodeRequest("222 lonsdale street, melbourne"));
 *
 *     //perform route request
 *     RouteResponse routeResponse = client.getRoute(new RouteRequest(new Waypoint(145.00, -33.89), new Waypoint(143.00, -32.89)));
 *
 *     // perform static map request
 *     MapByZoomRequest mapByZoomRequest = new MapByZoomRequest();
 *     Layer[] layers = {Layer.STREET};
 *     mapByZoomRequest.setLayers(layers);
 *     mapByZoomRequest.setCentre(new Point(145.00, -37.5));
 *     mapByZoomRequest.setHeight(500);
 *     mapByZoomRequest.setWidth(500);
 *     mapByZoomRequest.setZoom(10);
 *     MapResponse mapResponse = client.getMapByZoom(mapByZoomRequest); 
 *     }
 * @author Todd Pierce {@literal @}Toddulus
 * 
 *
 */
public class WhereisApiClient {

    /**
     * The user token
     */
    private final String TOKEN;
    
    /**
     * User password
     */
    private final String PASSWORD;
    
    /**
     * Base URL for Whereis API JSON Service
     */
    private final String BASE_URL;
    
    private final String PROXY_URL;

    /**
     * Create an instance of the Whereis API Client 
     * @param TOKEN a valid Whereis API token
     * @param PASSWORD a valid Whereis API password
     * @param BASE_URL path to an instance of the Whereis JSON API, e.g. http://api.ems.sensis.com.au/v2/service
     */
    public WhereisApiClient(String TOKEN, String PASSWORD, String BASE_URL) {
        this(TOKEN, PASSWORD, BASE_URL, null);
    }

    public WhereisApiClient(String TOKEN, String PASSWORD, String BASE_URL, String PROXY_URL) {
        this.TOKEN = TOKEN;
        this.PASSWORD = PASSWORD;
        this.BASE_URL = BASE_URL;
        this.PROXY_URL = PROXY_URL;
        
    }

    protected String getToken() {
        return this.TOKEN;
    }

    protected String getPassword() {
        return this.PASSWORD;
    }

    protected String getBaseUrl() {
        return this.BASE_URL;
    }

    /**
     * Get a detail response for a suburb, postcode or region
     * @param req a DetailRequest
     * @return DetailResponse
     */
    public DetailResponse getDetail(DetailRequest req) throws WhereisApiException {
        throw new WhereisApiException("Function not implemented");
    }

    /**
     * Get a map response for a map request
     *
     * @param req a DetailRequest
     * @return DetailResponse
     */
    public MapResponse getMap(MapRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Accept", "application/json;image/png");
        String jsonResp = doPost("/map", jsonReq, headers);
        return gson.fromJson(jsonResp, MapResponse.class);
    }
    
    /**
     * Perform a map by zoom request
     * @param req a MapByZoomRequest
     * @return MapResponse
     */
    public MapResponse getMapByZoom(MapByZoomRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Accept", "application/json;image/png");
        String jsonResp = doPost("/map/by_zoom", jsonReq, headers);
        return gson.fromJson(jsonResp, MapResponse.class);
    }

    /**
     * Perform a map by radius request
     * @param req a MapByRadiusRequest
     * @return MapResponse
     */
    public MapResponse getMapByRadius(MapByRadiusRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Accept", "application/json;image/png");
        String jsonResp = doPost("/map/by_radius", jsonReq, headers);
        return gson.fromJson(jsonResp, MapResponse.class);
    }

    /**
     * Perform a map by bounds request
     * @param req a MapByBoundsRequest
     * @return MapResponse
     */
    public MapResponse getMapByBounds(MapByBoundsRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Accept", "application/json;image/png");
        String jsonResp = doPost("/map/by_bounds", jsonReq, headers);
        return gson.fromJson(jsonResp, MapResponse.class);
    }

    /**
     * Get a detail response for a suburb, postcode or region
     * @param req a DetailRequest
     * @return DetailResponse
     */
    public DetailResponse getRank(RankRequest req) throws WhereisApiException {
        throw new WhereisApiException("Function not implemented");
    }

    /**
     * Perform a reverse geocode look up
     * @param req a ReverseGeocodeRequest
     * @return GeocodeResponse
     */
    public GeocodeResponse getReverseGeocode(ReverseGeocodeRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        String jsonResp = doPost("/geocode/reverse", jsonReq);
        return gson.fromJson(jsonResp, GeocodeResponse.class);
    }

    /**
     * Perform a structured geocode look up
     * @param req a StructuredGeocodeRequest
     * @return GeocodeResponse
     */
    public GeocodeResponse getStructuredGeocode(StructuredGeocodeRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        String jsonResp = doPost("/geocode/structured", jsonReq);
        return gson.fromJson(jsonResp, GeocodeResponse.class);
    }

    /**
     * Perform an unstructured geocode look up
     * @param req an UnstructuredGeocodeRequest
     * @return GeocodeResponse
     */
    public GeocodeResponse getUnstructuredGeocode(UnstructuredGeocodeRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        String jsonResp = doPost("/geocode/unstructured", jsonReq);
        return gson.fromJson(jsonResp, GeocodeResponse.class);
    }

    /**
     * Perform a structured geocode look up
     * @param req a StructuredGeocodeRequest
     * @return GeocodeResponse
     */
    public ValidationResponse getStructuredValidation(StructuredGeocodeRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        String jsonResp = doPost("/validation/structured", jsonReq);
        return gson.fromJson(jsonResp, ValidationResponse.class);
    }

    /**
     * Perform a structured geocode look up
     * @param req a StructuredGeocodeRequest
     * @return GeocodeResponse
     */
    public ValidationResponse getUnStructuredValidation(UnstructuredGeocodeRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        String jsonResp = doPost("/validation/unstructured", jsonReq);
        return gson.fromJson(jsonResp, ValidationResponse.class);
    }

    /**
     * Perform a route request 
     * @param req a RouteRequest
     * @return RouteResponse
     */
    public RouteResponse getRoute(RouteRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        String jsonResp = doPost("/route", jsonReq);
        return gson.fromJson(jsonResp, RouteResponse.class);
    }
    
    public WaypointsResponse getWaypoints(WaypointsRequest req) throws WhereisApiException {
        Gson gson = new Gson();
        String jsonReq = gson.toJson(req);
        String jsonResp = doPost("/waypoints", jsonReq);
        return gson.fromJson(jsonResp, WaypointsResponse.class);
    }

    
    private String doPost(String path, String json) throws WhereisApiException {
        return doPost(path, json, null);
    }
    
    private String doPost(String path, String json, Map<String, String> headers) throws WhereisApiException {

        String URL = BASE_URL + path;
        HttpClient httpclient = new DefaultHttpClient();
        
        if (PROXY_URL != null) {
            httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, new HttpHost(PROXY_URL));
        }

        HttpPost post = new HttpPost(URL);
        post.addHeader("X-Auth-Token", this.TOKEN);
        post.addHeader("X-Auth-Password", this.PASSWORD);
        post.addHeader("Content-Type", "application/json");
        
        if (headers != null) {
            Iterator<String> keys = headers.keySet().iterator();
            while (keys.hasNext()) {
                String key = keys.next();
                post.addHeader(key, headers.get(key));
            }
        }

        try {
            post.setEntity(new StringEntity(json,"UTF-8"));
            HttpResponse resp = httpclient.execute(post);
            
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String responseString = responseHandler.handleResponse(resp);
            return responseString;
        } catch (IOException e) {
            throw new WhereisApiException(e);
        }
    }
}
