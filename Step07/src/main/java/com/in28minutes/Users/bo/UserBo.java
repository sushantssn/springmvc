package com.in28minutes.Users.bo;

import com.in28minutes.Users.User;

public interface UserBo {
	
	void save(User stock);
	void update(User stock);
	void delete(User stock);
	User findByUserId(String stockCode);

}
