package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.model.AccountStructure;
import com.cts.model.Wallet;
import com.cts.restclients.WalletClient;

@Service
public class WalletService {

	@Autowired
	private RestTemplate rest;
	
	@Autowired
	private WalletClient client;
	
	public Wallet addAmountToWallet(long num) {
		
		
		Wallet wallet = new Wallet();
		//AccountStructure account = rest.getForObject("http://ACCOUNT-SERVICE/account/"+num, AccountStructure.class);
		AccountStructure account = client.fetchAccountById(num);
		//Double amount = client.getAmountThroughAccount(num);
		wallet.setBalance(wallet.getBalance()+(account.getAmount()*0.5));
		return wallet;

	}

	
}
