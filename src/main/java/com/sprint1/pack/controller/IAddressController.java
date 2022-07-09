package com.sprint1.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.pack.dao.IAddressDao;
import com.sprint1.pack.model.Address;

@RestController
public class IAddressController {
	@Autowired
	private IAddressDao dao;
	@PostMapping(path="/createAddress")
	public Address addAddress(@RequestBody Address address) {
		return dao.addAddress(address);
		
	}
	@GetMapping(path="/getAddressById/{id2}")
	public Address getAddressById(@PathVariable int id2) {
		return dao.getAddressById(id2);
	}
	@DeleteMapping(path="/deleteAddress/{id1}")
	public int deleteAddressById(@PathVariable int id1) {
		return dao.deleteAddressById(id1);
		
	}
	@PutMapping(path="/updateAddress/{addId}")
	public Address updateAddress(@RequestBody Address add, @PathVariable int addId) {
		return dao.updateAddress(add);
	}
}
