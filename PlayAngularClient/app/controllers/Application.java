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
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static Result getAllSegments(){
        JsonArray jsonArray = new JsonArray();
        System.out.println("Control is there");
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

        JsonObject result = new JsonObject();
        result.add("segmentNames", jsonArray);
        System.out.println(result.toString());
        return ok(result.toString());
        // return ok();
    }

    public static Result getAllCompanies(){
        return ok();
    }

    public static Result getAllCountries(){
        return ok();
    }
}
