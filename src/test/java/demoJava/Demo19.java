package demoJava;
import com.solveurits.excel.Excel;

public class Demo19 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo9.xlsx";
		String setData="City='Bangalore',Age=56";
		String whereCondition="Active='TRUE'";
		Excel excel=new Excel(filePath);
		excel.updateData("Sheet1",whereCondition,setData);
		System.out.println("Updated");
	}
}