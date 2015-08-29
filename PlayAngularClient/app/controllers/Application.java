/* Application Controller
 * @author - Harshit Mehrotra
 * @date - March 28, 2014
 */

package controllers;

import javax.inject.Inject;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.ws.*;
import play.libs.F.Function;
import play.libs.F.Promise;
import views.html.*;

/*
TODO - Design using good REST controller design principles
Hubble Controller
 */
public class Application extends Controller {
	
	@Inject static WSClient ws;
	
    public static Result index() {
        return ok(index.render());
    }

    public static Promise <Result> getAllSegments() throws InterruptedException{
    	
    	WSRequest request = WS.url("http://musicbrainz.org/ws/2/artist?query=type:person&limit=100&fmt=json").setFollowRedirects(true);
    	return request.get().map(response -> 
    		ok(response.asJson().findPath("artists").asText())
    	);
    }

    public static Result getAllCompanies(){
        JsonArray jsonArray = new JsonArray();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Apple Inc");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Google");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Facebook");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "LinkedIn");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Samsung");
        jsonArray.add(jsonObject);

        JsonObject result = new JsonObject();
        result.add("companyNames", jsonArray);

        return ok(result.toString());
    }

    public static Result getAllCountries(){
        JsonArray jsonArray = new JsonArray();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "United States");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "India");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Russia");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "China");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Brazil");
        jsonArray.add(jsonObject);

        JsonObject result = new JsonObject();
        result.add("countryNames", jsonArray);

        return ok(result.toString());
    }
}
