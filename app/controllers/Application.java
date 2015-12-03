package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;

import play.mvc.*;

import views.html.*;

@play.db.jpa.Transactional
@Restrict(@Group("mygroup"))
public class Application extends Controller {

    public Result index() {
    	
    	play.db.jpa.JPA.em(); // Causes "java.lang.RuntimeException: No EntityManager found in the context..."
    	
        return ok(index.render("Your new application is ready."));
    }

}
