package br.com.msintegracaoibge.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SesaoCnaeDto {

    private String id;
    private String descricao;
    private List<String> observacoes;
}
