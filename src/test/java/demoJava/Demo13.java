package demoJava;

import com.solveurits.excel.Excel;

public class Demo13 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo4.xlsx";
		String whereCondition="Age>25 and Active=TRUE";
		Excel excel=new Excel(filePath);
		excel.deleteData("Sheet1",whereCondition);
		System.out.println("Deleted");
	}
}