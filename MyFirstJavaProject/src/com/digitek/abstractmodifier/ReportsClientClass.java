package com.digitek.abstractmodifier;

public class ReportsClientClass {

	public static void main(String[] args) {
		CSVReportsClient();
		
		XMLReportsClient();
	}

	
	
	public static void CSVReportsClient(){
		
		CSVReportsGenerator CSVReports = new CSVReportsGenerator();
		
		CSVReports.generateHeader();
		CSVReports.putLogo();
		CSVReports.generateBody();
		CSVReports.generateFooter();
	
	}
	
	public static void XMLReportsClient(){
		
		XMLReportsGenerator xmlReports = new XMLReportsGenerator();
		
		xmlReports.generateHeader();
		xmlReports.putLogo();
		xmlReports.generateBody();
		xmlReports.generateFooter();
	
	}
	
	
}


