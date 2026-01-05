<h1 align="center">📧 ms-projeto-agendador-notificacao</h1>

<p align="center">
  <strong>Microserviço de envio de notificações por e-mail</strong><br>
  Parte integrante do <strong>Projeto Agendador</strong>
</p>

<p align="center">
  Java • Spring Boot • Spring Mail • Thymeleaf • Microsserviços • Docker • CI/CD
</p>

<hr>

<h2>📌 Sobre o Microserviço</h2>

<p>
  O <strong>ms-projeto-agendador-notificacao</strong> é o
  <strong>terceiro microsserviço</strong> do <strong>Projeto Agendador</strong>,
  responsável pelo <strong>envio de notificações por e-mail</strong>.
</p>

<p>
  Ele recebe informações de tarefas agendadas, processa o conteúdo da
  notificação e realiza o envio de e-mails utilizando
  <strong>templates HTML dinâmicos</strong>.
</p>

<p>
  ⚠️ Este microsserviço depende indiretamente do
  <strong>ms-projeto-agendador-usuario</strong> (autenticação)
  e é acionado pelo <strong>ms-projeto-agendador-tarefas</strong>.
</p>

<hr>

<h2>🧩 Papel na Arquitetura</h2>

<p>
  No ecossistema do <strong>Projeto Agendador</strong>, este microsserviço
  se integra da seguinte forma:
</p>

<ul>
  <li>
    <strong>1️⃣ ms-projeto-agendador-usuario</strong> – Serviço central de autenticação<br>
    🔗
    <a href="https://github.com/Paulo4526/ms-projeto-agendador-usuario" target="_blank">
      https://github.com/Paulo4526/ms-projeto-agendador-usuario
    </a>
  </li>

  <li>
    <strong>2️⃣ ms-projeto-agendador-tarefas</strong> – Disparo de notificações a partir das tarefas<br>
    🔗
    <a href="https://github.com/Paulo4526/ms-projeto-agendador-tarefas" target="_blank">
      https://github.com/Paulo4526/ms-projeto-agendador-tarefas
    </a>
  </li>

  <li>
    <strong>4️⃣ ms-projeto-agendador-bff</strong> – Orquestração e exposição das APIs<br>
    🔗
    <a href="https://github.com/Paulo4526/ms-projeto-agendador-bff" target="_blank">
      https://github.com/Paulo4526/ms-projeto-agendador-bff
    </a>
  </li>
</ul>

<hr>

<h2>🚀 Tecnologias Utilizadas</h2>

<h3>🧠 Linguagem & Framework</h3>
<ul>
  <li><strong>Java 21</strong></li>
  <li><strong>Spring Boot</strong></li>
  <li>Spring Web</li>
  <li>Spring Mail</li>
</ul>

<h3>🎨 Template & Notificação</h3>
<ul>
  <li>Thymeleaf</li>
  <li>JavaMailSender</li>
  <li>SMTP (TLS / SSL)</li>
</ul>

<h3>🛠 Build & Infraestrutura</h3>
<ul>
  <li>Gradle</li>
  <li>Docker</li>
  <li>Docker Compose</li>
  <li>GitHub Actions (CI)</li>
</ul>

<hr>

<h2>🐳 Execução com Docker</h2>

<h3>📦 Criar a imagem Docker</h3>

<pre><code>docker build -t ms-projeto-agendador-notificacao .</code></pre>

<h3>🚀 Subir a aplicação com Docker Compose</h3>

<pre><code>docker compose build api .</code></pre>
<pre><code>docker compose up -d</code></pre>

<p>
  ⚠️ Certifique-se de que os microsserviços
  <strong>ms-projeto-agendador-usuario</strong> e
  <strong>ms-projeto-agendador-tarefas</strong>
  já estejam em execução antes de iniciar este serviço.
</p>

<hr>

<h2>🏗️ Conceitos Arquiteturais</h2>

<ul>
  <li>Arquitetura de <strong>Microsserviços</strong></li>
  <li>Separação de responsabilidades (Controller, Service, Infrastructure)</li>
  <li>DTO para transporte de dados</li>
  <li>Injeção de Dependência (IoC / DI)</li>
  <li>Templates HTML dinâmicos</li>
  <li>Tratamento centralizado de exceções</li>
  <li>Configuração por variáveis de ambiente</li>
  <li>CI/CD e automação de build</li>
  <li>Containerização</li>
</ul>

<hr>

<h2>📦 Benefícios da Solução</h2>

<ul>
  <li>Isolamento da responsabilidade de envio de notificações</li>
  <li>Facilidade de manutenção e evolução</li>
  <li>Escalabilidade independente</li>
  <li>Integração simples com outros microsserviços</li>
  <li>Preparado para ambientes cloud</li>
</ul>

<hr>

<p align="center">
  <strong>Projeto Agendador</strong><br>
  Microsserviços • Java • Spring Boot
</p>

<p align="center">
  Desenvolvido por <strong>Paulo Bueno</strong>
</p>
