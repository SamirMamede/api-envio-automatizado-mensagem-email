<div align="center"/div><a href="https://im.ge/i/r4kqNp"><img src="https://i.im.ge/2022/06/17/r4kqNp.md.png" alt="r4kqNp.md.png" border="0"></a></div>

# Yara - Message in a Bottle

## Deploy no heroku

link úteis da api no heroku:

- Cadastro usuário:

<a> https://api-yara-sendingemail.herokuapp.com/users </a>

- Cadastro mensagem:

<a> https://api-yara-sendingemail.herokuapp.com/message </a>

## Como usar ?

- Descrição no ReadMe

##

## Sobre API Yara - Message in a Bottle

-   Yara é uma aplicação que permite o envio de e-mails automatizados com mensagens pré-formatadas (ou não) a usuários cadastrados em um banco de dados;

-   Com o programa é possível criar, buscar, deletar e fazer update do cadastro de usuários, associando-os a endereços eletrônicos e um id;

-   Há também um repositório de mensagens que recebe temas e textos pré-definidos, onde também é possível gerenciar de forma constante, fazendo busca por assuntos e registro;

-   Utilizando uma ferramenta auxiliar (Postman), é possível confirmar o envio, retornando data e horário.


# Criado por

- Anuar Samir Mamede
- Allan Arruda
- Fábio Clericuzi 
- Túlio Albuquerque 

## Mentoria:
- Rui Arthur Nunes
- Samuel França

Trabalho de conclusão do curso NExT - Nova Experiência de Trabalho;
Sem fins comerciais;

## O que você vai precisar 

* [OpenJDK 17.0.2+](https://jdk.java.net/archive/);
* [Maven 4.0+](https://maven.apache.org/download.cgi);
* Você pode copiar o código direto para sua IDE. Nós usamos o [VS Code](https://code.visualstudio.com/);
* Uma ferramenta para fazer REST requests. Recomendamos o [Postman](https://www.postman.com/downloads/);
* [Spring Boot 2.7.0+](https://spring.io/projects/spring-boot);
* [MySQL Connector](https://www.mysql.com/).

## CRUD de Usuários

Primeiro, você terá que ir em Aplication Properties e atualizar os dados de username e senha, considerando seu banco de dados local e o endereço que enviará as mensagens pré-formatadas; 

Depois de rodar a aplicação e com o banco de dados sincronizado na sua máquina, você precisará de uma ferramenta para fazer REST Requests. Todos os testes de funcionalidade do CRUD e do envio de e-mail deste projeto foram feitos usando o Postman.

O banco de dados recebe informações sobre usuários, com os parâmetros "nameUser" e "emailUser".

[http://localhost:8080/users](http://localhost:8080/users)
Usando essa URL request no Postman, você pode utilizar os seguintes métodos:
POST, para cadastrar usuários (recomendamos não colocar espaços em branco); 
GET, para listar todos usuários cadastrados; 

[http://localhost:8080/users/id](http://localhost:8080/users/id)
Colocando o número do ID do usuário no lugar do "id", você pode usar os seguintes métodos: 
GET, para buscar o usuário por ID;
DELETE, para apagar o usuário identificado pelo ID; 
PUT, para atualizar dados do usuário identificado pelo ID. 

exemplo: [http://localhost:8080/users/12](http://localhost:8080/users/12)

## CRUD de Mensagens

Há também uma forma de adicionar mensagens pré-formatadas na tabela, com os parâmetros "messageSubject" e "messageText".

[http://localhost:8080/message](http://localhost:8080/message)
Usando essa URL request no Postman, você pode utilizar os seguintes métodos:
POST, para cadastrar mensagens; 
GET, para listar todas mensagens cadastradas; 

[http://localhost:8080/message/id](http://localhost:8080/users/id)
Colocando o número do ID do usuário depois do "id", você pode usar os seguintes métodos: 
GET, para buscar a mensagem por ID;
DELETE, para apagar a mensagem identificado pelo ID; 
PUT, para atualizar dados da mensagem identificado pelo ID. 


## Enviando e-mails
 
Para enviar e-mails utilizando a tabela de usuários, você deve seguir o seguintes modelos: 

[http://localhost:8080/sending-email/nameUser](http://localhost:8080/sending-email/nameUser)
Para mandar o e-mail para um usuário cadastrado no banco de dados, troque "nameUser" pelo nome do usuário que você quer enviar. 

Exemplo: sending-email/AllanArruda

No corpo do email, você deve preencher os seguintes campos: 

- ownerRef;

- emailFrom; 

- subject;

- text;


Para enviar e-mail usando mensagens pré-cadastradas para usuários cadastrados, utilize a seguinte URL: 
[http://localhost:8080/sending-email/nameUser/messageSubject](http://localhost:8080/sending-email/nameUser/messageSubject)

No campo "nameUser" será passado o nome conforme foi cadastrado, sem espaço, e no "messageSubject" será passado o assunto da mensagem de e-mail também conforme cadastrado no banco de dados: 

exemplo: [http://localhost:8080/sending-email/TulioAlbu/Aniversario](http://localhost:8080/sending-email/TulioAlbu/Aniversario)

## Nossos contatos: 

Anuar Samir Mamede:  <div>
[Github](https://github.com/SamirMamede) <div>
[Linkedin](https://www.linkedin.com/in/anuar-samir-farias-mamede-2ba299224/)

Allan Arruda:  <div>
[Github](https://github.com/allann15) <div>
[Linkedin](https://www.linkedin.com/in/allan-jorge-arruda-85166018a/)
