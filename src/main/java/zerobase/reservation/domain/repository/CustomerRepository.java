package zerobase.reservation.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.reservation.domain.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
