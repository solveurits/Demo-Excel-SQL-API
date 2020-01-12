package demoJava;

import java.util.List;
import java.util.Map;

import com.solveurits.excel.Excel;

public class Demo9 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo.xlsx";
		String whereCondition="City='Bangalore'";
		String column="Name,Phone";
		Excel excel=new Excel(filePath);
		List<Map<String, String>> result=excel.selectData("Sheet1", whereCondition, column);
		
		System.out.println("Employee Data");
		for(Map<String, String> item:result)
		{
			System.out.println(item);
		}
	}
}
