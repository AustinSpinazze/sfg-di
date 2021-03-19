package austinspinazze.springframework.sfgdi;

import austinspinazze.springframework.sfgdi.controllers.ConstructorInjectedController;
import austinspinazze.springframework.sfgdi.controllers.MyController;
import austinspinazze.springframework.sfgdi.controllers.PropertyInjectedController;
import austinspinazze.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("------ Primary ------");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
		// Since PrimaryGreetingService has the @Primary annotation this means this will be the default service if a controller does not have specific qualifier

		System.out.println("------ Property ------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		// To make this work:
		// Had to to tell Spring that PropertyInjectedController is a controller using @Controller annotation
		// Had to also use @Autowired annotation to mark a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities.
		// Had to tell Spring that GreetingServiceImpl is a spring managed component with @Service annotation

		System.out.println("------ Setter ------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		// To make this work had to do same steps above

		System.out.println("------ Constructor ------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		// To make this work had to do same steps as above except do not need @Autowire annotation cause spring is smort

	}

}
