package com.agendador.notificacao.infrastructure.exceptions;

public class MessageSenderErrorExeption  extends RuntimeException{
    public MessageSenderErrorExeption(String mensagem){
        super(mensagem);
    }

    public MessageSenderErrorExeption(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
