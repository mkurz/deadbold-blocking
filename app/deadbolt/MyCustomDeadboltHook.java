package deadbolt;

import javax.inject.Singleton;

import be.objectify.deadbolt.java.cache.HandlerCache;
import play.api.Configuration;
import play.api.Environment;
import play.api.inject.Binding;
import play.api.inject.Module;
import scala.collection.Seq;

public class MyCustomDeadboltHook extends Module {
	
	@Override
	public Seq<Binding<?>> bindings(final Environment environment, final Configuration configuration) {
		return seq(bind(HandlerCache.class).to(MyHandlerCache.class).in(Singleton.class));
	}
	
}