package ar.com.betasepp.repositories;

import java.math.BigInteger;
import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ar.com.betasepp.entities.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, BigInteger> {

	@Query(value = "Select p from Product p where p.name = ?1")
	Optional<Product> findByName(String name);

	@Query(value = "Select p from Product p where p.date = ?1 and p.id=?2")
	Optional<Product> findByDate(Date date, BigInteger id);

}
