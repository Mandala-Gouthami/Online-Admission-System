package com.sprint1.pack.service;

import com.sprint1.pack.model.Address;

public interface IAddressService {
	public Address addAddress(Address address);
	public int deleteAddressById(int addressId);
	public Address updateAddress(Address add);
	public Address getAddressById(int id);

}
