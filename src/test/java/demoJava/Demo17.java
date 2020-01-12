package demoJava;
import com.solveurits.excel.Excel;

public class Demo17 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo7.xlsx";
		String sqlQuery="update sheet1 SET City='Bangalore',Age=56 where Active='TRUE'";
		Excel excel=new Excel(filePath);
		excel.executeUpdateQuery(sqlQuery);
		System.out.println("Updated");
	}
}
