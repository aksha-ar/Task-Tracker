package in.mahesh.tasks.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import in.mahesh.tasks.submissionModel.UserDTO;



//connect with taskUserService microService
@FeignClient(name = "USER-SERVICE",url = "http://localhost:8081")
public interface UserService {
	

    @GetMapping("/api/users/profile")
	public UserDTO getUserProfileHandler(@RequestHeader("Authorization") String jwt);


}
 