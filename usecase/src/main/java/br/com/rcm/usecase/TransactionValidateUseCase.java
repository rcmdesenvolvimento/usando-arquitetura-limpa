package br.com.rcm.usecase;

import br.com.rcm.sistemas.core.domain.Transaction;
import br.com.rcm.sistemas.core.exception.TransferException;

public interface TransactionValidateUseCase {
    Boolean validate(Transaction transaction) throws TransferException;
}
