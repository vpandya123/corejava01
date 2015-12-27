package com.digitek.accessModifiers;

public class ReportClientClass {

	public static void main(String[] args) {
		XmlReportClaint();

	}
	
	
	public static void XmlReportClaint(){
		
		XmlReportGenerator xmlrport = new XmlReportGenerator();
		
		xmlrport.putName();
		xmlrport.orderDetail();
	}

}
