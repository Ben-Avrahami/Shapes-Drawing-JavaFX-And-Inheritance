import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class Represents all Shapes
 * @author Ben Avrahami
 *
 */
public abstract class MyShape implements Cloneable {
	private int _x1;
	private int _x2;
	private int _y1;
	private int _y2;
	private Color _color;
	/*
	 * Getters and Setters methods for the different private variables
	 */
	public int get_x1() {
		return _x1;
	}
	public int get_x2() {
		return _x2;
	}
	public int get_y1() {
		return _y1;
	}
	public int get_y2() {
		return _y2;
	}
	public Color get_color() {
		return _color;
	}
	public void set_color(Color _color) {
		this._color = _color;
	}
	public void set_x1(int _x1) {
		this._x1 = _x1;
	}
	public void set_x2(int _x2) {
		this._x2 = _x2;
	}
	public void set_y1(int _y1) {
		this._y1 = _y1;
	}
	public void set_y2(int _y2) {
		this._y2 = _y2;
	}
	/**
	 * A Constructor
	 * @param x1 x1 
	 * @param y1 y2 
	 * @param x2 x2 
	 * @param y2 y2 
	 * @param color the color of the shape
	 */
	public MyShape(int x1, int y1 , int x2, int y2, Color color) {
		_x1=x1; 
		_y1=y1;
		_x2=x2;
		_y2=y2;
		_color=color;

	}
	/*
	 * abstract method to be implemented by the succeeding classes
	 */
	public abstract void draw(GraphicsContext gc);

	/*
	 * Clone method to clone the objects
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


}
