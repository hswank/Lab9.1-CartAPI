package co.grandcircus.cartlab.Repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.grandcircus.cartlab.Models.Cart;

public interface CartRepository extends MongoRepository<Cart, String>{
	List<Cart> findByProduct(String product);
}
