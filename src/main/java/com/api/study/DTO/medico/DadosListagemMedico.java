package com.api.study.DTO.medico;

import com.api.study.DTO.Especialidade;
import com.api.study.entity.Medico;

public record DadosListagemMedico(Long id, String nome, String email, String CRM, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
