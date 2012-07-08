package co.byter.user;

public class User implements Byter {

	private String name;
	private String password;
	private String email;
	
	@Override
	public void setName(String name){
		this.name = name;
	}
	
	@Override
	public String getName(){
		return name;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getEmail() {
		return email;
	}
	

}
