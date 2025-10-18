package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File; import java.net.URL;

public class Main extends Application { @Override public void start(Stage stage) throws Exception { URL fxml=new File("resources/home.fxml").toURI().toURL(); Parent root=FXMLLoader.load(fxml); Scene scene=new Scene(root,1100,720); Theme.apply(scene); stage.setTitle("SmartBudget"); stage.setScene(scene); stage.show(); } public static void main(String[] args){ launch(args);} }