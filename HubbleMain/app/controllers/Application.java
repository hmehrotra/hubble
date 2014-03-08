package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import models.*;
import static play.data.Form.*;

import views.html.*;

public class Application extends Controller {

    final static Form <LoginCredentials> loginForm = Form.form(LoginCredentials.class);

    public static Result index() {
        return ok(index.render("Hello World"));
    }

    public static Result login(){
        return ok(login.render(loginForm));
    }

    public static Result validateLogin(){
        /* Login credentials go here */
        return ok(hubbleMainPage.render("Hello World"));
    }
}
