# GamesLibrary - crud restful api
This project is a RESTful API for creating, reading, updating, and deleting information about video games in a database. It was created using Spring Boot, Spring Security, JWT, PostgreSQL, JPA, and Hibernate.

## Technologies and tools
- Java
- Spring
- JPA
- PostgreSQL

## Functionalities
- create, edit, update and delete games in database
- register and login to the account using JWT
- search games according to its ID

## REST API endpoints
- GET /api/games - gets a list of all games
- GET /api/games/id - gets a specific game
- POST /api/games/saveGame - saves a new game in database
- POST /api/games/saveGames - saves new games in database
- PUT /api/games/id - updates specific game
- DELETE /api/games/id - deletes a specific game
- POST /auth/register - create a new account
- POST /auth/login - log in to account
- POST /auth/refresh - creates new token
- GET /api/users - get list of all users

## Contact
Created by [lukasz.pisarczyk02@gmail.com](mailto:lukasz.pisarczyk02@gmail.com) - feel free to contact me!
