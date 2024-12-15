package br.com.msintegracaoibge.resource;

import br.com.msintegracaoibge.dto.ClasseCnaeDto;
import br.com.msintegracaoibge.service.IbgeCnaeServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value = "/cnae")
public class CnaeResource {

    @Autowired
    private IbgeCnaeServiceImpl ibgeCnaeServiceImpl;

    @GetMapping("/{codigoCnae}")
    @Operation(summary = "Realiaza a busca do cnae.", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Cnae retornado com sucesso."),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos."),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar a busca do produto.")
    })
    public ResponseEntity<ClasseCnaeDto> consultarCnae(@PathVariable String codigoCnae) {
        return ResponseEntity.status(HttpStatus.OK).body(ibgeCnaeServiceImpl.consultarCnae(codigoCnae));
    }
}
