package com.api.study.DTO.paciente;

import com.api.study.DTO.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente (
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco){
}
