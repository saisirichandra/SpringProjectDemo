package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test2 {
	public static void main(String[] args) {
		//Student abdul = new Student();

		Resource resource = new ClassPathResource("Hello.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Vehicle vehicle = (Vehicle) beanFactory.getBean("vehicle");
		vehicle.drive();

	}
}