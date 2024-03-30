package br.com.rcm.usecase;

import br.com.rcm.sistemas.core.domain.Wallet;

import java.math.BigDecimal;

public interface ConsultBalanceUseCase {
    BigDecimal consult(Wallet wallet);
}
