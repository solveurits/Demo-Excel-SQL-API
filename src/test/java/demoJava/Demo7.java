package demoJava;

import java.util.List;
import java.util.Map;

import com.solveurits.excel.Excel;

public class Demo7 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo.xlsx";
		Excel excel=new Excel(filePath);
		List<Map<String, String>> result=excel.selectData("Sheet1");
		
		System.out.println("Employee Data");
		for(Map<String, String> item:result)
		{
			System.out.println(item);
		}
	}
}
