package net.daum.model02;

import net.daum.model01.RemoteControl;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}else if (volume < MIN_VOLUME){
			volume = MIN_VOLUME;
		}else {
			volume=volume;
		}
		System.out.println("TV 볼륨 : " + volume);
	}

}
