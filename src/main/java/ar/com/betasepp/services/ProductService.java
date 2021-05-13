package ar.com.betasepp.services;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.betasepp.entities.Product;
import ar.com.betasepp.repositories.IProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService {
	private final IProductRepository iProductRepository;

	public List<Product> listAll() throws Exception {
		try {
			return iProductRepository.findAll();
		} catch (Exception exception) {
			throw exception;
		}
	}

	public Optional<Product> getById(BigInteger id) throws Exception {
		try {
			return iProductRepository.findById(id);
		} catch (Exception exception) {
			throw exception;
		}

	}

	public Boolean save(Product product) throws Exception {
		try {
			product.setDate(new Date());
			product = iProductRepository.save(product);
			return Boolean.TRUE;
		} catch (Exception exception) {
			throw exception;
		}
	}
}
