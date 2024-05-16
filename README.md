# Chat-IA

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

## Uso

1. Inicie a aplicação com Maven
2. A API estará acessível em [http://localhost:8080](http://localhost:8080)
3. Instale o [LM Studio](https://lmstudio.ai/)
4. Baixe o modelo Google's Gemma 2B Instruct
5. Inicie o servidor LM

![LM Studio](/github/print-lmstudio.jpeg)

## Pontos de Extremidade da API
A API fornece os seguintes pontos de extremidade:

**OBTENHA USUÁRIOS**
```markdown
POST /api/chat - Obtenha uma lista de todos os usuários.
```json
{
  "message": "List 4 movies of the catalog that have Category Romance"
}
```
```json
{
  "response": "The movies that have Category Romance are: - La La Land - Titanic"
}
```

## Base de Conhecimento RAG
A base de conhecimento usada para obter contexto para a técnica RAG é o arquivo movies.txt localizado no caminho src/main/resources

```txt
Movie Catalog
---

Movie: The Godfather
Year: 1972
Director: Francis Ford Coppola
Actors: Marlon Brando, Al Pacino, James Caan
Category: Action
Synopsis: The saga of the Corleone family in the Italian mafia of New York.
---

Movie: Fight Club
Year: 1999
Director: David Fincher
Actors: Brad Pitt, Edward Norton, Helena Bonham Carter
Category: Action
Synopsis: A disillusioned white-collar worker forms an underground fight club.
---

Movie: Forrest Gump
Year: 1994
Director: Robert Zemeckis
Actors: Tom Hanks, Robin Wright, Gary Sinise
Category: Comedy
Synopsis: The story of a man with low IQ who witnessed or influenced significant events of the 20th century in America, maintaining hope and love for his childhood passion, Jenny.
---

Movie: Titanic
Year: 1997
Director: James Cameron
Actors: Leonardo DiCaprio, Kate Winslet, Billy Zane
Category: Romance
Synopsis: A poor artist and a rich young woman meet and fall in love on the fateful voyage of the RMS Titanic.
---

Movie: La La Land
Year: 2016
Director: Damien Chazelle
Actors: Ryan Gosling, Emma Stone, John Legend
Category: Romance
Synopsis: A jazz musician and an aspiring actress fall in love while pursuing their dreams in a city known for crushing hopes and breaking hearts.
---

```
