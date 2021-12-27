package ua.testing.demo_jpa.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ua.testing.demo_jpa.entity.User;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UsersDTO {
	public ArrayList<UserDTO> users = new ArrayList<UserDTO>();;

	public UsersDTO(List<User> findAll) {
		
		for(User user : findAll) {
			users.add(new UserDTO(user));
		}
	}
	

}
