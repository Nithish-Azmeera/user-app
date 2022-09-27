package spring.mongo.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import org.springframework.stereotype.Repository;

import spring.mongo.entity.User;

@Repository
public interface reposit extends MongoRepository<User,Integer>{
	
	
 @Query("{'uname':?0}")
    
	public List<User> findbyname(String name);

    @Query(value="{}", fields="{_id:0,uname:1}")
    List<Object> findNameByPath();

}
