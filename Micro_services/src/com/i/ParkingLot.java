package com.i;

public interface ParkingLot {
	void unparkCar(); 
	void getCapacity(); 
	double calculateFee (car car); 
	void doPayment (car car) throws Exception; 

}