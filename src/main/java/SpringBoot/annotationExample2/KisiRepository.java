package SpringBoot.annotationExample2;

import org.springframework.stereotype.Repository;

@Repository(value="KisiRepository")
public class KisiRepository {
	
	
	public Kisi YeniKisi(String Name, String Surname)
	{
		return new Kisi(Name, Surname);
	}

}
