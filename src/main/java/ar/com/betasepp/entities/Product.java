package ar.com.betasepp.entities;

import java.math.BigDecimal;
import java.util.Date;

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
@Table(name = "Productos")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "pro_id")
	private Integer id;
	@Column(name = "pro_name")
	private String name;
	@Column(name = "pro_date")
	private Date date;
	@Column(name = "pro_price")
	private BigDecimal price;
	
}
