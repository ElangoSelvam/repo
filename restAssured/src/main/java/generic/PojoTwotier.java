package generic;

public class PojoTwotier {

	
	
	//global variable
			String createdBy;
			String projectName;
			String status;
			int teamSize;
			
			//constructor
			public PojoTwotier(String createdBy,String projectName,String status,int i)
			{
				this.createdBy=createdBy;
				this.projectName=projectName;
				this.status=status;
				this.teamSize=i;
			}
			//getter and setter

			public String getCreatedBy() {
				return createdBy;
			}

			public void setCreatedBy(String createdBy) {
				this.createdBy = createdBy;
			}

			public String getProjectName() {
				return projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getStatus() {
				return status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public int getTeamSize() {
				return teamSize;
			}

			public void setTeamSize(int teamSize) {
				this.teamSize = teamSize;
			}
		
	
	
	
}
