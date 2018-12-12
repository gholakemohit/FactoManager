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

public class DisplayEmployeeController implements Initializable
{
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private ObservableList <DisplayEmployee> data;
	
	@FXML
	private TableView<DisplayEmployee> tableEmployee;
	@FXML
	private TableColumn<?, ?> idColumn;
	@FXML
	private TableColumn<?, ?> fnameColumn;
	@FXML
	private TableColumn<?, ?> lnameColumn;
	@FXML
	private TableColumn<?, ?> genderColumn;
	@FXML
	private TableColumn<?, ?> mnoColumn;
	@FXML
	private TableColumn<?, ?> addColumn;
	@Override
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
		 fnameColumn.setCellValueFactory(new PropertyValueFactory<>("fname"));
		 lnameColumn.setCellValueFactory(new PropertyValueFactory<>("lname"));
		 genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
		 mnoColumn.setCellValueFactory(new PropertyValueFactory<>("mno"));
		 addColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
		 
	 }
	 private void loadDataFromDatabase() 
	 {
		 try 
		 {
			ps=con.prepareStatement("select * from employee order by id");
			rs=ps.executeQuery();
			/*while(rs.next())
			{
				String s = rs.getString(2)+rs.getString(3)+rs.getString(4)+""+rs.getString(5)+rs.getString(6);
				System.out.println(s);
			}*/
			while(rs.next())
			{
				data.add(new DisplayEmployee("" + rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),""+rs.getString(5),rs.getString(6)));
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











