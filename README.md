# ScreenMatch
Projeto realizado durante a formação Java Web da Alura, com a proposta de criar uma aplicação web utilizando o Spring Boot e consumindo as APIs do OMDB e ChatGPT, para extrair e tratar dados de séries e depois exibir no front end.

<img src="https://private-user-images.githubusercontent.com/66698429/283485095-d1e7755b-0a61-411f-bb99-9fcfda44f00c.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDU1OTcwMDUsIm5iZiI6MTcwNTU5NjcwNSwicGF0aCI6Ii82NjY5ODQyOS8yODM0ODUwOTUtZDFlNzc1NWItMGE2MS00MTFmLWJiOTktOWZjZmRhNDRmMDBjLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTE4VDE2NTE0NVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTJhZTk2ZjZhYjA4MzgxNGM4YmJiMDM5MDY3ZmQ5ZDMyNjI3ZTIzYzhlYzE5ZDU4MDE1NTMzZmEwZTY4YjNmZTgmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.8z0VLLidg-StUq0SfQe8kcOtFMX1cDlVluw8iH4jvew">

<hr>

### Página do ScreenMatch
<img src="./github/index.png">
<img src="./github/descricao.png">

Front-End disponibilizado pela instrutora <br>
<a href="https://github.com/alura-cursos/3356-java-web-front">Layout</a>

<hr>

### Funcionalidades
1. Obter Todas as Séries
   Endpoint: /series/todas

Descrição: Retorna todas as séries cadastradas na plataforma.

2. Obter Top 5 Séries
   Endpoint: /series/top5

Descrição: Retorna as top 5 séries com base na avaliação.

3. Obter Lançamentos Mais Recentes
   Endpoint: /series/lancamentos

Descrição: Retorna as séries mais recentemente lançadas.

4. Obter Detalhes de uma Série por ID
   Endpoint: /series/{id}

Descrição: Retorna os detalhes de uma série específica com base no ID.

5. Obter Todas as Temporadas de uma Série
   Endpoint: /series/{id}/temporadas

Descrição: Retorna todos os episódios de todas as temporadas de uma série específica.

6. Obter Episódios de uma Temporada Específica
   Endpoint: /series/{id}/temporadas/{numero}

Descrição: Retorna os episódios de uma temporada específica de uma série.

7. Obter Séries por Categoria
   Endpoint: /series/categoria/{nomeGenero}

Descrição: Retorna as séries com base na categoria (gênero) especificada.

8. Obter Top Episódios de uma Série
   Endpoint: /series/{id}/topEpisodios

Descrição: Retorna os top episódios de uma série com base na avaliação.

<hr>

### Tecnologias e Dependências
* Java
* Spring Boot
* PostgreSQL
* Spring Data JPA
* Spring Web
* Jackson

### APIs 
* <a href="https://www.omdbapi.com">OMDB</a>
* <a href="https://platform.openai.com/overview">OpenAI API (ChatGPT)</a>


### Contribuições
* Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas, propor melhorias ou enviar solicitações de pull.
<hr>

[![Linkedin Badge](https://img.shields.io/badge/-JeanCarlo-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/jeancarlotorre619b/)](https://www.linkedin.com/in/jeancarlotorre619b/)

⭐️ Star o projeto

🐛 Encontrar e relatar issues