package org.Helper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmClass {
	public static void generateJvmReport(String json) {
		//1.mention the target
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\JvmReport");
		//Add details
		Configuration con=new Configuration(f, "Facebook");
        con.addClassifications("Browser name", "Chrome");
        con.addClassifications("Browser verion", "92");
        //String to list<String>
        List<String> list=new ArrayList<String>();
        list.add(json);
        
        //Create a object for report builder
        ReportBuilder r=new ReportBuilder(list, con);
        r.generateReports();


	}

}
