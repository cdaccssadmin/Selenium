package excelread;

import java.io.IOException;

public class ExcelCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(ExcelMain.getStringdata(1, 0)); 
	      System.out.println(ExcelMain.getIntegerdata(1, 1));
	      System.out.println(ExcelMain.getStringdata(2, 0)); 
	      System.out.println(ExcelMain.getIntegerdata(2, 1));
	      System.out.println(ExcelMain.getStringdata(3, 0)); 
	      System.out.println(ExcelMain.getIntegerdata(3, 1));
	}

}
