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
public class ClasseCnaeDto {

    private String id;
    private String descricao;
    private List<String> observacoes;
    private GrupoCnaeDto grupo;
}
