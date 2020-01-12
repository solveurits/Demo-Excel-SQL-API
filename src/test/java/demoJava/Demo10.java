package demoJava;

import com.solveurits.excel.Excel;

public class Demo10 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo1.xlsx";
		String sqlQuery="delete from Sheet1";
		Excel excel=new Excel(filePath);
		excel.executeDeleteQuery(sqlQuery);
		System.out.println("Deleted");
	}
}
