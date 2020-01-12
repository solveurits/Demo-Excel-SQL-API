package demoJava;

import java.util.List;
import java.util.Map;

import com.solveurits.excel.Excel;

public class Demo20 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo10.xlsx";
		//Select
		String sqlQuery="Select * from Sheet1 where (City='Bangalore' or Salary>50000) and Age>25";
		Excel excel=new Excel(filePath);
		List<Map<String, String>> result=excel.executeSelectQuery(sqlQuery);
		
		System.out.println("Employee Data");
		for(Map<String, String> item:result)
		{
			System.out.println(item);
		}
		
		//Insert
		sqlQuery="insert INTO Sheet1 (Name, Phone, Age, Salary, Active, City) VALUES ('Alex',9658745633,56,52000,'TRUE','Bangalore')";
		excel=new Excel(filePath);
		excel.executeInsertQuery(sqlQuery);
		
		//Update
		sqlQuery="update sheet1 SET City='Bangalore',Age=56 where Active='TRUE'";
		excel=new Excel(filePath);
		excel.executeUpdateQuery(sqlQuery);
		
		//Delete
		sqlQuery="delete from Sheet1 where Age>25 and Active=TRUE";
		excel=new Excel(filePath);
		excel.executeDeleteQuery(sqlQuery);		
	}
}
