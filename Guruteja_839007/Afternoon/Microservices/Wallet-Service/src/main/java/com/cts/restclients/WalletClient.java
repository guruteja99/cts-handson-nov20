package com.cts.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.model.AccountStructure;

@FeignClient("http://ACCOUNT-SERVICE")

public interface WalletClient {

	@GetMapping("/account/{accountnumber}")
	public AccountStructure fetchAccountById(@PathVariable Long accountNumber);
	
}
