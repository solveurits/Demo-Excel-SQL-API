package demoJava;

import java.util.List;
import java.util.Map;

import com.solveurits.excel.Excel;

public class Demo3 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo.xlsx";
		String sqlQuery="Select * from Sheet1 where Active=TRUE";
		Excel excel=new Excel(filePath);
		List<Map<String, String>> result=excel.executeSelectQuery(sqlQuery);
		
		System.out.println("Employee Data");
		for(Map<String, String> item:result)
		{
			System.out.println(item);
		}
	}
}
