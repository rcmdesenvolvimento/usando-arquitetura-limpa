package br.com.rcm.usecase;

import br.com.rcm.sistemas.core.domain.Wallet;
import br.com.rcm.sistemas.core.exception.NotFoundException;

public interface FindWalletByTaxNumberUseCase {
    Wallet findByTaxNumber(String TaxNumber) throws NotFoundException;
}
