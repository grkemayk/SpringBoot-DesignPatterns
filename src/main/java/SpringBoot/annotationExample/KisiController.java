package SpringBoot.annotationExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller ("kisiController")
public class KisiController 
{
     @Autowired
    KisiService kisiService;
     
    public Kisi kisiOlustur()
    {
        return kisiService.kisiOlustur();
    }
}
