package ar.com.betasepp.auth.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "Usuarios",schema = "Sistema")
@Table(name = "Usuarios")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "usr_id")
	private Integer id;
//	@NotNull
	@Column(name = "usr_mail")
	private String email;
	@Column(name = "usr_name")
	private String name;


	
	
	
	
}
