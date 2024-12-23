package br.com.msintegracaoibge.application;

import br.com.msintegracaoibge.infra.IbgeClient;
import br.com.msintegracaoibge.core.ClasseCnaeDto;
import br.com.msintegracaoibge.core.usecases.CnaeUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IbgeCnaeUseCaseImpl implements CnaeUseCase {

    @Autowired
    private IbgeClient ibgeClient;

    public ClasseCnaeDto consultarCnae(String classe) {
        return ibgeClient.consultarCnae(classe);
    }

    public void validarCodigo() {

    }


    public void validarDescricao() {

    }
}
