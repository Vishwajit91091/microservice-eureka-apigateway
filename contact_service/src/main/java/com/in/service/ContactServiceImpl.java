package com.in.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.in.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list=List.of(

			new Contact(1L,"Sanju@gmail.com","Sanju Singh",101L),
			new Contact(2L,"Avinash@gmail.com","Avinash Singh",103L),
			new Contact(3L,"ankit@gmail.com","Ankit Singh",102L),
			new Contact(4L,"Vishwajit@gmail.com","Vishwajit Singh",101L)

			);
	
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.equals(userId)).collect(Collectors.toList());
	}

}
