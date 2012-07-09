package co.byter.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	// harvested from http://www.zparacha.com/ultimate-java-regular-expression-to-validate-email-address
	// in the future, would be nice to use http://ex-parrot.com/~pdw/Mail-RFC822-Address.html
	private final static String EMAIL_PATTERN = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
	public static boolean emailIsValid(String email){
		Pattern p = Pattern.compile(EMAIL_PATTERN);
		Matcher m = p.matcher(email);
		return m.matches();
	}
}
