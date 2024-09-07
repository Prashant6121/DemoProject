package in.pd.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.pd.beans.Student;
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext(" /in/pd/resources/applicationContext.xml");
		Student std=(Student)context.getBean("stdId");
		std.display();
		System.out.println("*********************************");
		Student std1=(Student)context.getBean("stdId1");
		std1.display();
	}

}
