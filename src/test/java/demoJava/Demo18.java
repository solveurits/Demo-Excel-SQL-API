package demoJava;
import com.solveurits.excel.Excel;

public class Demo18 {
	public static void main(String args[])
	{
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\data\\Demo8.xlsx";
		String setData="City='Bangalore',Age=56";
		Excel excel=new Excel(filePath);
		excel.updateData("Sheet1",setData);
		System.out.println("Updated");
	}
}
