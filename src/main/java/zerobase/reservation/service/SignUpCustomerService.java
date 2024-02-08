package zerobase.reservation.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zerobase.reservation.domain.SignUpForm;
import zerobase.reservation.domain.model.Customer;
import zerobase.reservation.domain.repository.CustomerRepository;

/**
 * 고객 회원가입 서비스
 */
@Service
@RequiredArgsConstructor
public class SignUpCustomerService {

    private final CustomerRepository customerRepository;

    public Customer signUp(SignUpForm form){
        return customerRepository.save(Customer.from(form));
    }
}
