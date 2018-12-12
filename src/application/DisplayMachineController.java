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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;

public class DisplayMachineController implements Initializable {
	/*@FXML
	private TableView tableEmployee;
	@FXML
	private TableColumn idColumn;
	@FXML
	private TableColumn mnameColumn;
	@FXML
	private TableColumn pnameColumn;
	@FXML
	private TableColumn cycleColumn;
	*/private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private ObservableList <DisplayMachine> data;
	
	@FXML
	private TableView<DisplayMachine> tableEmployee;
	@FXML
	private TableColumn<?, ?> idColumn;
	@FXML
	private TableColumn<?, ?> mnameColumn;
	@FXML
	private TableColumn<?, ?> pnameColumn;
	@FXML
	private TableColumn<?, ?> cycleColumn;
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		try 
		{
			con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","root");
			data=FXCollections.observableArrayList();
			setCellTable();
			loadDataFromDatabase();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	 private void setCellTable() 
	 {
		 idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
		 mnameColumn.setCellValueFactory(new PropertyValueFactory<>("fname"));
		 pnameColumn.setCellValueFactory(new PropertyValueFactory<>("lname"));
		 cycleColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
		
		 
	 }
	 private void loadDataFromDatabase() 
	 {
		 try 
		 {
			ps=con.prepareStatement("Select * from machine");
			rs=ps.executeQuery();
			while(rs.next())
			{
				String s = "" + rs.getInt(1);
				System.out.println(s);
				data.add(new DisplayMachine(s,rs.getString(2),rs.getString(3),""+rs.getDouble(4)));
			}
		 } 
		 catch (SQLException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		tableEmployee.setItems(data);
		 
	 }
	 
	

}
