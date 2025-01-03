package br.com.lxndrrbrt.notificationms.repository;

import br.com.lxndrrbrt.notificationms.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
