package generic;

public class Serialization {

	//global variable
			String name;
			int num;
		     int id;
			
			//constructor
			public Serialization(String name,int num,int id)
			{
				this.name=name;
				this.num=num;
				this.id=id;
			}
			//trigger deserialization mainly
			public Serialization()
			{
			
			}
			//public service
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public long getNum() {
				return num;
			}
			public void setNum(int num) {
				this.num = num;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			
			
		
			
}
