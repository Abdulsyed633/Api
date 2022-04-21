package org.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiTest {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		File f = new File(
				"C:\\Users\\WELCOME\\eclipse-workspace\\ApiTest\\src\\test\\resources\\JSON Files\\listuser.json");

		ObjectMapper mapper = new ObjectMapper();

		ArrayList<Datum> d = new ArrayList<Datum>();

		Datum d1 = new Datum(7, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Datum d2 = new Datum(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson",
				"https://reqres.in/img/faces/8-image.jpg");
		Datum d3 = new Datum(9, "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg");
		Datum d4 = new Datum(10, "byron.fields@reqres.in", "Byron", "Fields",
				"https://reqres.in/img/faces/10-image.jpg");
		Datum d5 = new Datum(11, "george.edwards@reqres.in", "George", "Edwards",
				"https://reqres.in/img/faces/11-image.jpg");
		Datum d6 = new Datum(12, "rachel.howell@reqres.in", "Rachel", "Howell",
				"https://reqres.in/img/faces/12-image.jpg");

		d.add(d1);
		d.add(d2);
		d.add(d3);
		d.add(d4);
		d.add(d5);
		d.add(d6);
		
		
		Support s = new Support("https://reqres.in/#support-heading","To keep ReqRes free, contributions towards server costs are appreciated!");
		
		Root r = new Root(2, 6, 12, 2, d, s);
		
		mapper.writeValue(f, r);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// Root r = new Root(2, 6, 12, 2, data, support)

		// Root r = mapper.readValue(f, Root.class);
		//
		// System.out.println(r.getPage());
		// System.out.println(r.getPer_page());
		// System.out.println(r.getTotal());
		// System.out.println(r.getTotal_pages());
		//
		// Support support = r.getSupport();
		//
		// System.out.println(support.getUrl());
		// System.out.println(support.getText());
		//
		// ArrayList<Datum> d = r.getData();
		//
		// for (Datum x : d) {
		//
		// System.out.println(x.getId());
		// System.out.println(x.getEmail());
		// System.out.println(x.getFirst_name());
		// System.out.println(x.getLast_name());
		// System.out.println(x.getAvatar());
		//
		// }
		//
		//

	}

}
