package app.service.user;

import app.dao.domain.User;
import app.dao.map.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImp implements UserServiceI {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public void addUser(User user) {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.insert(user);
	}

	public User getUserById(int userId) {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User user = mapper.selectByPrimaryKey(1);
		return user;
	}

}
