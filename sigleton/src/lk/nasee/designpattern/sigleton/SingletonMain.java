package lk.nasee.designpattern.sigleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		AudioDriverService ab =AudioDriverService.getAudioDriverInstance();
		
		AudioDriverService ab2 =AudioDriverService.getAudioDriverInstance();
		

		System.out.println(ab);
		System.out.println(ab2);
	}

}
