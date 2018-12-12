package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController implements Initializable
{

	@FXML
	private Label user;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// TODO Auto-generated method stub
	}
	
	public void getUser(String user1) 
	{
		
	}
	
	public void signOut(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		System.exit(0);
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/Login.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("FactoManager");
		primaryStage.show();
	}
	
	public void addEmployee(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/AddEmployee.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add Employee");
		primaryStage.show();
	
		
	}
	
	public void modEmployee(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/ModifyEmployee.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Modify Employee");
		primaryStage.show();
	
		
	}
	public void delEmployee(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/DeleteEmployee.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Delete Employee");
		primaryStage.show();
	
		
	}
	public void addSupervisor(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		System.out.println("Sanannanana");
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/AddSupervisor.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add Supervisor");
		primaryStage.show();
	
		
	}

	public void modifySupervisor(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		System.out.println("Sanannanana");
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/ModifySupervisor.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Modify Supervisor");
		primaryStage.show();
	
		
	}
	public void deleteSupervisor(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		System.out.println("Sanannanana");
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/DeleteSupervisor.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Delete Supervisor");
		primaryStage.show();
	
		
	}
	public void addMachine(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		System.out.println("Sanannanana");
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/AddMachine.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add Machine");
		primaryStage.show();
	
		
	}
	public void modifyMachine(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		System.out.println("Sanannanankdnvbiadvga");
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/ModifyMachine.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Modify Machine");
		primaryStage.show();
	
		
	}
	public void deleteMachine(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		System.out.println("Sanannanankdnvbiadvga");
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/DeleteMachine.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Delete Machine");
		primaryStage.show();
	
		
	}
	
	public void addInput(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		System.out.println("Sanannanankdnvbiadvga");
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/AddDailyInput.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Daily Work Input");
		primaryStage.show();
	
		
	}
	public void displayInput(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		System.out.println("Sanannanankdnvbiadvga");
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/AddDailyInput.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Daily Work Input");
		primaryStage.show();
	
		
	}
	
	public void displayEmployee(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/DisplayEmployee.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Display Employee");
		primaryStage.setMaximized(true);
		primaryStage.show();
	
		
	}
	public void displaySupervisor(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/displaySupervisor.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Display Supervisor");
		primaryStage.setMaximized(true);
		primaryStage.show();
	
		
	}
	public void displayMachine(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/DisplayMachine.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Display Machine");
		primaryStage.setMaximized(true);
		primaryStage.show();
	
		
	}
	public void display(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/DisplayDailyInput.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Display DailyInput");
		primaryStage.setMaximized(true);
		primaryStage.show();
	
		
	}
	public void aboutUs(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/AboutUs.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("About Us");
		//primaryStage.setMaximized(true);
		primaryStage.show();
	
		
	}
	public void addMonthly(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/AddEfficiency.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("ADD Monthly");
		//primaryStage.setMaximized(true);
		primaryStage.show();
	
		
	}
	public void dislayMonthly(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/displayMonthly.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Display Monthly");
		//primaryStage.setMaximized(true);
		primaryStage.show();
	
		
	}
	public void dislayGraph(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/DisplayGraph.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Display Monthly");
		//primaryStage.setMaximized(true);
		primaryStage.show();
	
		
	}
	
	public void deleteDaily(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/DeleteDaily.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Delete Daily");
		//primaryStage.setMaximized(true);
		primaryStage.show();
	
		
	}
	
	public void deleteMonthly(ActionEvent e) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//((Node)e.getSource()).getScene().getWindow().hide();
		
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/DeleteMonthly.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Delete Monthly");
		//primaryStage.setMaximized(true);
		primaryStage.show();
	
		
	}
	
	public void dailyGraph(ActionEvent e) throws IOException 
	{
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/DailyGraph.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Daily Report Graph");
		//primaryStage.setMaximized(true);
		primaryStage.show();
	}
	
	public void monthlyGraph(ActionEvent e) throws IOException 
	{
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/MonthlyGraph.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Monthly Report Graph");
		//primaryStage.setMaximized(true);
		primaryStage.show();
	}
	public void compareEmployee(ActionEvent e) throws IOException 
	{
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/compareEmployee.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Monthly Report Graph");
		//primaryStage.setMaximized(true);
		primaryStage.show();
	}
	public void twoEmployees(ActionEvent e) throws IOException 
	{
		Stage primaryStage = new Stage();
		System.out.println("Thats oky");
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/application/twoEmployees.fxml").openStream());
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Monthly Report Graph");
		//primaryStage.setMaximized(true);
		primaryStage.show();
	}
	
}
