package com.agendador.notificacao.business;

import com.agendador.notificacao.controller.dto.TarefaDTO;
import com.agendador.notificacao.infrastructure.exceptions.MessageSenderErrorExeption;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

//Classe service para envio de e-mail
@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender javaMailSender;
    private final TemplateEngine templateEngine;

    @Value("${envio.email.remetente}")
    public String remetente;

    @Value("${envio.email.nomeRemetente}")
    public String nomeRementente;

    public void enviaEmail(TarefaDTO tarefaDTO){
        try{
            MimeMessage mensagem = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mensagem, true, StandardCharsets.UTF_8.name());

            //Setando quem irá enviar o e-mail
            mimeMessageHelper.setFrom(new InternetAddress(remetente, nomeRementente));
            //Informando o para qual e-mail será enviado
            mimeMessageHelper.setTo(InternetAddress.parse(tarefaDTO.getEmailUsuario()));
            //Setando o assunto do email
            mimeMessageHelper.setSubject("Notificação da tarefa: " + tarefaDTO.getNomeTarefa());
            //Setando nosso template, importanto a classe Context do Thymeleaf
            //OBS: Aula Pausada em 11:41
            Context context = new Context();
            //Setando no nosso notificacao.html em templates, nas variaveis setadas pelo time leaf, informando qual valor de variavel representa um atrivuto do nosso objeto
            //Informando que a nossa variavel nomeTarefa do template, recebe o valor do nomeTarefa da nossa entidade/objeto
            context.setVariable("nomeTarefa", tarefaDTO.getNomeTarefa());
            //Informando que a nossa variavel agendamento do template, recebe o valor do dataEvento da nossa entidade/objeto
            context.setVariable("agendamento", tarefaDTO.getDataEvento());
            //Informando que a nossa variavel descricao do template, recebe o valor do desricao da nossa entidade/objeto
            context.setVariable("descricao", tarefaDTO.getDescricao());
            //OBS: O NOSSO TEMPLATE NA PASTAS RESOURCES/TEMPLATES, CONTEM O NOSSO ARQUIVO HTML DE ONDE ESTAMOS TIRANDO AS VARIAVEIS CRIADAS COM O "THYMELEAFE"

            //Variavei que atribui as variaveis do context ao nosso arquivo na pasta template, sendo o notificacao.html
            //OBS: Não é preciso colocar o nome da extensão do arquivo sendo ele .html. py ou .java.
            String template = templateEngine.process("notificacao", context);

            //Utilizando o template já com suas variaveis que foram setadas acima, e salvando no mime do JavaMailSender
            mimeMessageHelper.setText(template, true);

            //Enviando email com o template já com o template, remetende, destinatário e assunto definidos.
            javaMailSender.send(mensagem);

        //Adicionando o Messagin Exception para caso de erro no envio da menssagem, obrigatório utilizando o mime do JavaMailSender
        } catch (MessagingException | UnsupportedEncodingException e) {
            //Exception personalizada para o erro de envio de mensagem pelo e-mail
            throw new MessageSenderErrorExeption("Erro ao enviar o email: " + e.getCause());
        }
    }

}
