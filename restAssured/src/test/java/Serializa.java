import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import generic.Serialization;

public class Serializa {
	@Test
	public void serial() throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectMapper omap=new ObjectMapper() ;
		Serialization pobj=new Serialization("Elango", 1906, 02);
		omap.writeValue(new File("E:\\Automation\\restAssured\\Elangovan.json"), pobj);
	}
	
	
	
	
}
