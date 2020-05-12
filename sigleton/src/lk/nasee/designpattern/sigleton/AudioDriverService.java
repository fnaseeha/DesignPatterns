package lk.nasee.designpattern.sigleton;

import javax.management.RuntimeErrorException;

public class AudioDriverService {

	static AudioDriverService aDriverService;
	
	private AudioDriverService(){
		//stop from relection framework to create new instance
		if(aDriverService != null){
			throw new RuntimeException("Error : please use getAudioDriverInstance method");
		}
	}
	
	public static AudioDriverService getAudioDriverInstance(){
		
		//double checking singleton 
		//for thread safe
		if(aDriverService == null){
			
			synchronized (AudioDriverService.class) {
				if(aDriverService == null){
					aDriverService = new AudioDriverService();
				}	
			}
			
		}
		
		return aDriverService;
	}
}
