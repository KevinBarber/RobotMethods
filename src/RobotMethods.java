import org.jointheleague.graphical.robot.Robot;

public class RobotMethods {
	public static void main(String[] args) {
		Robot kevin = new Robot();
		kevin.setPenColor(0, 255, 0);
		kevin.setWindowColor(140,80,100);
		kevin.sparkle();
		kevin.setSpeed(100);
		kevin.penDown();
		drawSquare(kevin,100);
		drawTriangle(kevin,200);
		drawShape(kevin,3,100);
	}

	static void drawSquare(Robot r, int size) {
		

		

		for (int kevin1 = 0; kevin1 < 4; kevin1++) {
			r.move(size);
			r.turn(90);
		}

	}
	static void drawTriangle(Robot r, int size) {
		r.penUp();
		r.moveTo(400, 100);
		for (int kevin1 = 0; kevin1 < 3; kevin1++) {
			r.penDown();
			r.turn(120);
			r.move(size);
		}
		
		
		
	}
	static void drawShape(Robot r, int sides, int length) {
		r.penUp();
		r.moveTo(600, 600);
		
		for (int kevin1 = 0; kevin1 < sides; kevin1++) {
			r.penDown();
			r.turn(360/sides);
			r.move(length);
			
			
		}
		
	}
	}

