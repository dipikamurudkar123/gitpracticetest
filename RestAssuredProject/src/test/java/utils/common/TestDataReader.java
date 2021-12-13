package utils.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TestDataReader {
 
	public static JSONObject jsonObject;
	static Workbook book;
	static Sheet sheet;
	static FileInputStream file=null;
	static String testdatasheetpath="C:\\Users\\dipika.murudkar\\MyPracticeProject\\RestAssuredProject\\src\\main\\resources\\Testdata\\testdata.xlsx";
	
	public static Object[][] gettestdata() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
			file=new FileInputStream(testdatasheetpath);
			book=WorkbookFactory.create(file);
			sheet=book.getSheet("Sheet1");
			Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=0;i<sheet.getLastRowNum();i++) {
				for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
					data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				}
			}
			return data;
	}
	
	 public static JSONObject readTestDataAsJsonObject(String path) throws Exception {
		 JSONParser jsonParser = new JSONParser();
	        FileReader reader = new FileReader(path);
	        Object object = jsonParser.parse(reader);
	        jsonObject=(JSONObject) object;
	        return jsonObject;
	    }
}
