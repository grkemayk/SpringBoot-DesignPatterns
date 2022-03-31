package SpringBoot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/SpringBoot")
public class MyRestController {
	
	@PostMapping("/postExample/{TableName}")
	private void vPost(@PathVariable(value="TableName") String  strTableName, @RequestBody PostClass xPostClass)//Model ile JSON keylerini kendizi mapler.
	{
		System.out.println(strTableName);
		System.out.println(xPostClass.PostData);
	}
	@GetMapping("/getExample")
	private void vGet(@RequestParam(value="ln", defaultValue="Görkem") String strName)//?ln=Aykac
	{
		System.out.println(strName);
	}
	
	@DeleteMapping("/deleteExample/{UserId}")
	private void vDelete(@PathVariable(value="UserId") String strUserId)
	{
		System.out.println(strUserId);
	}
	
	@PatchMapping("patchExample/{UserId}")
	private void vPatch(@PathVariable(value="UserId") String strUserId)
	{
		System.out.println(strUserId);
	}
	
	@PutMapping("putExample/{UserId}")
	private void vPut(@PathVariable(value="UserId") String strUserId)
	{
		System.out.println(strUserId);
	}
	

}
