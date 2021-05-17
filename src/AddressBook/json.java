package com.jsonfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class Json_Read_WriteFile {
	
	public static final String path = "C:\\User\\Dell\\ecplise-workshop\\Day28\\src\\main\\addressBook\\AddressBook.json";
	
	public static void writeJsonData() throws IOException {	
		Person personobj = new Person();
		
		personobj.setFirstname("Himanshu");
		personobj.setLastname("Kaushik");
		personobj.setAddress("Janakpuri");
		personobj.setCity("Delhi");
		personobj.setState("Delhi");
		personobj.setZip("110018");
		personobj.setphoneNumber("9860641590");
		personobj.setemail("kaushik@gmail.com");
		
		Gson gson = new Gson();
		String json = gson.toJson(personobj);
		
		FileWriter writer = new FileWriter(path);
     	writer.write(json);
	
		writer.close();
		
	}
	
	public static void readJsonData() throws IOException {
		Gson gson = new Gson();
		FileReader reader = new FileReader(path);
		
		Person personobj = gson.fromJson(reader, Person.class);
		
		System.out.println("FirstName: "+personobj.getFirstname());
		System.out.println("LastName: "+personobj.getLastname());
		System.out.println("Address: "+personobj.getAddress());
		System.out.println("City: "+personobj.getCity());
		System.out.println("State: "+personobj.getState());
		System.out.println("ZipCode: "+personobj.getZip());
		System.out.println("PhoneNumber: "+personobj.getphoneNumber());
		System.out.println("EmailId: "+personobj.getemail());
		
		reader.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		writeJsonData();
		readJsonData();
	}

}