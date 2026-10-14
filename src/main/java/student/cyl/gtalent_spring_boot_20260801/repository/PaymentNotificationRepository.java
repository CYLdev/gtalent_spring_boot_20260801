package student.cyl.gtalent_spring_boot_20260801.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.cyl.gtalent_spring_boot_20260801.entity.PaymentNotification;

public interface PaymentNotificationRepository extends JpaRepository<PaymentNotification, Long> {
    
}