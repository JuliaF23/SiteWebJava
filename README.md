# DramaWorld

DramaWorld é uma plataforma dedicada para fãs de doramas e filmes asiáticos,
oferecendo uma vasta seleção de títulos e entreterimento. O usuário poderá 
compartilhar suas opiniões através de comentários que fará com que outras pessoas possam ter uma base do que irão encontrar ao assistir o conteúdo escolhido.

## Funcionalidades
    - Lista de doramas e filmes japoneses e coreanos
    - Críticas dos usuários para os títulos
    disponíveis
    

## Endpoints

- Categorias
    - [Doramas Coreanos](#mostrar-doramascoreanos)
    - [Doramas Japoneses](#mostrar-doramasjaponeses)
    - [Filmes Coreanos](#mostrar-filmescoreanos)
    - [Filmes Japoneses](#mostrar-filmesjaponeses)
   

- Lançamentos

- DramaReview
    - [Doramas Coreanos](#criticas-doramascoreanos)
    - [Doramas Japoneses](#criticas-doramasjaponeses)
    - [Filmes Coreanos](#criticas-filmescoreanos)
    - [Filmes Japoneses](#criticas-filmesjaponeses)

- Autenticação
    - [Cadastro ](#Cadastro-dramaworld)
    - [Login ](#Login-dramaworld)
    - [Adicionar crítica ](#Adicionar-critica)

---

### Doramas Coreanos

`GET` /categoria/{doramascoreanos}

Retorna uma lista com todos os doramas coreanos
cadastrados

**Exemplo de Resposta** 

```js
[
    {
        "id": "doramascoreanos"
    }
]
```

**Exemplo de uso** 

Para obter a lista de doramas coreanos:

GET

http://localhost:8080/doramascoreanos

---


### Doramas Japoneses

`GET` /categoria/{doramasjaponeses}

Retorna uma lista com todos os doramas japoneses
cadastrados na plataforma.

**Exemplo de Resposta** 

```js
[
    {
        "id": "doramasjaponeses"
    }
]
```

**Exemplo de uso** 

Para obter a lista de doramas coreanos:

GET

http://localhost:8080/doramasjaponeses

___


### Filmes Coreanos

`GET` /categoria / filmescoreanos

Mostra todos os filmes coreanos cadastrados na plataforma. 


**Exemplo de Resposta** 

```js
[
    {
        "id": "filmescoreanos"
    }
]
```

**Exemplo de uso** 

Para obter a lista de filmes coreanos:

GET

http://localhost:8080/filmescoreanos

---

### Filmes Coreanos

`GET` /categoria / filmescoreanos

Mostra todos os filmes coreanos cadastrados na plataforma. 


**Exemplo de Resposta** 

```js
[
    {
        "id": "filmes japoneses"
    }
]
```

**Exemplo de uso** 

Para obter a lista de filmes japoneses:

GET

http://localhost:8080/filmesjaponeses
___

## DramaReview

Verificar as críticas relacionadas aos conteúdos da plataforma

### Doramas Coreanos

Ver uma crítica a um dorama coreano:

POST 

http//:localhost:8080/filmescoreanos/nomedofilme/criticas

### Doramas Japoneses

Ver uma crítica a um dorama japonês:

POST 

http//:localhost:8080/filmesjaponeses/nomedofilme/criticas

### Filme Coreanos

Ver uma crítica a um Filme coreano:

POST 

http//:localhost:8080/filmescoreanos/nomedofilme/criticas

### Filmes Japoneses

Ver uma crítica a um dorama japonês:

POST 

http//:localhost:8080/filmesjaponeses/nomedofilme/criticas

### Autenticação:

Para dar opniões nos conteúdos do site, o usuário precisará de um login para isso. Para obter o login é necessário fazer um cadastro.

## Exemplo de uso para obter uma conta:

 **Obter uma conta**: Caso você ainda não tenha uma conta no DramaWorld, registre-se aqui:

POST 

http://localhost:8080/cadastrousuario

 {
    "nome completo": "seu_nome_completo",
    "seu email": "seu_email_pessoal",
    "seu nome de usuario": "nome_usuario"
    "crie uma senha": "senha_usuario"   
 }


## Exemplo de uso para fazer o login:

 **Fazer login**: Faça login para escrever a sua opinião sobre o dorama ou filme que assistiu.

POST 

http://localhost:8080/loginusuario

 {
    "nome do usuario": "nome_usuario"
    "digite sua senha": "senha_usuario"   
 }


 ## Exemplo de uso para adicionar uma crítica:

 **Fazer crítica**: Agora que você está logado, veja um exemplo de como adicionar uma crítica a algum dos conteúdos do site:

POST 

http://localhost:8080/loginusuario/adicionarcritica

 {
    "usuario": "nome_usuario"
    "titulo do conteudo": "nome_conteudo"
    "critica": "Amei o desenvolvimento dos personagens, porém esperava mais do final do dorama."
 }




