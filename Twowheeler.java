package week1.day1.assgn;

public class Twowheeler {
	
	int noofwheels=4;
	short noofMirrors=2;
	long chassisNumber=213456789109L;
	boolean isPunctured= true;
	String bikeName="pulsar";
	double runningKM= 151.05;
	

	public static void main(String[] args) {
		Twowheeler tw =new Twowheeler();
		System.out.println(tw.noofwheels);
		System.out.println(tw.noofMirrors);
		System.out.println(tw.chassisNumber);
		System.out.println(tw.isPunctured);
		System.out.println(tw.bikeName);
        System.out.println(tw.runningKM);

	}

}
