import com.yunlong.inter.joy;
import com.yunlong.service.serivce;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.context.annotation.FilterType.ANNOTATION;

@ComponentScan(basePackages = "com.yunlong", includeFilters =  {@ComponentScan.Filter(type = ANNOTATION, classes = {joy.class})}, useDefaultFilters = false)
public class app {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.yunlong");
//
		serivce ce =  context.getBean(serivce.class);
		System.out.println(ce.hashCode());
	}
}
