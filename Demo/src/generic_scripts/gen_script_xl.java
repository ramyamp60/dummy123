package generic_scripts;

import java.io.FileInputStream;

import com.google.common.collect.Table.Cell;


public class gen_script_xl {
	public static String ram(String s,int r,int c)
	{
		String value="";
		try {
			FileInputStream f=FileInputStream("./")
			workbook book=workbookFactory.create(f);//open file
			Sheet sheet=book.getSheet(s);//which sheet
			Row row=sheet.getRow(r);//which row
			Cell cell=row.getCell(c);//which cell
			value=cell.toString();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	}


