
package day06.mypac;

public class MobilePhone extends Phone{

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name += " 이효리폰";
		this.name = name;
		System.out.println("1번"+this.getName());
	}
	
	
}
