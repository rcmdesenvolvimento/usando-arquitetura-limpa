package br.com.rcm.usecase;

import br.com.rcm.sistemas.core.exception.AuthenticateException;

public interface UserAuthenticateUseCase {
    Boolean authenticate(String username, String password) throws AuthenticateException;
}
