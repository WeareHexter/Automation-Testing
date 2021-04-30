package Guru99telecom;

public class TestSuit_JUnit {
	public static void main(String[] args) {
		
		AddCustomer addc = new AddCustomer();
		addc.open();
		addc.run();
		addc.end();
		
		AddCustomerInvalid addci = new AddCustomerInvalid();
		addci.open();
	//	addci.run();
		addci.end();
		
		AddTariffPlan addp = new AddTariffPlan();
		addp.open();
		addp.run();
		addp.end();
		
		AddTariffPlanInvalid addpi = new  AddTariffPlanInvalid();
		addpi.open();
		addpi.run();
		addpi.end();
		
		AddTariffPlanCustomer addt = new AddTariffPlanCustomer();
		addt.open();
		addt.run();
		addt.end();
		
		AddTariffPlanCustomerInvalid addti = new AddTariffPlanCustomerInvalid();
		addti.open();
		addti.run();
		addti.end();
		
		PayBilling pb = new PayBilling();
		pb.open();
		pb.run();
		pb.end();
		
		PayBillingInvalid pbi = new PayBillingInvalid();
		pbi.open();
		pbi.run();
		pbi.end();
	}

}
