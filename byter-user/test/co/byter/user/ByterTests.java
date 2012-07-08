package co.byter.user;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ByterTests {
	
	private Byter user;

	@Before
	public void setup(){
		//Given a Byter user
		user = new User();
	}
	
	@Test
	public void testUserName(){
		String expected = "Nathan";
		//And the user's name is Nathan
		user.setName(expected);
		//When I ask the user for his name
		String result = user.getName();
		//Then I should get Nathan back
		assertEquals(expected, result);
	}
	
	@Test
	public void testPassword(){
		String password = "byterpassword";
		//When Nathan wants to set a password
		user.setPassword(password);
		//Then the password should be set correctly
		String result = user.getPassword();
		assertEquals(password, result);
	}
	
	@Test
	public void testEmailAddress(){
		String expected = "nathan@yahoo.com";
		//When the user wants to set an email address
		user.setEmail(expected);
		//Then the email address is set correctly
		String result = user.getEmail();
		assertEquals(expected, result);
		}
}
