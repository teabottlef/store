package com.abel.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.abel.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
