package com.agendador.notificacao.controller;

import com.agendador.notificacao.business.EmailService;
import com.agendador.notificacao.controller.dto.TarefaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {
    private final EmailService emailService;

    @PostMapping
    ResponseEntity<Void> enviarEmail(@RequestBody TarefaDTO tarefaDTO){
        emailService.enviaEmail(tarefaDTO);
        return ResponseEntity.ok().build();
    }
}
