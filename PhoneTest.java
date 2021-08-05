package phone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone gracesPhone = new Iphone("X", 100, "Verizon", "ZingZangZoom"); 
		
		gracesPhone.displayInfo();
		
		Galaxy moonsPhone = new Galaxy("S9", 99, "Kolbi", "Ring with the Mostest"); 
		
		moonsPhone.displayInfo();
		
		System.out.println(gracesPhone.unlock());
		System.out.println(moonsPhone.unlock());
	}

}
