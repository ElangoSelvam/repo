package generic;

public class Deserialization {
	String name;
	long num;
     int id;
	
	//constructor
	public Deserialization(String name,long num,int id)
	{
		this.name=name;
		this.num=num;
		this.id=id;
	}
	//trigger deserialization mainly
	public Deserialization()
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


