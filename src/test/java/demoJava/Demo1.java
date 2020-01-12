package demoJava;

import java.util.List;
import java.util.Map;

import com.solveurits.excel.Excel;

public class Demo1 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo.xlsx";
		String sqlQuery="Select * from Sheet1";
		Excel excel=new Excel(filePath);
		List<Map<String, String>> result=excel.executeSelectQuery(sqlQuery);
		
		System.out.println("Print Employee Data List");
		System.out.println(result);

		System.out.println("\n");
		System.out.println("Print Employee Data List ForEach");
		for(Map<String, String> item:result)
		{
			System.out.println(item);
		}
		
		System.out.println("\n");
		System.out.println("Print Employee Data using index of List");
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
		
		System.out.println("\n");
		System.out.println("Print only Phone column");
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i).get("Phone"));
		}		
		
		System.out.println("\n");
		System.out.println("Get First Row and Display with Column Name");
		Map<String,String> data=result.get(0);
		System.out.println("Name : "+data.get("Name"));
		System.out.println("Phone : "+data.get("Phone"));
		System.out.println("Age : "+data.get("Age"));
		System.out.println("Salary : "+data.get("Salary"));
		System.out.println("Active : "+data.get("Active"));
		System.out.println("City : "+data.get("City"));
	}
}