package assign_q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
	public static void main(String[] args) {
   
	  ApplicationContext con= new ClassPathXmlApplicationContext("assign_q1/myfile.xml");
	  student s1=(student) con.getBean("s1");
	
	
	   System.out.println(s1);
	}
}
