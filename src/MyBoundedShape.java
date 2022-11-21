import javafx.scene.paint.Color;

/**
 * This class Represents a Bounded Shape 
 * @author Ben Avrahami
 *
 */
public abstract class MyBoundedShape extends MyShape {
	private boolean _fill;
	/**
	 * A Constructor
	 * @param x1 x1 
	 * @param y1 y2 
	 * @param x2 x2 
	 * @param y2 y2 
	 * @param color the color of the Bounded Shape
	 * @param fill boolean true for filled and false for not filled
	 */
	public MyBoundedShape(int x1, int y1 , int x2, int y2, Color color,boolean fill) {
		super(x1, y1, x2, y2, color);//calls the super constructor
		_fill=fill;

	}
	//get method for fill
	public boolean get_fill() {
		return _fill;

	}
	//set method for fill
	public void set_fill(boolean _fill) {
		this._fill = _fill;
	}
	/**
	 * This method checks if 2 bounded shapes are equals to each other by comparing their height and length
	 */
	@Override
	public boolean equals(Object other) {
		if (other instanceof MyBoundedShape) {
			MyBoundedShape otherBoundedShape=(MyBoundedShape) other;
			return (this.get_x2()==otherBoundedShape.get_x2() && this.get_y2()== otherBoundedShape.get_y2());

		}
		else //if the compared object is not a Bounded Shape
			return false;
	}

}
