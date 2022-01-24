package fun.kolowert.labmodules.m1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fun.kolowert.labmodules.m1.bean2.SideBean;
import fun.kolowert.labmodules.m1.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		//@SuppressWarnings("resource")
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
		System.out.println("--- --- ---");
		System.out.println(ctx.getBean(SideBean.class));
		
		ctx.close();
	}

}
