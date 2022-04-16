package SpringBoot.annotationExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController ("kisiController")
//@RestController = @Controller + @ResponseBody
public class KisiController 
{
     @Autowired
    KisiService kisiService;
     
    public Kisi kisiOlustur()
    {
        return kisiService.kisiOlustur();
    }
}
