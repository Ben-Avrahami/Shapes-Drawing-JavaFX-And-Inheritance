import java.util.ArrayList;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
 * This class Is the project controller
 * @author Ben Avrahami
 *
 */
public class MyProjectController {

	@FXML
	private Canvas canv;
	private GraphicsContext gc;
	ArrayList<MyShape> shapes = new ArrayList<MyShape>();//ArrayList to hold the shapes
	ArrayList<MyShape> clonedShapes = new ArrayList<MyShape>();//ArrayList to hold the cloned shapes

	public void initialize() throws CloneNotSupportedException {
		gc = canv.getGraphicsContext2D(); //creates the GraphicsContext 
		//generates the initial shapes 
		shapes.add(new MyLine(generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),Color.RED));
		shapes.add(new MyLine(generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),Color.RED));
		shapes.add(new MyOval(generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),Color.RED,true));
		shapes.add(new MyOval(generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),Color.RED,true));
		shapes.add(new MyRectangle(generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),Color.RED,true));
		shapes.add(new MyRectangle(generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),generateRandomNumber(),Color.RED,true));
		cloneArray();//clones the shapes to clonedShapes ArrayList
		drawShapes();//draws the shapes on the canvas
	}
	/**
	 * 
	 * @return A Random number between 0-200.
	 */
	static private int generateRandomNumber()
	{
		Random rand = new Random();
		return rand.nextInt(201);
	}

	/**
	 * draws the shapes
	 */
	private void drawShapes() {
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).draw(gc);//draws the initially created shapes (the red and filled shapes)
		}
		for (int i = 0; i < shapes.size(); i++) {
			clonedShapes.get(i).draw(gc);//draws the cloned shapes (the green and not filled shapes)
		}
	}
	/*
	 * This Method clones the array into the clone array
	 */
	private void cloneArray() throws CloneNotSupportedException{
		for (int i = 0; i < shapes.size(); i++) {
			clonedShapes.add((MyShape) shapes.get(i).clone());
		}
		for (int i = 0; i < clonedShapes.size(); i++) {
			clonedShapes.get(i).set_x1(clonedShapes.get(i).get_x1()+10);//adds 10 to the x1 on the cloned variables
			clonedShapes.get(i).set_y1(clonedShapes.get(i).get_y1()+10);//adds 10 to the y1 on the cloned variables
			clonedShapes.get(i).set_color(Color.GREEN);//sets the colors of the cloned variables
			if (clonedShapes.get(i) instanceof MyBoundedShape) {
				((MyBoundedShape) clonedShapes.get(i)).set_fill(false);//sets the fill to false for the BoundedShapes and not trying to set it for the Line
			}
		}

	}

}
