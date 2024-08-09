package com.in.service;

import java.util.List;

import com.in.entity.Contact;

public interface ContactService {

	List<Contact> getContactOfUser(Long userId);
}
