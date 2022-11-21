import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * 
 */

/**
 * This class Represents a Line
 * @author Ben Avrahami
 *
 */
public class MyLine extends MyShape {

	/**
	 * A Constructor
	 * @param x1 x1 
	 * @param y1 y2 
	 * @param x2 x2 
	 * @param y2 y2 
	 * @param color the color of the line
	 */
	public MyLine(int x1, int y1 , int x2, int y2, Color color) {
		super( x1,  y1 ,  x2,  y2, color);
	}
	/**
	 * draws the Line 
	 */
	@Override
	public void draw(GraphicsContext gc) {
		gc.setStroke(get_color());//sets the line color
		gc.strokeLine(get_x1(), get_y1(), get_x2(), get_y2());//draws the line

	}
	/**
	 * this method checks if two lines are equals to each other by comparing their lengths.
	 */
	@Override
	public boolean equals(Object other) {
		if (other instanceof MyLine) {			
			MyLine otherLine=(MyLine) other;
			return (this.checkDistance(this.get_x1(), this.get_y1(), this.get_x2(), this.get_y2())==otherLine.checkDistance(otherLine.get_x1(), otherLine.get_y1(), otherLine.get_x2(), otherLine.get_y2()));
		}
		else//if the compared object is not a line
			return false;
	}
	/**
	 * This Methods returns the distance between two points
	 @param x1 x1 
	 * @param y1 y2 
	 * @param x2 x2 
	 * @param y2 y2 
	 * @return A double representing the distance between two points.
	 */
	private double checkDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}
}
