package fun.kolowert.labmodules.m1.bean2;

public class SideBean {
	int id;
	String name;

	public SideBean(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "SideBean [id=" + id + ", name=" + name + "]";
	}

}
