package demoJava;
import com.solveurits.excel.Excel;

public class Demo15 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo5.xlsx";
		String sqlQuery="insert INTO Sheet1 (Name, Age, Salary, Active) VALUES ('Alex',56,52000,'TRUE')";
		Excel excel=new Excel(filePath);
		excel.executeInsertQuery(sqlQuery);
		System.out.println("Inserted");
	}
}
