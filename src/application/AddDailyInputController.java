package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

public class AddDailyInputController implements Initializable
{
	@FXML
	private TextField id;
	@FXML
	private TextField name;
	@FXML
	private TextField dd;
	@FXML
	private TextField start;
	@FXML
	private TextField shift;
	@FXML
	private TextField ot;
	@FXML
	private TextField eop;
	@FXML
	private TextField aop;
	@FXML
	private TextField merror;
	@FXML
	private TextField reject;
	@FXML
	private TextField mm;
	@FXML
	private TextField yyyy;
	@FXML
	private TextField from;
	@FXML
	private TextField to;
	@FXML
	private ComboBox<String> machine;
	@FXML
	private ComboBox<String> process;
	
	final ObservableList options = FXCollections.observableArrayList();
	final ObservableList options1 = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		try 
		{
			fillComboBox();
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		try 
		{
			fillComboBox1();
		} 
		catch (SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		machine.setItems(options);
		process.setItems(options1);
	}
	
	public void fillComboBox() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/factory"; 
        Connection conn = (Connection) DriverManager.getConnection(url,"root","root"); 
        Statement stmt = (Statement) conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from machine");
        
        while(rs.next())
        {
        	options.add(rs.getString(2));
        }
	}
	public void fillComboBox1() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/factory"; 
        Connection conn = (Connection) DriverManager.getConnection(url,"root","root"); 
        Statement stmt = (Statement) conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from machine");
        
        while(rs.next())
        {
        	options1.add(rs.getString(3));
        }
	}
	
	public void getExpected(ActionEvent event)
	{
		String p = (String) process.getValue();
		String m = (String) machine.getValue();
		Double x,y,ot1,total;
		int z;
		try 
		{ 
            String url = "jdbc:mysql://localhost:3306/factory"; 
            Connection conn = (Connection) DriverManager.getConnection(url,"root","root"); 
            Statement stmt = (Statement) conn.createStatement();
  			ResultSet rs = stmt.executeQuery("select * from machine");
  			
			while(rs.next())
			{
				
				if(m.equals(rs.getString(2)) && p.equals(rs.getString(3)))
				{
					x = rs.getDouble(4);
					y = Double.parseDouble(start.getText());
					ot1 = Double.parseDouble(ot.getText());
					total= y + ot1;
					z = (int) ( (total * 3600) / x );
					eop.setText( z + "" );
					conn.close();
				}
			}
		} 
		catch (Exception e) 
		{ 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
		
	}
	
	public void addDaily(ActionEvent event)
	{
		
		int t1 =Integer.parseInt( id.getText());
		String mname=name.getText();
		int dd1 =Integer.parseInt( dd.getText());
		int mm1 =Integer.parseInt( mm.getText());
		int yy1 =Integer.parseInt( yyyy.getText());
		double wh=Double.parseDouble(start.getText());
		double ffrom=Double.parseDouble(from.getText());
		double tto=Double.parseDouble(to.getText());
		String mname1=machine.getValue();
		String  pname=process.getValue();
		String sshift=shift.getText();
		double oot=Double.parseDouble(ot.getText());
		int eeop =Integer.parseInt( eop.getText());
		int aaop =Integer.parseInt( aop.getText());
		int mmerror =Integer.parseInt( merror.getText());
		int rreject =Integer.parseInt( reject.getText());
		float x=aaop-rreject;
		float y=eeop-mmerror;
		float eff1 =  (x/ y) * 100 ; 
		
		try 
		{ 
            String url = "jdbc:mysql://localhost:3306/factory"; 
            Connection conn = (Connection) DriverManager.getConnection(url,"root","root"); 
          
			String query = "INSERT INTO dailyinput ( id, name, dd, mm, yyyy, wh, fromm, tto, mac, process, shift, ot, eop, aop, me, rej, eff)" + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query);
  			ps.setInt (1, t1);
  			ps.setString (2, mname);
  			ps.setInt (3, dd1);
  			ps.setInt (4, mm1);
  			ps.setInt (5, yy1);
  			ps.setDouble (6, wh);
  			ps.setDouble (7, ffrom);
  			ps.setDouble (8, tto);
  			ps.setString (9, mname1);
  			ps.setString (10, pname);
  			ps.setString (11, sshift);
  			ps.setDouble (12, oot);
  			ps.setInt (13, eeop);
  			ps.setInt (14, aaop);
  			ps.setInt (15, mmerror);
  			ps.setInt (16, rreject);
  			ps.setDouble(17, eff1);
  			ps.execute();
  			
  			Stage dialogStage = new Stage();
		    dialogStage.initModality(Modality.WINDOW_MODAL);

		    VBox vbox = new VBox(new Text("Added Successfully!!!"));
		    vbox.setAlignment(Pos.CENTER);
		    vbox.setPadding(new Insets(15));
		    vbox.setPrefSize(400, 100);

		    dialogStage.setScene(new Scene(vbox));
		    dialogStage.show();
			
		    
  			Statement stmt = (Statement) conn.createStatement();
			String sql = "alter table dailyinput order by id";
            stmt.executeUpdate(sql);
  			
            conn.close();
        } 
		catch (Exception e) 
		{ 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
		
	}
}
