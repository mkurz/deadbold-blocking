package deadbolt;

import java.util.Optional;

import be.objectify.deadbolt.core.models.Subject;
import be.objectify.deadbolt.java.AbstractDeadboltHandler;
import play.libs.F;
import play.mvc.Http.Context;
import play.mvc.Result;

public class MyDeadboltHandler extends AbstractDeadboltHandler {

	@Override
	public F.Promise<Optional<Result>> beforeAuthCheck(Context context) {
		return F.Promise.pure(Optional.empty());
	}

	@Override
	public F.Promise<Optional<Subject>> getSubject(Context context) {
		
		play.db.jpa.JPA.em(); // Causes "java.lang.RuntimeException: No EntityManager found in the context..."
		
		return F.Promise.pure(Optional.ofNullable(new MySubject()));
	}
}
