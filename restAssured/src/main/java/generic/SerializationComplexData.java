package generic;

public class SerializationComplexData {

	//global variable
		String name;
		int[] num ;
	     int id;
	     SerializationComplexDataSpouse spouse;
		//constructor
		public SerializationComplexData(String name,int[] phone,int id,SerializationComplexDataSpouse spouse)
		{
			this.name=name;
			this.num=phone;
			this.id=id;
			this.spouse=spouse;
		}
		//trigger deserialization mainly
		public SerializationComplexData()
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
		public SerializationComplexDataSpouse getSpouse() {
			return spouse;
		}
		public void setSpouse(SerializationComplexDataSpouse spouse) {
			this.spouse = spouse;
		}
		public int[] getNum() {
			return num;
		}
		
		
		
		
		
	
	
	
	
	
}
