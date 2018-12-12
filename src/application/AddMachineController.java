package application;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AddMachineController 
{
	@FXML
	private TextField id;
	@FXML
	private TextField mname;
	@FXML
	private TextField ctime;
	@FXML
	private TextField pname;
	@FXML
	private Label status;

	// Event Listener on Button.onAction
	@FXML
	public void addEmp(ActionEvent event) 
	{
		int t1=0;
		String mmname="",ppname="";
		Boolean flag=false;
		double a=0.0;

		try
		{
			t1 =Integer.parseInt( id.getText());
			mmname=mname.getText();
			ppname=pname.getText();
			a=Double.parseDouble(ctime.getText());
			flag=check(t1,mmname,ppname);
		}
		catch(Exception e)
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
				String query = "INSERT INTO machine ( id, mname, pname, ctime)" + " values (?, ?, ?, ?)";
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query);
	  			ps.setInt (1, t1);
	  			ps.setString (2, mmname);
	  			ps.setString (3, ppname);
	  			ps.setDouble (4,a);
	  			ps.execute();
	  			
	  			String sql = "alter table machine order by id";
	            stmt.executeUpdate(sql);
	            
	  			Stage dialogStage = new Stage();
			    dialogStage.initModality(Modality.WINDOW_MODAL);

			    VBox vbox = new VBox(new Text("Added Successfully!!!"));
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

			    VBox vbox = new VBox(new Text("Enter valid credentials!!!"));
			    vbox.setAlignment(Pos.CENTER);
			    vbox.setPadding(new Insets(15));
			    vbox.setPrefSize(400, 100);

			    dialogStage.setScene(new Scene(vbox));
			    dialogStage.show();
				
				
	        } 
		}
	}
	public boolean check(int t1,String mmname,String ppname)
	{
		if(t1<=0 || mname.getText().trim().isEmpty()|| pname.getText().trim().isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
}
