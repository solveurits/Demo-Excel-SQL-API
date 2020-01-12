package demoJava;
import com.solveurits.excel.Excel;

public class Demo16 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo6.xlsx";
		String sqlQuery="update sheet1 SET City= 'Bangalore'";
		Excel excel=new Excel(filePath);
		excel.executeUpdateQuery(sqlQuery);
		System.out.println("Updated");
	}
}
