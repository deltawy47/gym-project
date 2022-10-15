package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
 
 @Override
 public void start(Stage stage) {
  try {
   
   Parent root = FXMLLoader.load(getClass().getResource("Fxml1.fxml"));
   Scene scene = new Scene(root);
   
   stage.setTitle("Gym 24/7");
   stage.setScene(scene);
   stage.show();
   
  } catch(Exception e) {
   e.printStackTrace();
  }
 } 


	public static void main(String[] args) {
		admin s =new admin();
		Employee q = new Employee();
		s.addTrainer(1,"ahmed", "01142294950", "1516646556");
		s.addTrainer(2,"eman", "011544950", "16646556");
		q.addMember(1, 1, "hoda", "014565655", "29/30");  
		q.addMember(2, 2, "mona", "01565655", "4/30");  
		
		launch(args);
	}
}
