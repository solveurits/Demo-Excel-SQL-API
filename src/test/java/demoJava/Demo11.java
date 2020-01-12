package demoJava;

import com.solveurits.excel.Excel;

public class Demo11 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo2.xlsx";
		String sqlQuery="delete from Sheet1 where Age>25 and Active='TRUE'";
		Excel excel=new Excel(filePath);
		excel.executeDeleteQuery(sqlQuery);
		System.out.println("Deleted");
	}
}