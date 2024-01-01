import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import generic.SerializationComplexData;
import generic.SerializationComplexDataSpouse;


public class ComplexDatas {

	
	@Test
	
	public void complex() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper omap=new ObjectMapper() ;
		int[] phone= {12345,123456};
		SerializationComplexDataSpouse sp=new SerializationComplexDataSpouse("Akash",phone,01);
		SerializationComplexData pobj=new 	SerializationComplexData("Elango",phone, 02,sp);
		omap.writeValue(new File("E:\\Automation\\restAssured\\Elangovan.json"),pobj);
		
		
		
	}
}
