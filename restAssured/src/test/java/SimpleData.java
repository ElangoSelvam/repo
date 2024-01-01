import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import generic.SerializationSimpleData;


public class SimpleData {
	@Test
	
	public void simpleData() throws JsonGenerationException, JsonMappingException, IOException {
		
		ObjectMapper omap=new ObjectMapper() ;
		int[] phone= {12345,123456};
		SerializationSimpleData pobj=new SerializationSimpleData("Elango",phone, 02);
		omap.writeValue(new File("E:\\Automation\\restAssured\\Elangovan.json"), pobj);
	}
}
