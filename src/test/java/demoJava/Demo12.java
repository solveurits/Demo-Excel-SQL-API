package demoJava;

import com.solveurits.excel.Excel;

public class Demo12 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo3.xlsx";
		Excel excel=new Excel(filePath);
		excel.deleteData("Sheet1");
		System.out.println("Deleted");
	}
}