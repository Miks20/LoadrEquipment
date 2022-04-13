package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Baseobjects;

public class Objects extends Baseobjects{
	
	
	By Uname = By.name("email");
	By Pword = By.name("password");
	By SignInButton = By.className("col-xs-4");
	
	//Sidebar menu buttons
	By sidebarmenu = By.xpath("//nav[@class = 'navbar navbar-static-top']/a[@class = 'sidebar-toggle']");
	
	By Bookings = /*By.xpath("/html/body/div[1]/aside/div/section/ul/li[3]/a") */ By.linkText("Bookings");
	By Cbookings = By.xpath("//a[@href = 'https://tstldr.1go-load.com/createshipments']");
	By myBookings = By.xpath("//a[@href = 'https://tstldr.1go-load.com/loadboard/loads']");
	By Market = By.xpath("//a[@href = 'https://tstldr.1go-load.com/market']");
	
	By Maps = By.linkText("Maps");
	By gpsH = By.xpath("//a[@href = 'https://tstldr.1go-load.com/maps/gps-backtracking']");
	By fview = By.xpath("//a[@href = 'https://tstldr.1go-load.com/admin/fleet-view']");
	
	By fleetDashboard = By.xpath("//a[@href = 'https://tstldr.1go-load.com/fleet']");
	
	By upload = By.linkText("Upload");
	By booking = By.xpath("//a[@href = 'https://tstldr.1go-load.com/upload_booking']");
	By loc = By.xpath("//a[@href = 'https://tstldr.1go-load.com/upload_location']");
	By rates = By.xpath("//a[@href = 'https://tstldr.1go-load.com/upload_rates']");
	By zone = By.xpath("//a[@href = 'https://tstldr.1go-load.com/upload_zone']");
	By employees = By.xpath("//a[@href = 'https://tstldr.1go-load.com/upload_employee']");
	
	By maintenance = By.linkText("Maintenance");
	By users = By.xpath("//a[@href = 'https://tstldr.1go-load.com/users']");
	By vehicle = By.xpath("//a[@href = 'https://tstldr.1go-load.com/trucks']");
	By meployees = By.xpath("//a[@href = 'https://tstldr.1go-load.com/employees']");
	By mloc = By.xpath("//a[@href = 'https://tstldr.1go-load.com/outlets']");
	By mzone = By.xpath("//a[@href = 'https://tstldr.1go-load.com/zone']");
	By group = By.xpath("//a[@href = 'https://tstldr.1go-load.com/group']");
	By negorates = By.xpath("//a[@href = 'https://tstldr.1go-load.com/negotiated-rates']");
	By vehiclecat = By.xpath("//a[@href = 'https://tstldr.1go-load.com/principals/catalogue']");
	By roles = By.xpath("//a[@href = 'https://tstldr.1go-load.com/roles']");
	By permi = By.xpath("//a[@href = 'https://tstldr.1go-load.com/permissions']");
	By routecode = By.xpath("//a[@href = 'https://tstldr.1go-load.com/route-code']");
	By services = By.xpath("//a[@href = 'https://tstldr.1go-load.com/services']");
	
	By reports = By.linkText("Reports");
	By rdriver = By.xpath("//a[@href = 'https://tstldr.1go-load.com/report/driver']");
	By resourse = By.xpath("//a[@href = 'https://tstldr.1go-load.com/report/resource']");
	By rDash = By.xpath("//a[@href = 'https://tstldr.1go-load.com/dashboard']");
	By calltime = By.xpath("//a[@href = 'https://tstldr.1go-load.com/report/compliance']");
	By dRatings = By.xpath("//a[@href = 'https://tstldr.1go-load.com/report/drivers-rating']");
	By shipA = By.xpath("//a[@href = 'https://tstldr.1go-load.com/report/accurracy-of-delivery']");
	By Rbookings = By.xpath("//a[@href = 'https://tstldr.1go-load.com/report/cta-bookings']");
	By Rvehicle = By.xpath("//a[@href = 'https://tstldr.1go-load.com/report/vehicle']");
	By pms = By.xpath("//a[@href = 'https://tstldr.1go-load.com/preventive-maintenance']");
	
	By yard = By.linkText("Yard");
	By yardM = By.xpath("//a[@href = 'https://tstldr.1go-load.com/yard']");
	
	By jobportal = By.xpath("//a[@href = 'https://tstldr.1go-load.com/employees/driver-app']");
	
