package br.com.lxndrrbrt.notificationms.repository;

import br.com.lxndrrbrt.notificationms.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository  extends JpaRepository<Status, Long> {
}
