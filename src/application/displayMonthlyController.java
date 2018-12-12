package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;

public class displayMonthlyController implements Initializable
{
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private ObservableList <DisplatMonthly> data;
	
	@FXML
	private TableView<DisplatMonthly> tableDisplay;
	@FXML
	private TableColumn<?, ?> id;
	@FXML
	private TableColumn<?, ?> nod;
	@FXML
	private TableColumn<?, ?> date;
	@FXML
	private TableColumn<?, ?> target;
	@FXML
	private TableColumn<?, ?> present;
	@FXML
	private TableColumn<?, ?> rejection;
	@FXML
	private TableColumn<?, ?> worker;
	@FXML
	private TableColumn<?, ?> owner;
	@FXML
	private TableColumn<?, ?> work;
	@FXML
	private TableColumn<?, ?> oeff;
	@FXML
	private TextField id1;
	 @FXML
	 public void show(ActionEvent e)
	 {
		
		 setCellTable();
			loadDataFromDatabase();
	 }
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// TODO Auto-generated method stub
		try 
		{
			con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","root");
			data=FXCollections.observableArrayList();
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	private void setCellTable() 
	{
		 id.setCellValueFactory(new PropertyValueFactory<>("id"));
		 nod.setCellValueFactory(new PropertyValueFactory<>("nod"));
		 date.setCellValueFactory(new PropertyValueFactory<>("date"));
		 target.setCellValueFactory(new PropertyValueFactory<>("target"));
		 present.setCellValueFactory(new PropertyValueFactory<>("present"));
		 rejection.setCellValueFactory(new PropertyValueFactory<>("rejection"));
		 worker.setCellValueFactory(new PropertyValueFactory<>("worker"));
		 owner.setCellValueFactory(new PropertyValueFactory<>("owner"));
		 work.setCellValueFactory(new PropertyValueFactory<>("work"));
		 oeff.setCellValueFactory(new PropertyValueFactory<>("oeff"));
		 
	 }
	 private void loadDataFromDatabase() 
	 {
		 try 
		 {
			int d=Integer.parseInt(id1.getText());
			ps=con.prepareStatement("Select * from displaymonthly where id="+d);
			rs=ps.executeQuery();
			while(rs.next())
			{
				String s = "" + rs.getInt(1);
				data.add(new DisplatMonthly(s,rs.getInt(2)+"",rs.getString(3),rs.getDouble(4)+"",rs.getDouble(5)+"",rs.getDouble(6)+"",rs.getDouble(7)+"",rs.getDouble(8)+"",rs.getDouble(9)+"",rs.getDouble(10)+""));
			}
		 } 
		 catch (SQLException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		tableDisplay.setItems(data);
		 
	 }
	

}
