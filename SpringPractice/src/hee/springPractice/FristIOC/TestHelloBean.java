package hee.springPractice.FristIOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestHelloBean {
	public static void main(String[] args) {
		Resource rs = new ClassPathResource("hee\\springPractice\\FristIOC\\applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		HelloBean hb = (HelloBean) bf.getBean("helloBean");
		System.out.println(hb.sayHello());
		HelloBean hb2 = (HelloBean) bf.getBean("helloBean");
		System.out.println(hb==hb2);
	}
}
