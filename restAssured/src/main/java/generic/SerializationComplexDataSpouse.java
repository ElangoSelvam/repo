package generic;

public class SerializationComplexDataSpouse {

	//global variable
			String name;
			int[] num ;
		     int id;
			
			//constructor
			public SerializationComplexDataSpouse (String name,int[] phone,int id)
			{
				this.name=name;
				this.num=phone;
				this.id=id;
			}
			//trigger deserialization mainly
			public SerializationComplexDataSpouse()
			{
			
			}
			//public service
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int[] getPhone() {
				return num;
			}
			public void setNum(int[] num) {
				this.num = num;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			
	
	
	
	
	
}
