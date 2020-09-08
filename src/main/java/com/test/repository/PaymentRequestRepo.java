package com.test.repository;

import com.test.domain.PaymentRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//Represents repository for payment requests data handling

@Repository
public interface PaymentRequestRepo extends CrudRepository<PaymentRequest, Long> {

    Optional<PaymentRequest> getByTicketId(Integer id);
}
