package br.com.rcm.usecase;

import br.com.rcm.sistemas.core.domain.User;
import br.com.rcm.sistemas.core.exception.EmailException;
import br.com.rcm.sistemas.core.exception.InternalServerErrorException;
import br.com.rcm.sistemas.core.exception.TaxNumberException;
import br.com.rcm.sistemas.core.exception.TransactionPinException;

public interface CreateUserUseCase {

    void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException, InternalServerErrorException;
}