	By jobpost = By.xpath("//a[@href = 'https://tstldr.1go-load.com/job']");
	
	By soa = By.xpath("//a[@href = 'https://tstldr.1go-load.com/soa']");
	
	By trans = By.xpath("//a[@href = 'https://tstldr.1go-load.com/transaction']");
	
	By pod = By.xpath("//a[@href = 'https://tstldr.1go-load.com/pod-clearing']");
	
	By prodcatalogue = By.xpath("//a[@href = 'https://tstldr.1go-load.com/product/catalogue']");
	
	By orders = By.xpath("//a[@href = 'https://tstldr.1go-load.com/product/orders']");
	
	By help = By.xpath("//a[@href = 'https://tstldr.1go-load.com/help']");
	//---------------------------------
	
	
	 //Maintenance ------------------------ Service Task -----------------------------
	By createservice = By.xpath("/html/body/div[1]/div[1]/section[2]/div[2]/div/div/div[3]/a[1]");
	//By createservice = By.xpath("//*[@href = 'https://tstldr.1go-load.com/service-task/create']");
	By servicename = By.name("service-name");
	By desc = By.name("description");
	By servicesave = By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[2]/button");
	By checkb4del = By.xpath("//*[@id=\"tbl_users\"]");
	By servicedel = By.xpath("//*[@id=\"deleteBtn\"]");
	By confirmdel = By.xpath("//*[@id=\"deleteConfirmed\"]");
	
	
	//Reports-----------------------PMS----------------------------------
	By serviceH = By.xpath("//a[@href = 'https://tstldr.1go-load.com/service-history']");
	By anyserviceH = By.xpath("//*[@id=\"tbl_users\"]/tbody/tr[7]/td[11]/a");
	By pmslink = By.linkText("PMS");
	By pmsyear = By.id("year");
	By pmsvehicle = By.id("vehicle");
	By pmsgen = By.id("generate");	
	By waitdl = By.xpath("//*[@id=\"tbl_pms\"]/tbody/tr[1]/td[1]");
	By dl = By.id("download");	
	
	

	public Objects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 WebDriverWait wait = new WebDriverWait(driver , 10);
	
	public void login(String username, String password) {
			
			driver.findElement(Uname).sendKeys(username);
			driver.findElement(Pword).sendKeys(password);	
			driver.findElement(SignInButton).click();
			
		}
	
	//Bookings-------------------Create Bookings----------------------
	
