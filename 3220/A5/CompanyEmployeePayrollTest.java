package com.emp.pay.bb;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompanyEmployeePayrollTest {
	
	private Employee e1, e2;
	private SalariedEmployee e3, e4;
	private HourlyEmployee e5, e6;
	private CommissionEmployee e7, e8;
	private BaseSalariedCommissionEmployee e9, e10;
	private PieceWorkerEmployee e11, e12;
	
	@BeforeEach
	void runBeforeEach() {
		e1 = new Employee();
		e2 = new Employee();
		e3 = new SalariedEmployee();
		e4 = new SalariedEmployee();
		e5 = new HourlyEmployee();
		e6 = new HourlyEmployee();
		e7 = new CommissionEmployee();
		e8 = new CommissionEmployee();
		e9 = new BaseSalariedCommissionEmployee();
		e10 = new BaseSalariedCommissionEmployee();
		e11 = new PieceWorkerEmployee();
		e12 = new PieceWorkerEmployee();
		
		System.out.println("Print before each Test Method...");
		
	}

	// Employee Class Method Tests
	
	@Test
	void testEmployeeGetName() {
		e2.setName("John");
		assertNull(e1.getName());
		assertEquals("John", e2.getName());
	}
	
	@Test
	void testEmployeeSetName() {
		e1.setName("Gurujot");
		e2.setName("Ishi");
		assertEquals("Gurujot", e1.getName());
		assertEquals("Ishi", e2.getName());
	}
	
	@Test
	void testEmployeeGetAddress() {
		e2.setAddress("Brampton");
		assertNull(e1.getAddress());
		assertEquals("Brampton", e2.getAddress());
	}

	@Test
	void testEmployeeSetAddress() {
		e1.setAddress("Toronto");
		e2.setAddress("Windsor");
		assertEquals("Toronto", e1.getAddress());
		assertEquals("Windsor", e2.getAddress());
	}
	
	@Test
	void testEmployeeGetSIN() {
		e2.setSIN("123456789");
		assertNull(e1.getSIN());
		assertEquals("123456789", e2.getSIN());
		
	}
	
	@Test
	void testEmployeeSetSIN() {
		e1.setSIN("12345");
		e2.setSIN("54321");
		assertEquals("12345", e1.getSIN());
		assertEquals("54321", e2.getSIN());
	}
	
	// Salaried Employee Class Method Tests
	
	@Test
	void testSalariedEmployeeGetWeeklySalary() {
		e3.setWeeklySalary(800);
		e4.setWeeklySalary(500);
		assertEquals(800, e3.getWeeklySalary());
		assertEquals(500, e4.getWeeklySalary());
	}
	
	@Test
	void testSalariedEmployeeSetWeeklySalary() {
		e3.setWeeklySalary(1000);
		e4.setWeeklySalary(1200);
		assertEquals(1000, e3.getWeeklySalary());
		assertEquals(1200, e4.getWeeklySalary());
	}
	
	@Test
	void testSalariedEmployeeEarnings() {
		e3.setWeeklySalary(200);
		e4.setWeeklySalary(400);
		assertEquals(200, e3.getWeeklySalary());
		assertEquals(400, e4.getWeeklySalary());
	}
	
	// hourly Employee Class Method Tests
	
	@Test
	void testHourlyEmployeeGetWage() {
		e5.setWage(20);
		e6.setWage(0);
		assertEquals(20, e5.getWage());
		assertEquals(0, e6.getWage());
	}
	
	@Test
	void testHourlyEmployeeSetWage() {
		e5.setWage(10);
		e6.setWage(5);
		assertEquals(10, e5.getWage());
		assertEquals(5, e6.getWage());
	}
	
	@Test
	void testHourlyEmployeeGetHours() {
		e5.setHours(20);
		e6.setHours(30);
		assertEquals(20, e5.getHours());
		assertEquals(30, e6.getHours());
	}
	
	@Test
	void testHourlyEmployeeSetHours() {
		e5.setHours(20);
		e6.setHours(30);
		assertEquals(20, e5.getHours());
		assertEquals(30, e6.getHours());
	}
	
	@Test
	void testHourlyEmployeeEarnings() {
		e5.setWage(20);
		e5.setHours(40);
		assertEquals(800, e5.hourlyEmployeeEarnings());
		
		e6.setWage(30);
		e6.setHours(35);
		assertEquals(1050, e6.hourlyEmployeeEarnings());
	}
	
	// Commission Employee Class Method Tests
	
	@Test
	void testCommissionEmployeeGetCommissionRate() {
		e8.setCommissionRate(150);
		assertEquals(0, e7.getCommissionRate());
		assertEquals(150, e8.getCommissionRate());
	}
	
	@Test
	void testCommissionEmployeeSetCommissionRate() {
		e7.setCommissionRate(100);
		e8.setCommissionRate(400);
		assertEquals(100, e7.getCommissionRate());
		assertEquals(400, e8.getCommissionRate());
	}
	
	@Test
	void testCommissionEmployeeGetGrossSales() {
		e8.setGrossSales(1000);
		assertEquals(0, e7.getGrossSales());
		assertEquals(1000, e8.getGrossSales());
	}
	
	@Test
	void testCommissionEmployeeSetGrossSales() {
		e7.setGrossSales(500);
		e8.setGrossSales(700);
		assertEquals(500, e7.getGrossSales());
		assertEquals(700, e8.getGrossSales());
	}
	
	@Test
	void testCommissionEmployeeCommissionEarnings() {
		e7.setCommissionRate(100);
		e7.setGrossSales(50);
		assertEquals(5000, e7.commissionEmployeeEarnings());
	}
	
	// Base-salaried Class Method Tests
	
	@Test
	void testBaseSalariedGetBaseSalary() {
		e10.setBaseSalary(50000);
		assertEquals(0, e9.getBaseSalary());
		assertEquals(50000, e10.getBaseSalary());
	}
	
	
	@Test
	void testBaseSalariedSetBaseSalary() {
		e9.setBaseSalary(20000);
		e10.setBaseSalary(30000);
		assertEquals(20000, e9.getBaseSalary());
		assertEquals(30000, e10.getBaseSalary());
	}
	
	@Test
	void testBaseSalariedCommissionEmployeeEarnings() {
		e9.setBaseSalary(50000);
		e9.setCommissionRate(100);
		e9.setGrossSales(50);
		assertEquals(55000, e9.baseSalariedCommissionEmployeeEarnings());
	}
	
	// PieceWorker Class Method Tests
	
	@Test
	void testPieceWorkerGetWagePerPieces() {
		e12.setWagePerPieces(20);
		assertEquals(0, e11.getWagePerPieces());
		assertEquals(20, e12.getWagePerPieces());
	}
	
	@Test
	void testPieceWorkerSetWagePerPieces() {
		e11.setWagePerPieces(10);
		e12.setWagePerPieces(15);
		assertEquals(10, e11.getWagePerPieces());
		assertEquals(15, e12.getWagePerPieces());
	}
	
	@Test
	void testPieceWorkerGetNumberOfPieces() {
		e12.setNumberOfPiecesOfMerchandise(50);
		assertEquals(0, e11.getNumberOfPiecesOfMerchandise());
		assertEquals(50, e12.getNumberOfPiecesOfMerchandise());
	}
	
	@Test
	void testPieceWorkerSetNumberOfPieces() {
		e11.setNumberOfPiecesOfMerchandise(20);
		e12.setNumberOfPiecesOfMerchandise(25);
		assertEquals(20, e11.getNumberOfPiecesOfMerchandise());
		assertEquals(25, e12.getNumberOfPiecesOfMerchandise());
	}
	
	@Test
	void testPieceWorkerSetEmployeeEarnings() {
		e11.setWagePerPieces(20);
		e11.setNumberOfPiecesOfMerchandise(50);
		assertEquals(1010, e11.pieceWorkerEmployeeEarnings());
	}
}
