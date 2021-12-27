package ua.testing.demo_jpa.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ua.testing.demo_jpa.entity.RoleType;
import ua.testing.demo_jpa.entity.User;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserDTO {
    public Long id;
    public String firstName;
    public String lastName;
    public String email;
    public RoleType role = RoleType.ROLE_USER;
    
    public UserDTO() {
    	
    }
    
	public UserDTO(User user) {
		this.id = user.getId();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.email = user.getEmail();
		this.role = user.getRole();
	}
	
	public String getEmail() {
		return this.email;
	}
}
