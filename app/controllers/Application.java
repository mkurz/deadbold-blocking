package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;

import play.mvc.*;

import views.html.*;

@play.db.jpa.Transactional
@Restrict(@Group("mygroup"))
public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
