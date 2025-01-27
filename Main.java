package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader= new FXMLLoader(getClass().getResource("GUI.fxml"));
			BorderPane root = loader.load();
			Control controller = loader.getController();
			Scene scene = new Scene(root,900,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>(){

				@Override
				public void handle(KeyEvent event) 
				{
					try {
						switch(event.getCode())
						{
						case D:
							controller.MoveForwards();
							break;
						case A:
							controller.MoveBackwards();
							break;
						case W:
							controller.Jump();
							break;
						
						}
					}
					catch(Exception e)
					{
						
					}
				}
				
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();
		    		    
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
