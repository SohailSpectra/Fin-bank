package com.sohail.Fin_Bank.Notification.Repo;

import com.sohail.Fin_Bank.Notification.Entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Long> {

}
