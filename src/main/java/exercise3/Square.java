package exercise3;

public class Square {
	private Point vertex;
	private int sideLenght;
	public Square(String vertex,int sideLenght) {
		this.sideLenght= sideLenght;
	}

	public int getVertex () {
		return vertex;
	}
	public String getLenght () {
		return sideLenght;
	}
}

}
