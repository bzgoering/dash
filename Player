package application;

import javafx.animation.PauseTransition;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

public class Player 
{
	//customizable variables
	final double fallDelayTime = 1;
	final double jumpDelayTime = .1;
	final double velocity = 20;
	final double gravityForce = 1;
	final double moveDistance = 10;
	final double maxHieght = 282 - 100;
	
	//variables
	private Shape player;
	private double initialY;
    private PauseTransition fallDelay = new PauseTransition(Duration.millis(fallDelayTime));
    private PauseTransition jumpDelay = new PauseTransition(Duration.millis(jumpDelayTime));
    
	public Player(Shape shape)
	{
		player = shape;
		initialY = player .getLayoutY();
	}
	
	//controls
	public void left()
	{
		double currX = player.getLayoutX();
		player.setLayoutX(currX - moveDistance);
	}
	
	public void right()
	{
		double currX = player.getLayoutX();
		player.setLayoutX(currX + moveDistance);
	}
	
	public void jump()
	{
		boolean jump = true;
		double currY = player.getLayoutY();
		player.setLayoutY(currY - velocity);
		jump = false;
		
		if (jump == false)
		{
			fall();
		}
	}
	private void fall()
	{
		double currY = player.getLayoutY();
		if (currY < initialY)
			fallDelay.setOnFinished(event -> {
				player.setLayoutY(currY + gravityForce);
				fall();
		});
		fallDelay.play();
	}
}
