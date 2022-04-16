package SpringBoot.annotationExample2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="KisiService")
public class KisiService {

	@Resource(name="KisiRepository")
	KisiRepository kisiRepository;
	public Kisi YeniKisi(String Name, String Surname)
	{
		return	kisiRepository.YeniKisi(Name, Surname);
	}
}
