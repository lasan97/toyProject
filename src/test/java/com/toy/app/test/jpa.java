package com.toy.app.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.toy.app.AppApplication;
import com.toy.app.model.account.UserAccount;
import com.toy.app.model.account.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=AppApplication.class)
public class jpa {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void contextLoads() {
		assertThat(userRepository).isNotNull();
//		assertThat(userRepository).isNotNull();
	}
	
    @Test
    public void jpaCreate(){
    	
    	UserAccount userOrigin = new UserAccount();
    	userOrigin.setIdx(1L);
    	userOrigin.setEmail("1111");
    	userOrigin.setHp("010-1234-4567");
    	userOrigin.setName("test_account");
    	userOrigin.setPassword("testpassword");
    	
    	userRepository.save(userOrigin);
    	
    	//조회
    	UserAccount user = userRepository.findByEmail(userOrigin.getEmail());
    	
    	//값 동일한지 테스트
    	if(user != null && user.getEmail().equals(userOrigin.getEmail()) && user.getPassword().equals(userOrigin.getPassword())) {
//    		System.out.println(user.getEmail());
//    		System.out.println(userOrigin.getEmail());
    	}else {
    		System.out.println("wrong");
    		System.out.println(userOrigin.getEmail());
    		assertEquals(0 , 1);
    	}
    	
    	//update?
    	user.setEmail("updatedTest@gmail.com");
    	userRepository.save(user);
    	
    	UserAccount userForUpdateTest = userRepository.findByEmail(userOrigin.getEmail());
    	if(userForUpdateTest != null) {
    		System.out.println("updated fail");
    		assertEquals(0 , 1);
    	}
    	
    	//delete
    	userRepository.deleteById(user.getIdx());
    	UserAccount userForDeleteTest = userRepository.findById(userOrigin.getIdx()).get();
    	if(userForDeleteTest != null) {
    		System.out.println("delete fail");
    		assertEquals(0 , 1);
    	}
    	
    	
    }
}

