package SpringBoot.annotationExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("kisiService")
public class KisiService {
 
  @Autowired
  KisiDao kisiDAO;
 
  public Kisi kisiOlustur() 
  {
   return kisiDAO.kisiBilgiDoldur();
  }
 
}
