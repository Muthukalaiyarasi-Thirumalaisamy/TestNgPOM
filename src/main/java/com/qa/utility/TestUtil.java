package com.qa.utility;

import java.util.ArrayList;

public class TestUtil {
   static Xls_Reader reader;
   
	public static ArrayList<Object[]> getDataFromTestUtil()
	{
		ArrayList<Object[]> testData= new ArrayList<Object[]>();
		
		reader= new Xls_Reader("C:\\My_Projects\\TestngPOM\\crmExcelFile.xlsx");
		
		// sheetName = regData
	for(int rowNum=2;rowNum<=reader.getRowCount("regData");rowNum++)
{
String Name= reader.getCellData("regData", "Name", rowNum);
String Email= reader.getCellData("regData", "Email", rowNum);

Object ob[] = {Name,Email};
testData.add(ob);
	}
	return testData;
}
}