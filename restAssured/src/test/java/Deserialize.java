import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import generic.Deserialization;

public class Deserialize {
	@Test
	
	public void deSerial() throws JsonParseException, JsonMappingException, IOException {
	
	ObjectMapper omap=new ObjectMapper();
	Deserialization data = omap.readValue(new File("E:\\Automation\\restAssured\\Elangovan.json"), Deserialization.class);
	System.out.println(data.getName());
	System.out.println(data.getNum());
	System.out.println(data.getId());
	}
    
}
