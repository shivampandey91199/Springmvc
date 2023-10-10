package assign_q4;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	 public static void main(String[] args) {
		
		 
	ApplicationContext con= new ClassPathXmlApplicationContext("assign_q4/myfile.xml");
	
	      List<student> list=(List<student>)  con.getBean("list");
	      System.out.println(list);
	  
	 }
}
