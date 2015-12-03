package deadbolt;

import java.util.ArrayList;
import java.util.List;

import be.objectify.deadbolt.core.models.Permission;
import be.objectify.deadbolt.core.models.Role;
import be.objectify.deadbolt.core.models.Subject;

public class MySubject implements Subject {

	@Override
	public List<? extends Role> getRoles() {
		final ArrayList<Role> roles = new ArrayList<>();
		roles.add(new Role() {
			@Override
			public String getName() {
				return "mygroup";
			}
		});
		return roles;
	}

	@Override
	public List<? extends Permission> getPermissions() {
		return null;
	}

	@Override
	public String getIdentifier() {
		return "myid";
	}

}
