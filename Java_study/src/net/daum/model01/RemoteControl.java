package net.daum.model01;

public interface RemoteControl {
	
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	void turnOn();
	
	void turnOff();
	
	void setVolume(int volume);

}
