package fun.kolowert.labmodules.m1.bean;

import org.springframework.stereotype.Component;

@Component
public class SomeBean {

	String name;

	@Override
	public String toString() {
		return name;
	}

}
