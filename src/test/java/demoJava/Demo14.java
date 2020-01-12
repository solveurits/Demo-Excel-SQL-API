package demoJava;
import com.solveurits.excel.Excel;

public class Demo14 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo5.xlsx";
		String sqlQuery="insert INTO Sheet1 (Name, Phone, Age, Salary, Active, City) VALUES ('Alex',9658745633,56,52000,'TRUE','Bangalore')";
		Excel excel=new Excel(filePath);
		excel.executeInsertQuery(sqlQuery);
		System.out.println("Inserted");
	}
}
