package blogz;

import java.util.Objects;

abstract class Entity {
	private final int uid;

	public int getUid() {
		return uid;
	}
	
	@Override
	public boolean equals(Object o) {
	    // self check
	    if (this == o)
	        return true;
	    // null check
	    if (o == null)
	        return false;
	    // type check and cast
	    if (getClass() != o.getClass())
	        return false;
	    User test = (User) o;
	    // field comparison
	    return Objects.equals(user, test.getUser())
	            && Objects.equals(pswrd, test.getPswrd());
	}
}
