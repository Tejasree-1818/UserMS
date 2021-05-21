package com.example.repository;



import org.springframework.data.repository.CrudRepository;


import com.example.entity.CompositeKey;
import com.example.entity.Wishlist;

public interface WishListRepository extends CrudRepository<Wishlist,CompositeKey >{
	

}


