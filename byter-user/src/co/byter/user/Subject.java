package co.byter.user;

public interface Subject {
	
	public void registerObserver();
	
	public void removeObserver();
	
	public void notifyObservers();

}
