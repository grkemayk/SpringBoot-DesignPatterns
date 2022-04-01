package SpringBoot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/SpringBoot")
public class MyRestController {
	
	@PostMapping(value="/postExample/{TableName}")
	private void vPost(@PathVariable(value="TableName") String  strTableName, @RequestBody PostClass xPostClass)//Model ile JSON keylerini kendizi mapler.
	{
		System.out.println(strTableName);
		System.out.println(xPostClass.PostData);
	}
	
	@GetMapping(value="/getExample")
	private void vGet(@RequestParam(value="ln", defaultValue="Görkem") String strName)//?ln=Aykac
	{
		System.out.println(strName);
	}
	
	@DeleteMapping(value="/deleteExample/{UserId}")
	private void vDelete(@PathVariable(value="UserId") String strUserId)
	{
		System.out.println(strUserId);
	}
	
	@PatchMapping(value="patchExample/{UserId}")
	private void vPatch(@PathVariable(value="UserId") String strUserId)
	{
		System.out.println(strUserId);
	}
	
	@PutMapping(value="putExample/{UserId}")
	private void vPut(@PathVariable(value="UserId") String strUserId)
	{
		System.out.println(strUserId);
	}
	

}
