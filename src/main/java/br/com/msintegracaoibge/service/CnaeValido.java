package br.com.msintegracaoibge.service;

import br.com.msintegracaoibge.dto.ClasseCnaeDto;

public interface CnaeValido {

    ClasseCnaeDto consultarCnae(String cnae);
    void validarCodigo();
    void validarDescricao();
}
