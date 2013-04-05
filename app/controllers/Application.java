package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.Context;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Start page"));
    }
    
    public static Result login(){
    	return ok (views.html.login.login.render("Please Login"));
    }
    
    public static Result authenticate(){
    	String email =Form.form().bindFromRequest().get("email");
    	String password = Form.form().bindFromRequest().get("password");
    	flash().put("error", "Username or password incorrect");
    	session().clear();
        session("email",email);
    	return redirect(routes.Application.login());
    }
  
}
