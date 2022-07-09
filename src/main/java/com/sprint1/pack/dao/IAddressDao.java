package com.sprint1.pack.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.pack.model.Address;
import com.sprint1.pack.repository.IAddressRepository;
import com.sprint1.pack.service.IAddressService;


@Service
public class IAddressDao implements IAddressService {
@Autowired
private IAddressRepository repositoryAddress;
	@Override
	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		Address add=repositoryAddress.save(address);
		return add;
	}

	@Override
	public int deleteAddressById(int addressid) {
		// TODO Auto-generated method stub
	 /*Address add1=repositoryAddress.findById(addressid).get();
	 repositoryAddress.delete(add1);
	int k= add1.getAddressId();
	if(k==0) {
		return 1;
	}else {
		return 0;*/
		return repositoryAddress.deleteAddById(addressid);
		
	}  
	

	@Override
	public Address updateAddress(Address add) {
		// TODO Auto-generated method stub
		int k=add.getAddressId();
		String city=add.getCity();
		String district=add.getDistrict();
		int status=repositoryAddress.UpdateAddById(city,district,k);
		if(status==1) {
		return add; 
		}else {
			return null;
		}
	}

	@Override
	public Address getAddressById(int id) {
		// TODO Auto-generated method stub
		Address add1=repositoryAddress.findById(id).get();
		return add1;
	}

}