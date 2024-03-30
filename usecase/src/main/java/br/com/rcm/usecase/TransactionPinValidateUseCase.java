package br.com.rcm.usecase;

import br.com.rcm.sistemas.core.domain.TransactionPin;
import br.com.rcm.sistemas.core.exception.PinException;
import br.com.rcm.sistemas.core.exception.TransferException;

public interface TransactionPinValidateUseCase {
    Boolean validate(TransactionPin transactionPin) throws TransferException, PinException;
}
