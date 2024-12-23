package br.com.msintegracaoibge.core.usecases;

import br.com.msintegracaoibge.core.ClasseCnaeDto;

public interface CnaeUseCase {

    ClasseCnaeDto consultarCnae(String cnae);
    void validarCodigo();
    void validarDescricao();
}
