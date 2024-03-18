
	public class employdetailsassessment {
		String name;
		int yearofjoining;
		double salary;
		String address;
		employdetailsassessment(String name,int yearofjoining,double salary,String address)
		{
			this.name=name;
			this.yearofjoining=yearofjoining;
			this.salary=salary;
			this.address=address;
		}
		void display()
		{
			System.out.println(name+" "+yearofjoining+"  "+salary+" "+address);
		}
		public static void main(String[] args) {
			
			employdetailsassessment e1=new employdetailsassessment("ZAYN",1994 ,37500.75, "64C- Hukumpeta Street" );
			employdetailsassessment e2=new employdetailsassessment("VIRAT",2000 ,42750.85, "68D- Lankapatnam Street" );
			employdetailsassessment e3=new employdetailsassessment("KOHLI",1999,38785.25,"26B- Putchala Lane");
			e1.display( );
	        e2.display( );  
	        e3.display();
	        
		}

	}



	