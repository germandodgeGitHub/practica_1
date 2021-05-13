package ar.com.betasepp.auth.entities;

import java.math.BigInteger;

import javax.persistence.Entity;
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
@Table(name = "Usuarios",schema = "Sistema")
public class User {

	private BigInteger id;
	


	
	
	
	
}
