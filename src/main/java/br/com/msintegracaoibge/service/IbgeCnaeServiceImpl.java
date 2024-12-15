package br.com.msintegracaoibge.service;

import br.com.msintegracaoibge.client.IbgeClient;
import br.com.msintegracaoibge.dto.ClasseCnaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IbgeCnaeServiceImpl implements CnaeValido {

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
