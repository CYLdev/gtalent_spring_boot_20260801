package student.cyl.gtalent_spring_boot_20260801.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.cyl.gtalent_spring_boot_20260801.entity.Payment;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    // jpaRepository 會自動實作這個方法，透過 merchantOrderNo 查詢 Payment。
    Optional<Payment> findByMerchantOrderNo(String merchantOrderNo);
}