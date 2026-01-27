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

<h2>🧩 Arquitetura do Projeto Agendador</h2>

<p>
  O <strong>Projeto Agendador</strong> é composto por <strong>4 microsserviços</strong>,
  que trabalham de forma integrada e devem ser iniciados em uma
  <strong>ordem específica</strong> para garantir o funcionamento correto do sistema.
</p>

<h3>📌 Ordem de Execução dos Microsserviços</h3>

<ol>
  <li>
    <strong>ms-projeto-agendador-usuario</strong><br>
    Microsserviço <strong>principal</strong> e <strong>obrigatório</strong>, responsável
    por autenticação, autorização e gestão de usuários.<br>
    <em>Deve estar em execução antes de todos os outros serviços.</em><br>
    🔗 Repositório:
    <a href="https://github.com/Paulo4526/ms-projeto-agendador-usuario" target="_blank">
      https://github.com/Paulo4526/ms-projeto-agendador-bff
    </a>
  </li>
  <br>

  <li>
    <strong>ms-projeto-agendador-tarefas</strong><br>
    Responsável pelo agendamento e gerenciamento de tarefas, consumindo
    autenticação do microsserviço de usuários.<br>
    🔗 Repositório:
    <a href="https://github.com/Paulo4526/ms-projeto-agendador-tarefas" target="_blank">
      https://github.com/Paulo4526/ms-projeto-agendador-tarefas
    </a>
  </li>
  <br>

  <li>
    <strong>ms-projeto-agendador-notificacao</strong><br>
    Microsserviço responsável pelo envio de notificações (e-mails),
    acionado a partir dos eventos de tarefas.
  </li>
  <br>

  <li>
    <strong>ms-projeto-agendador-bff</strong><br>
    Backend for Frontend responsável por centralizar, orquestrar e expor
    as APIs para o frontend, consumindo os demais microsserviços.<br>
    🔗 Repositório:
    <a href="https://github.com/Paulo4526/ms-projeto-agendador-bff" target="_blank">
      https://github.com/Paulo4526/ms-projeto-agendador-bff
    </a>
  </li>
</ol>

<p>
  ⚠️ <strong>Importante:</strong> A aplicação deve ser executada exatamente
  na ordem acima, pois cada microsserviço depende dos anteriores
  para autenticação, comunicação e processamento correto.
</p>
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
