import net.daum.model01.RemoteControl;
import net.daum.model02.Audio;
import net.daum.model02.Television;

public class ConsTest01 {

	public static void main(String[] args) {
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(0);
		rc.turnOff();

	}

}
