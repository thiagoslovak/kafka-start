package br.com.msintegracaoibge.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GrupoCnaeDto {

    private String id;
    private String descricao;
    private List<String> observacoes;
    private DivisaoCnaeDto divisao;
}