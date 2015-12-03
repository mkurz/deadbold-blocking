package deadbolt;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import be.objectify.deadbolt.core.models.Subject;
import be.objectify.deadbolt.java.AbstractDeadboltHandler;
import play.mvc.Http.Context;
import play.mvc.Result;

public class MyDeadboltHandler extends AbstractDeadboltHandler {

	@Override
	public CompletionStage<Optional<Result>> beforeAuthCheck(Context context) {
		return CompletableFuture.completedFuture(Optional.empty());
	}

	@Override
	public CompletionStage<Optional<Subject>> getSubject(Context context) {
		
		play.db.jpa.JPA.em(); // Causes "java.lang.RuntimeException: No EntityManager found in the context..."
		
		return CompletableFuture.completedFuture(Optional.ofNullable(new MySubject()));
	}
}
