package br.com.rcm.usecase;

import br.com.rcm.sistemas.core.domain.Transaction;

public interface UserNotificationUseCase {
    Boolean notificate(Transaction transaction, String email);
}
