package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

public class DeleteDailyController 
{
	@FXML
	private TextField id;
	@FXML
	private TextField dd;
	@FXML
	private TextField mm;
	@FXML
	private TextField yyyy;

	@FXML
	public void deleteDaily(ActionEvent event) 
	{
		System.out.println("HI");
		int id1=0;
		int dd1=0,mm1=0,yy1=0;
	
	
		try
		{
			id1 = Integer.parseInt(id.getText());
			dd1 = Integer.parseInt(dd.getText());
			mm1 = Integer.parseInt(mm.getText());
			yy1= Integer.parseInt(yyyy.getText());
			System.out.println(id1+" "+dd1+" "+mm1+" "+yy1+" ");
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
				
				String query = "delete from dailyinput where id = ? and dd=? and mm=? and yyyy=?";
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query);
				ps.setInt (1, id1);
				ps.setInt (2, dd1);
				ps.setInt (3, mm1);
				ps.setInt (4,yy1);
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
	

	public boolean check(int id1,String dd1,String mm1, String yy1  )
	{
		if(dd.getText().trim().isEmpty()|| mm.getText().trim().isEmpty()|| yyyy.getText().trim().isEmpty())                     
		{
			return false;
		}
		else
		{
			return true;
		}
	}


	
	}



