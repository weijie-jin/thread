package telcomfactory;
import telcom.Mobile;
import telcom.Telcom;

public class MobileFactory implements TelcomFactory{
	public Telcom createTelcom() {
		return (Telcom) new Mobile();
	}

}
