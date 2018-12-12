package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginController implements Initializable
{
	public LoginModel loginModel = new LoginModel();

	@FXML
	private Label isConnected;
	@FXML
	private Label cred;
	@FXML
	private TextField txtUsername;
	@FXML
	private TextField txtPassword;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// TODO Auto-generated method stub
		
		if(loginModel.isDbConnected())
		{
			isConnected.setText("Pooja Industries");
		}
		else
		{
			//isConnected.setText("Database Not Connected");
			Stage dialogStage = new Stage();
		    dialogStage.initModality(Modality.WINDOW_MODAL);

		    VBox vbox = new VBox(new Text("Database Not Connected"));
		    vbox.setAlignment(Pos.CENTER);
		    vbox.setPadding(new Insets(15));
		    vbox.setPrefSize(400, 100);

		    dialogStage.setScene(new Scene(vbox));
		    dialogStage.show();

		}
		
	}
	
	public void Login(ActionEvent e)
	{
		try 
		{
			if(loginModel.isLogin(txtUsername.getText(), txtPassword.getText()))
			{
				//isConnected.setText("Correct");
				
				((Node)e.getSource()).getScene().getWindow().hide();
				Stage primaryStage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				Pane root = loader.load(getClass().getResource("/application/Main.fxml").openStream());
				
				//for image
				Image image = new Image("/application/main.png");
				ImageView iv1 = new ImageView();
		        iv1.setImage(image);
		        iv1.setFitWidth(1600);
		        iv1.setFitHeight(800);
		        iv1.setX(150);
		        iv1.setY(150);
		        HBox box = new HBox();
		        box.setLayoutX(0);
		        box.setLayoutY(50);
		        box.getChildren().add(iv1);
		        root.getChildren().add(box);


				MainController mainController = (MainController)loader.getController();
				mainController.getUser(txtUsername.getText());
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.setMaximized(true);
				primaryStage.setTitle("FactoManager");
				primaryStage.show();
			}
			else
			{
				//cred.setText("Credentials are Incorrect");
				Stage dialogStage = new Stage();
			    dialogStage.initModality(Modality.WINDOW_MODAL);

			    VBox vbox = new VBox(new Text("Credentials are incorrect"));
			    vbox.setAlignment(Pos.CENTER);
			    vbox.setPadding(new Insets(15));
			    vbox.setPrefSize(400, 100);
			   

			    dialogStage.setScene(new Scene(vbox));
			    dialogStage.show();

			}
		} 
		catch (SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void AddUser(ActionEvent e) throws IOException
	{
		Stage primaryStage = new Stage();
		Pane root = FXMLLoader.load(getClass().getResource("/application/AddUser.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add User");
		primaryStage.show();
	}
	
	
	

}
