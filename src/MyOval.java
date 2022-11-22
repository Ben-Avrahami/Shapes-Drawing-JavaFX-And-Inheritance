import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class Represents a Oval
 * @author Ben Avrahami
 *
 */


public class MyOval extends MyBoundedShape {

	/**
	 * A Constructor
	 * @param x1 x1 
	 * @param y1 y2 
	 * @param x2 x2 
	 * @param y2 y2 
	 * @param color the color of the Oval
	 * @param fill boolean true for filled and false for not filled
	 */
	public MyOval(int x1, int y1 , int x2, int y2, Color color,boolean fill) {
		super(x1, y1, x2, y2, color, fill);
	}
	/**
	 * draws the Oval 
	 */
	@Override
	public void draw(GraphicsContext gc) {
		if (this.get_fill()==true) {//if the oval is filled
			gc.setFill(get_color());//sets the fill Color
			gc.fillOval(get_x1(), get_y1(), get_x2(), get_y2());//draws the oval
		}
		else {//if the oval is not filled 
			gc.setStroke(get_color());//sets the outer line Color
			gc.strokeOval(get_x1(), get_y1(), get_x2(), get_y2());//draws the oval
		}
	}

}
