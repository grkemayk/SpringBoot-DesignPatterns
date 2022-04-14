package SpringBoot.annotationExample;

import org.springframework.stereotype.Repository;

@Repository("kisiDAO")
public class KisiDao {
 
 public Kisi kisiBilgiDoldur() {
  Kisi kisi = new Kisi("Ali", 1);
  return kisi;
 }
 
}
