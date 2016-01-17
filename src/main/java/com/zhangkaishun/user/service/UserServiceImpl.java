package com.zhangkaishun.user.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangkaishun.user.dao.UserDao;
import com.zhangkaishun.user.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public User getById(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		User user=null;
		try {
			UserDao userDao=session.getMapper(UserDao.class);
			user=userDao.getById(id);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}
		finally{
			session.close();
		}

		return user;
	}

}
