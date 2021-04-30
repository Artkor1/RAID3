package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Raid raid= new Raid();
		raid.fillDisks();
		raid.generateECC();
		System.out.println(raid.toString());
		
		raid.errorInDisks();
		//raid.errorInHammingDisks();
		System.out.println(raid.toString());
		raid.fixBits();
		System.out.println(raid.toString());
		
		
		launch(args);
	}
}
