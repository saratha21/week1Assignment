package week1.day1.assgn;

public class Mobile {
	

	int modelNumber= 10;
	short noofMobilePiece=15;
	long mobileImeiNumber=11113456789109L;
	boolean isDamaged= true;
	String mobileBrandName="OPPO";
	char mobileLogo='O';
	float mobilePrice= 25000.45f;

	public static void main(String[] args) {
		Mobile mob =new Mobile();
        System.out.println(mob.modelNumber);
        System.out.println(mob.noofMobilePiece);
        System.out.println(mob.mobileBrandName);
        System.out.println(mob.isDamaged);
        System.out.println(mob.mobileImeiNumber);
        System.out.println(mob.mobileLogo);
        System.out.println(mob.mobilePrice);

        
	}

}
