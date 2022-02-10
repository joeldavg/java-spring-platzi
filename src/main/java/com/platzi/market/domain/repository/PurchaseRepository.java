package com.platzi.market.domain.repository;

import java.util.List;
import java.util.Optional;

import com.platzi.market.domain.Purchase;

public interface PurchaseRepository {
	
	public List<Purchase> getAll();
	
	public Optional<List<Purchase>> getByClient(String clientId);
	
	public Purchase save(Purchase purchase);
}
