package blogz;

import java.util.Date;

import org.junit.Test;

import junit.framework.TestCase;

public class PostandUserTest extends TestCase {
	
	// instance properties go here
	
	String s1 = "Your stuff doesn't work";

    private static boolean initialized = false;

    public PostandUserTest() {

        // constructor code; runs once per @Test method
    	
    	
        if (!initialized) {
            // code that should only run once goes here
        	
            initialized = true;
        }
    }

    @Test
    public void testInit() {
    	Date created = new Date();
    	Date modified = new Date();
    	User p = new User("Doug", "Shook");
    	Post u = new Post("These are some words", "Test Post","Doug Shook", created, modified);
		assertEquals(s1, "Doug", p.getUser());
		assertEquals("Shook", p.getPswrd());
		assertEquals("These are some words", u.getBody());
    }
}
