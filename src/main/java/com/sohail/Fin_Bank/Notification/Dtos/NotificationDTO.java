package com.sohail.Fin_Bank.Notification.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sohail.Fin_Bank.Account.Entity.Account;
import com.sohail.Fin_Bank.Notification.Entity.Notification;
import com.sohail.Fin_Bank.enums.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationDTO {

    private Long id;
    private String subject;
    private String body;
    private NotificationType type;
    private LocalDateTime createdAt;

    private String templateName;
    private Map<String,Object> templateVariables;



}
