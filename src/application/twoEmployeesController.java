package application;

import javafx.fxml.FXML;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;

public class twoEmployeesController {
	@FXML
	private TextField id;
	@FXML
	private LineChart<String,Number> linechart;
	@FXML
	private TextField m;
	@FXML
	private TextField id1;
	@FXML
	private TextField m1;
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	int d=0,x=0,y=0;
	double xyz=0,xy=0;

	// Event Listener on Button.onAction
	@FXML
	public void showGraph(ActionEvent event) 
	{
		// TODO Autogenerated
		XYChart.Series<String,Number> series=new XYChart.Series<String,Number>();
		XYChart.Series<String,Number> series1=new XYChart.Series<String,Number>();
		 try 
		 {
			 con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","root");
			int t=Integer.parseInt(id.getText()); 
			ps=con.prepareStatement("Select * from dailyinput where id="+t);
			rs=ps.executeQuery();
			while(rs.next())
			{
				int m11=rs.getInt(4);
				int m22=Integer.parseInt(m.getText());		
				if(m11==m22)
				{
					d=rs.getInt(3);
					x=rs.getInt(13);
					y=rs.getInt(14);
					xy=x-y;
					xyz=(double)xy/x;
					xyz=100-xyz*100;
					System.out.println("EFF"+xyz);
					series.getData().add(new XYChart.Data<String,Number>(d+"",xyz));
				}
			}
			int t1=Integer.parseInt(id1.getText()); 
			ps=con.prepareStatement("Select * from dailyinput where id="+t1);
			rs=ps.executeQuery();
			while(rs.next())
			{
				int m11=rs.getInt(4);
				int m22=Integer.parseInt(m1.getText());		
				if(m11==m22)
				{
					d=rs.getInt(3);
					x=rs.getInt(13);
					y=rs.getInt(14);
					xy=x-y;
					xyz=(double)xy/x;
					xyz=100-xyz*100;
					System.out.println("EFF"+xyz);
					series1.getData().add(new XYChart.Data<String,Number>(d+"",xyz));
				}
			}
			
		 } 
		 catch (SQLException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		linechart.getData().addAll(series,series1);
	}
}

