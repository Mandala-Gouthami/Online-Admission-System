package com.sprint1.pack.repository;

import org.springframework.transaction.annotation.Transactional;

import com.sprint1.pack.model.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends JpaRepository<Address,Integer> {
	@Transactional
	@Modifying
	@Query(value="update  Address a set a.city=?1,a.district=?2 where a.addressId=?3")
	public int UpdateAddById(String city,String district,int addressId);
	@Transactional
	@Modifying
	@Query(value="delete from Address a where a.addressId=?1")
	public int deleteAddById(int addressId);
}