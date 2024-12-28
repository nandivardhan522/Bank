package com.developer.accounts.service;

import com.developer.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * Creates a new account based on the provided customer details.
     *
     * @param customerDto the data transfer object containing customer information
     *                     such as name, email, mobile number, and account details.
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber
     * @return
     */
    CustomerDto fetchAccountDetails(String mobileNumber);

    /**
     * @param customerDto
     * @return
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber
     * @return
     */
    boolean deleteAccount(String mobileNumber);
}
