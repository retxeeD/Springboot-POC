package com.api.study.DTO.paciente;

import com.api.study.DTO.Especialidade;
import com.api.study.entity.Paciente;

public record DadosListagemPaciente(Long id, String nome, String email, String documento, Especialidade EspecialidadeProcurada) {
    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getDocumento(), paciente.getEspecialidadeProcurada());
    }
}
