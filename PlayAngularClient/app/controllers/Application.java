/* Application Controller
 * @author - Harshit Mehrotra
 * @date - March 28, 2014
 */

package controllers;

import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Result;
import play.api.libs.ws.WS;
// import play.api.libs.ws.Response;
// import play.api.libs.ws.Promise;
import play.libs.F.Function;
import play.libs.F.Promise;
import views.html.*;

/*
TODO - Design using good REST controller design principles
Hubble Controller
 */
public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static Result getAllSegments(){
        // Promise<Response> homePage = WS.url("http://musicbrainz.org/ws/2/artist?query=type:person&limit=100").get();

        return null;

        /* JsonArray jsonArray = new JsonArray();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Network Provider");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Infrastructure Provider");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Internet Provier");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Services Provider");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Test Provider");
        jsonArray.add(jsonObject);

        JsonObject result = new JsonObject();
        result.add("segmentNames", jsonArray);

        return ok(result.toString()); */
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
