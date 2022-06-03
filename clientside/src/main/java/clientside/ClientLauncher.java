package clientside;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import model.ModelHolder;  // module manage 



public class ClientLauncher extends Application {

    private static final Logger log = LoggerFactory.getLogger(ClientLauncher.class);
    
    public static void main(String[] args) {
        System.out.println("Client Launcher");
        
        ModelHolder model = new ModelHolder("hello");
        
        Application.launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = new Pane();
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Client Launcher");
        
        primaryStage.show();
    }
    
    
}







