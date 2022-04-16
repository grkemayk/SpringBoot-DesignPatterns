package SpringBoot.annotationExample2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="KisiRestController")
public class KisiController {
	
	@Resource(name="KisiService")
	KisiService kisiService;
	public Kisi YeniKisi(String Name, String Surname)
	{
		return kisiService.YeniKisi(Name, Surname);
	
	}
	

}
