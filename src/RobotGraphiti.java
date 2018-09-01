import org.jointheleague.graphical.robot.Robot;

public class RobotGraphiti {
public static void main(String[] args) {
	Robot me=new Robot();
	me.setSpeed(100);
	me.penDown();
	me.move(250);
	me.turn(140);
	me.penDown();
	me.move(125);
	me.turn(40);
	me.move(100);
	me.turn(40);
	me.move(100);
	me.turn(40);
	me.move(30);
}
}
