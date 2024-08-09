package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	List<User> list = List.of(
			new User(101L,"sanju","2587412"),
			new User(102L,"ankit","14785325"),
			new User(103L,"avinash","14785236")
			);
	
//	public User getUser(Long userId) {
//		User c = null;
//		for(User user:list) {
//			if(user.equals(userId)) {
//				c=user;
//				break;
//			}
//		}
//		return c;
//  }

	public User getUser(Long userId) {
		return list.stream().filter(user->user.equals(userId)).findAny().orElse(null);
	}
}