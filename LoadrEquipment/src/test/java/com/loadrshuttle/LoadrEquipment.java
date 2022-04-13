package com.loadrshuttle;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.Baseloadr;
import objects.Objects;

public class LoadrEquipment extends Baseloadr{
	
	
	
	
	
	
	  @Test
	  public void execute() {
		  
		  Objects obj = new Objects(driver);
		  
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		  obj.login("admin@1go.ph", "vmsi123!");
		  
		  obj.createBookings();
		  
		  obj.myBookings();
		  
		  obj.market();
		  
		  obj.gpsHistory();
		  
		  obj.fleetView();
		  
		  obj.booking();
		  
		  obj.location();
		  
		  obj.rates();
		  
		  obj.zone();
		  
		  obj.employees();
		  
		  obj.users();
		  
		  obj.vehicle();
		  
		  obj.mEmployees();
		  
		  obj.mLocation();
		  
		  obj.mZone();
		  
		  obj.group();
		  
		  obj.negotiatedRates();
		  
		  obj.vehicleCatalogue();
		  
		  obj.roles();
		  
		  obj.permission();
		  
		  obj.routeCode();
		  
		  obj.serviceTask();
		  
		  obj.driver();
		  
		  obj.resource();
		  
		  obj.callTimeCompliance();
		  
		  obj.ratings();
		  
		  obj.shipmentAccuracy();
		  
		  obj.bookings();
		  
		  obj.Rvehicle();
		  
		  obj.pms();
		  
		  obj.yard();
		  
		  obj.driverJobPortal();
		  
		  obj.jobPost();
		  
		  obj.transaction();
		  
		  obj.pod();
		  
		  obj.productCatalogue();
		  
		  obj.orders();
		  
		  obj.help();

		  
		  
	  }
	  
	  
	  
}

