package controllers;

import java.util.List;

import models.Promotion;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security.Authenticated;


@Authenticated(Secured.class)
public class Promotions extends Controller {
	
	public static Result index(){
		List<Promotion> promotions = Promotion.find.all();
		return ok(views.html.promotions.index.render(promotions));
	}
	
	

}
