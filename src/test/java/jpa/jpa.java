package jpa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import com.toy.app.model.account.UserAccount;
import com.toy.app.model.account.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = {UserRepository.class}
		,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@EnableJpaRepositories(basePackages = {"*Repository" })
@AutoConfigureMockMvc
public class jpa {
	
	@Autowired
	UserRepository userRepository;
	
	@Test
    public void test(){
        
    	assertEquals(2, 1+1);
    }
    
    @Test
    public void jpaCreate(){
    	
    	UserAccount userOrigin = new UserAccount();
    	userOrigin.setIdx(1L);
    	userOrigin.setEmail("test@gmail.com");
    	userOrigin.setHp("010-1234-4567");
    	userOrigin.setName("test_account");
    	userOrigin.setPassword("testpassword");
//    	userOrigin.setRole(UserAccount.Role.USER);
    	
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
//    	userRepository.save(user);
    	
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

