package application;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class DeleteSupervisorController 
{
	@FXML
	private TextField id;
	@FXML
	private TextField fname;
	@FXML
	private TextField lname;
	@FXML
	private Label status;

	// Event Listener on Button.onAction
	@FXML
	public void deleteEmp(ActionEvent event) 
	{
		int t1=0;
		String ffname="",llname="";
		Boolean flag=false;
		try
		{
			t1 =Integer.parseInt( id.getText());
			ffname=fname.getText();
			llname=lname.getText();
			flag=check(t1,ffname,llname);
		}
		catch(Exception e1)
		{
			//status.setText("Please Enter Correct Credentials");
			Stage dialogStage = new Stage();
		    dialogStage.initModality(Modality.WINDOW_MODAL);

		    VBox vbox = new VBox(new Text("Enter valid credentials!!!"));
		    vbox.setAlignment(Pos.CENTER);
		    vbox.setPadding(new Insets(15));
		    vbox.setPrefSize(400, 100);

		    dialogStage.setScene(new Scene(vbox));
		    dialogStage.show();
		}
		if(flag==false)
		{
			Stage dialogStage = new Stage();
		    dialogStage.initModality(Modality.WINDOW_MODAL);

		    VBox vbox = new VBox(new Text("Enter valid credentials!!!"));
		    vbox.setAlignment(Pos.CENTER);
		    vbox.setPadding(new Insets(15));
		    vbox.setPrefSize(400, 100);

		    dialogStage.setScene(new Scene(vbox));
		    dialogStage.show();
			
		}
		if(flag!=false)
		{
			try 
			{ 
				String url = "jdbc:mysql://localhost:3306/factory"; 
				Connection conn = (Connection) DriverManager.getConnection(url,"root","root"); 
				Statement stmt = (Statement) conn.createStatement();
				String query = "delete from superv where id = ?";
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query);
				ps.setInt (1, t1);
				ps.execute();
				//status.setText("Added SuccessFully");
				
				Stage dialogStage = new Stage();
			    dialogStage.initModality(Modality.WINDOW_MODAL);

			    VBox vbox = new VBox(new Text("Deleted Successfully!!!"));
			    vbox.setAlignment(Pos.CENTER);
			    vbox.setPadding(new Insets(15));
			    vbox.setPrefSize(400, 100);

			    dialogStage.setScene(new Scene(vbox));
			    dialogStage.show();
				conn.close();
			} 
			catch (Exception e) 
			{ 
				Stage dialogStage = new Stage();
			    dialogStage.initModality(Modality.WINDOW_MODAL);

			    VBox vbox = new VBox(new Text("Enter valid data!!!"));
			    vbox.setAlignment(Pos.CENTER);
			    vbox.setPadding(new Insets(15));
			    vbox.setPrefSize(400, 100);

			    dialogStage.setScene(new Scene(vbox));
			    dialogStage.show();
			} 
		}

	}
	public boolean check(int t1,String ffname,String llname)
	{
		if(t1<=0 || fname.getText().trim().isEmpty()|| lname.getText().trim().isEmpty() )
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
}