	public void createBookings() {
		driver.findElement(sidebarmenu).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Bookings));
		  
		  driver.findElement(Bookings).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Cbookings));
		  
		  driver.findElement(Cbookings).click();
		  
	}
	  
	  
	  
	  //Bookings----------------------My Bookings------------------------
	public void myBookings() {
		driver.findElement(sidebarmenu).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Bookings));
		  
		  driver.findElement(Bookings).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(myBookings));
		  
		  driver.findElement(myBookings).click();
	}
	  
	  

	  
	  //Bookings----------------------Market------------------------------
	  public void market() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Bookings));
		  
		  driver.findElement(Bookings).click();

		  wait.until(ExpectedConditions.visibilityOfElementLocated(Market));
		  
		  driver.findElement(Market).click();
	  }
	  

	  //Maps--------------------------GPShistory--------------------------
	  public void gpsHistory() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Maps));
		  
		  driver.findElement(Maps).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(gpsH));
		  
		  driver.findElement(gpsH).click();
	  }
	  
	  //Maps--------------------------FleetVeiw---------------------------
	  
	  public void fleetView() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Maps));
		  
		  driver.findElement(Maps).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(fview));
		  
		  driver.findElement(fview).click();
	  }
	  
	
	  //Fleet dashboard---------------
	  
	 // public void fleetDashboard() {
		  
		// driver.findElement(sidebarmenu).click();
		  
			//  wait.until(ExpectedConditions.visibilityOfElementLocated(fleetDashboard));
			  
			//  driver.findElement(fleetDashboard).click();
			  
			  
	//  }
	  
	 
	  //Upload-----------------booking--------------
	  
	  public void booking() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(upload));

		  driver.findElement(upload).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(booking));
		  
		  driver.findElement(booking).click();
		  
	  }
	  
	//Upload----------------------location---------------------
	  
	  public void location() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(upload));

		  driver.findElement(upload).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		  
		  driver.findElement(loc).click();
	  }
	  

	  
	  //Upload-------------------------Rates---------------------
	  
	  public void rates() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(upload));

		  driver.findElement(upload).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(rates));
		  
		  driver.findElement(rates).click();
		  
	  }
	  

	  
	  //Upload-------------------------zone---------------------
	  
	  public void zone() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(upload));

		  driver.findElement(upload).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(zone));
		  
		  driver.findElement(zone).click();  
	  }
	  
	  
	  
	  //Upload-------------------------Employees---------------------
	  
	  public void employees() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(upload));

		  driver.findElement(upload).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(employees));
		  
		  driver.findElement(employees).click();
	  }
  
	  
	  //Maintenance ------------------------users-----------------------------
	  public void users() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(users));
			  
		  driver.findElement(users).click();
	  }
		
	  
	  
	  
	//Maintenance ------------------------Vehicle-----------------------------
	  
	  public void vehicle() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(vehicle));
			  
		  driver.findElement(vehicle).click();
	  }
		
	  
	  
	//Maintenance ------------------------Employees-----------------------------
	  
	  public void mEmployees() {
		  
		  driver.findElement(sidebarmenu).click();
		    
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(meployees));
			  
		  driver.findElement(meployees).click();
	  }
		
	  
	//Maintenance ------------------------Location-----------------------------
	  
	  public void mLocation() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(mloc));
			  
		  driver.findElement(mloc).click();
	  }
	
	//Maintenance ------------------------Zone-----------------------------
	  
	  public void mZone() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(mzone));
			  
		  driver.findElement(mzone).click();
	  }
		
	  
	//Maintenance ------------------------Group-----------------------------
	  public void group() {

		  driver.findElement(sidebarmenu).click();
			  
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(group));
			  
		  driver.findElement(group).click();
	  }

	  
	//Maintenance ------------------------Negotiated Rates-----------------------------
	  public void negotiatedRates() {
		  
		  driver.findElement(sidebarmenu).click();
		    
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(negorates));
			  
		  driver.findElement(negorates).click();
	  }
		
	  
	//Maintenance ------------------------Vehicle Catalogue-----------------------------
	  public void vehicleCatalogue() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(vehiclecat));
			  
		  driver.findElement(vehiclecat).click();
	  }

	//Maintenance ------------------------Roles-----------------------------
	  public void roles() {

		  driver.findElement(sidebarmenu).click();
			  
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(roles));
			  
		  driver.findElement(roles).click();
	  }
		  
	  
	//Maintenance ------------------------Permission-----------------------------
	  public void permission() {
		
		  driver.findElement(sidebarmenu).click();
	  	  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(permi));
			  
		  driver.findElement(permi).click();
	  }
		
	//Maintenance ------------------------route code-----------------------------
	  public void routeCode() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maintenance));

		  driver.findElement(maintenance).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(routecode));
			  
		  driver.findElement(routecode).click();
	  }
		
		
	  //Maintenance ------------------------ Service Task -----------------------------
	  public void serviceTask() {
		  
		  driver.findElement(sidebarmenu).click();
			 
		  //maintenance
		  // driver.findElement(By.xpath("//ul[@class = 'sidebar-menu']/li[@class = 'treeview']/a[@href = '#']/span[@class = 'pull-right-container']/i[@class = 'fa fa-angle-left pull-right']")).click();
		  
		  driver.findElement(maintenance).click();
		  
		  driver.findElement(services).click();
		  
		  
		  /*  
		  wait.until(ExpectedConditions.elementToBeClickable(createservice));
		  
		  driver.findElement(createservice).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(servicename));
		  
		  driver.findElement(servicename).sendKeys("A Test");
		  
		  driver.findElement(desc).sendKeys("A Test");
		  
		  driver.findElement(servicesave).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(checkb4del));
		  
		  driver.findElement(servicedel).click();
		  
		  wait.until(ExpectedConditions.elementToBeClickable(confirmdel));
		  
		  driver.findElement(confirmdel).click();
		 */
		  

		  wait.until(ExpectedConditions.elementToBeClickable(serviceH));
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/section[2]/div[2]/div/div/div[3]/a[2]")));
		  
		  driver.findElement(serviceH).click();
		  
		  wait.until(ExpectedConditions.elementToBeClickable(anyserviceH));
		  
		  driver.findElement(anyserviceH).click();
		  
		  
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  
	  //Reports-----------------------driver----------------------------------
	  public void driver() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(reports));

		  driver.findElement(reports).click();
				  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(rdriver));
				  
		  driver.findElement(rdriver).click();
	  }
 
	  //Reports-----------------------Resource----------------------------------
	  public void resource() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(reports));

		  driver.findElement(reports).click();
				  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(resourse));
				  
		  driver.findElement(resourse).click();
	  }

	  //Reports-----------------------Dashboard----------------------------------
	/*  
	  driver.findElement(sidebarmenu).click();
		  
		  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(reports));

	  driver.findElement(reports).click();
			  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(rDash));
			  
	  driver.findElement(rDash).click();
*/
	  
	  
	  //Reports-----------------------Call time compliance----------------------------------
	  public void callTimeCompliance() {
		  
		  driver.findElement(sidebarmenu).click();
	  	  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(reports));

		  driver.findElement(reports).click();
				  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(calltime));
				  
		  driver.findElement(calltime).click();
	  }

	  //Reports-----------------------Ratings----------------------------------
	  public void ratings() {

		  driver.findElement(sidebarmenu).click();	  
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(reports));

		  driver.findElement(reports).click();
				  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(dRatings));
				  
		  driver.findElement(dRatings).click();
	  }
	  

	  
	  
	  //Reports-----------------------Shipment accuracy----------------------------------
	  public void shipmentAccuracy() {
		  
		  driver.findElement(sidebarmenu).click();	  
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(reports));

		  driver.findElement(reports).click();
				  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(shipA));
				  
		  driver.findElement(shipA).click();
	  }
	  
	  
	  //Reports-----------------------Bookings----------------------------------
	  public void bookings() {
		  
		  driver.findElement(sidebarmenu).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(reports));

		  driver.findElement(reports).click();
				  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Rbookings));
				  
		  driver.findElement(Rbookings).click();
	  }
	  
	  //Reports-----------------------vehicle----------------------------------
	  public void Rvehicle() {

		  driver.findElement(sidebarmenu).click();	  
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(reports));

		  driver.findElement(reports).click();
				  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Rvehicle));
				  
		  driver.findElement(Rvehicle).click();
	  }
	  
	  //Reports-----------------------PMS----------------------------------
	  public void pms() {

		  driver.findElement(sidebarmenu).click();
		  
		  driver.findElement(reports).click();
		  
		  wait.until(ExpectedConditions.elementToBeClickable(pmslink));
		  
		  driver.findElement(pmslink).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(pmsyear));
		  
		  driver.findElement(pmsyear).sendKeys("2021");
		  
		  driver.findElement(pmsvehicle).sendKeys("f3g857");
		  
		  driver.findElement(pmsgen).click();
		  
		  
		  try {
			Thread.sleep(2000);
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(waitdl));
		  driver.findElement(dl).click();
	  } 
	  
	  //Yard---------------------------------------------------------
	  public void yard() {

		  driver.findElement(sidebarmenu).click();

		  wait.until(ExpectedConditions.visibilityOfElementLocated(yard));

		  driver.findElement(yard).click();
				  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(yardM));
				  
		  driver.findElement(yardM).click();
	  }
	  
	  
	  
	  //Driver's Job portal---------------------------------------------------------
	  public void driverJobPortal() {
		  
		  driver.findElement(sidebarmenu).click();  
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(jobportal));

		  driver.findElement(jobportal).click();
	  }
	 
	  //Job post---------------------------------------------------------
	  public void jobPost() {

		  driver.findElement(sidebarmenu).click();	  
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(jobpost));

		  driver.findElement(jobpost).click();
	  }
	  
	  //Transaction---------------------------------------------------------
	  public void transaction() {

		  driver.findElement(sidebarmenu).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(trans));

		  driver.findElement(trans).click();
	  }
	
	  
	  //POD---------------------------------------------------------
	  public void pod() {

		  driver.findElement(sidebarmenu).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(pod));

		  driver.findElement(pod).click();
	  }
	  
	  //Product Catalogue---------------------------------------------------------
	  public void productCatalogue() {

		  driver.findElement(sidebarmenu).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(prodcatalogue));

		  driver.findElement(prodcatalogue).click();
	  }
	  
	  
	  //Orders---------------------------------------------------------
	  public void orders() {

		  driver.findElement(sidebarmenu).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(orders));

		  driver.findElement(orders).click();
	  }

	  
	  //Help---------------------------------------------------------
	  public void help() {

		  driver.findElement(sidebarmenu).click();
			  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(help));

		  driver.findElement(help).click();
		  
	  }
	
}
