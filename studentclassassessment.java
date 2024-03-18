

	public class studentclassassessment {
		int sid;
		String name;
		int phonenumber;
		static String course="FULL STACK JAVA DEVELOPMENT";
	   studentclassassessment(int i,String name,int phonenumber)
	   {
		  this.sid=i;
		 this.name= name;
		 this.phonenumber=phonenumber;
	   }
	   void display( )
	   {
		   System.out.println(sid+"  "+name+" "+phonenumber+" "+course);
	   }
		public static void main(String[] args) {
			studentclassassessment student1=new studentclassassessment(201,"chandrika",1234567890);
			studentclassassessment student2=new studentclassassessment(202,"karuna",965432101);
			student1.display( );
			student2.display( );
			
			

		}

	}

	