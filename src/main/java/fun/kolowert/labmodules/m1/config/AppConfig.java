package fun.kolowert.labmodules.m1.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import fun.kolowert.labmodules.m1.bean.MyBean;
import fun.kolowert.labmodules.m1.bean2.SideBean;

@Configuration
@ComponentScan(basePackageClasses = { MyBean.class })
public class AppConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public SideBean s1Bean() {
		return new SideBean(1, "SideBean is named");
	}

	@Bean
	@Primary
	public SideBean s2Bean() {
		return new SideBean(2, "SideBean is named too");
	}

}
