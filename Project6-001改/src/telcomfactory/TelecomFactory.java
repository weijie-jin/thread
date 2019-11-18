package telcomfactory;
import telcom.Telcom;
import telcom.Telecom;
import telcomfactory.TelcomFactory;

public class TelecomFactory implements TelcomFactory{
	public Telcom createTelcom(){
		return (Telcom) new Telecom();
	}

}
