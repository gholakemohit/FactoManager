package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DeleteMonthlyController 
{
	@FXML
	private TextField id;
	@FXML
	private TextField date;

	@FXML
	public void deleteMonthly(ActionEvent event) 
	{
		System.out.println("HI");
		int id1=0;
		String date1="";
	
	
		try
		{
			id1 = Integer.parseInt(id.getText());
			date1 = date.getText();
			//System.out.println(id1+" "+dd1+" "+mm1+" "+yy1+" ");
			//flag=check(id1, dd1, mm1, yy1);
		}
		catch(Exception e)
		{
			//status.setText("Enter valid credentials");
			Stage dialogStage = new Stage();
		    dialogStage.initModality(Modality.WINDOW_MODAL);

		    VBox vbox = new VBox(new Text("Enter valid credentials"));
		    vbox.setAlignment(Pos.CENTER);
		    vbox.setPadding(new Insets(15));
		    vbox.setPrefSize(400, 100);

		    dialogStage.setScene(new Scene(vbox));
		    dialogStage.show();

		}
			
		
			try 
			{
				String url = "jdbc:mysql://localhost:3306/factory"; 
				Connection conn = (Connection) DriverManager.getConnection(url,"root","root"); 
				//String date = dd1+mm1+yy1;
				System.out.println("HI1");
				//String query = "delete from dailyinput where id=" + id1 + "and dd=" + dd1 + "and mm=" + mm1 + "and yyyy=" + yy1 ;
				System.out.println("HI2");
				//PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query);
				System.out.println("HI3");
				//ps.executeUpdate();
				
				String query = "delete from displaymonthly where id = ? and date=?";
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query);
				ps.setInt (1, id1);
				ps.setString (2, date1);
				ps.execute();
				conn.close();
				
				Stage dialogStage = new Stage();
					dialogStage.initModality(Modality.WINDOW_MODAL);

				    VBox vbox = new VBox(new Text("Deleted SuccessFully!!!"));
				    vbox.setAlignment(Pos.CENTER);
				    vbox.setPadding(new Insets(15));
				    vbox.setPrefSize(400, 100);
	
				    dialogStage.setScene(new Scene(vbox));
				    dialogStage.show();

			}
			catch(Exception e1)
			{
				//status.setText("Enter valid credentials");
				
				Stage dialogStage = new Stage();
			    dialogStage.initModality(Modality.WINDOW_MODAL);

			    VBox vbox = new VBox(new Text("Enter valid credentials"));
			    vbox.setAlignment(Pos.CENTER);
			    vbox.setPadding(new Insets(15));
			    vbox.setPrefSize(400, 100);

			    dialogStage.setScene(new Scene(vbox));
			    dialogStage.show();

			}
		}
}
