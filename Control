package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Control 
{
	//obstacles
	@FXML private Rectangle r1;
	@FXML private Button playButton;
	@FXML private Circle player;
	Player p1;

	public void play()
	{
		Obstacle ob1 = new Obstacle(r1,player);
		p1 = new Player(player);
		
		playButton.setVisible(false);
	}
	
	//controls
	public void Jump()
	{
		p1.jump();
	}
	public void MoveForwards()
	{
		p1.right();
	}
	public void MoveBackwards()
	{
		p1.left();
	}
}
