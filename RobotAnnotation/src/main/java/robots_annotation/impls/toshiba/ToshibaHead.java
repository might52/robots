package robots_annotation.impls.toshiba;

import robots_annotation.interfaces.Head;

public class ToshibaHead implements Head {
	private String color;
	
	public void calc(){
		System.out.println("Thinking about Toshiba...");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
