package net.daum.model02;

import net.daum.model01.RemoteControl;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("오디오 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("오디오 볼륨 : " + volume);
	}

}
