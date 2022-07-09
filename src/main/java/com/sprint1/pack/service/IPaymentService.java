package com.sprint1.pack.service;

import java.util.List;

import com.sprint1.pack.model.Payment;

public interface IPaymentService {
	public Payment addPayment(Payment payment);
	public List<Payment> viewAllPaymentDetails();
	public List<Payment> getPaymentDetailsByEmail(String emailId);
	public Payment getPaymentDetailsByPaymentId(int paymentId);
	public Payment getPaymentDetailsByApplicationId(int applicationId);
	public List<Payment> getPaymentDetailsByStatus(String paymentStatus);
	public int deletePaymentById(int paymentById);
	public int updatePaymentDetails(Payment payment);

}
