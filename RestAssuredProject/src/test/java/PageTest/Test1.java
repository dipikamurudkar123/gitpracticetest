package PageTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import drivers.Driverclass;
import utils.common.TestDataReader;

public class Test1 {

	private final String PATH = System.getProperty("user.dir") + "/src/main/resources/Testdata/roisimpleview.json";
	 private List<String> urlList;
	 	Driverclass driver=new Driverclass();
	
	@DataProvider(name="namevalues")
	public Object[][] getdata() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Object [][]data=TestDataReader.gettestdata();
		return data;		
	}
	
	@DataProvider(name = "roiValidInputsValues")
    public Object[] readValidValues() throws Exception {
    	JSONArray jsonArray;
   	 JSONObject jsonObject;

		
        Object[] data = null;
        jsonObject = TestDataReader.readTestDataAsJsonObject(PATH);
        jsonArray = (JSONArray) jsonObject.get("valid");
        data = new Object[jsonArray.size()];
        for (int i = 0; i < jsonArray.size(); i++) {
        	data[i]=jsonArray.get(i).toString();
            
        }
        return  data;
    }
	
	
	
	@BeforeTest
	public void sett() {
	//driver.setbrowsr();
	}
	
	//@Test(dataProvider="namevalues",priority=1)
	public void login(String name, String surname) {
		System.out.println("Hi");
		System.out.println(name);
		System.out.println(surname);
	}
	
	@Test()
	public void dataread() throws Exception {
		
	
        JSONObject dataOnject = TestDataReader.readTestDataAsJsonObject(PATH);
        String name=(String) dataOnject.get("Firstname");
        System.out.println(name);
	}
	
	@Test(dataProvider="roiValidInputsValues")
	public void dataread2(Object obj) throws Exception {
		
	
        JSONObject ob= (JSONObject)obj;
        System.out.println(ob.get("Monitoring nexus threshold"));
	}
}
