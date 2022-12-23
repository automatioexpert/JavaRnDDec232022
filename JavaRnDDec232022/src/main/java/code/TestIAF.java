package code;

public class TestIAF {

	public static void main(String[] args) {
		IAF iaf = new IAF();
		iaf.launchSatellite();
		iaf.landing();
		System.out.println("Sat Launch distance: " + iaf.distance);
	}

}
