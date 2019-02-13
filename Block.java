public class Block{
	enum Color{YELLOW, BLUE, RED, GREEN, ORANGE, PINK, PURPLE, BLANK}
	private Color color;

	public Block(){
		this.color = Color.BLANK;
	}

	public void setColor(Color c){
		color = c;
	}
	public Color color(){
		return color;
	}
}