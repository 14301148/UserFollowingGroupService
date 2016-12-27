package cn.edu.bjtu.weibo.service.impl;

import java.util.List;

import cn.edu.bjtu.weibo.service.UserFollowingGroupService;
import cn.edu.bjtu.weibo.dao;
@Service("UserFollowingGroupService")
public class UserFollowingGroupServiceImpl implements UserFollowingGroupService {


	public boolean andToNewGroup(String userId, String otherUserId,
			String groupName) {
		boolean tag;
		@Autowired
		UserDao userdao = new UserDao();
		tag=userdao.insertNewGroup(userId,  groupName);
		return tag;
	}

	
	public boolean addToExistedGroup(String userId, String otherUserId,
			String groupId) {
		boolean tag;
		@Autowired
		UserDao userdao = new UserDao();
		tag=userdao. insertUserToGroup(userId,  groupId,otherUserId);
		return tag;
	}

	public List<String> getGroupNames(String userId,int pageIndex,int pagePerNumber) {
	
		List<String> list =null;
		@Autowired
		UserDao userdao=new UserDao();
		list=getGroups(userId,  pageIndex,  pagePerNumber);
		return list;
	}


	public List<String> getUsersByGroup(String userId,String groupId,int pageIndex,int pagePerNumber) {
		
		List<String> list =null;
		@Autowired
		UserDao userdao=new UserDao();
		list=getUsersByGroup(String userId,groupId,  pageIndex,  pagePerNumber);
		return list;
	}

}
