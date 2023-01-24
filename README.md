# Projeto TweterooSpringAPI
Consiste em uma simples API que permite o registro de usuários e envio de tweets.

<p align="center">
  <img  src="https://notion-emojis.s3-us-west-2.amazonaws.com/prod/svg-twitter/1f424.svg" height="180px">
</p>
<h1 align="center">
  TweterooSpringAPI
</h1>
<div align="center">

  <h3>Built With</h3>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" height="30px"/>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" height="30px"/>  
</div>

# Description

Nesse desafio foi proposto a recriação da API do Tweetero, anteriormente desenvolvida com NodeJS e Express.js, utilizando Java e Spring.


## Features

-   Add user.
-   Add tweet.
-   Get tweet by username.
-   Get tweets by page.

</br>

### Add user

```
http://localhost:8080
POST /sign-up
```

#### Request:

| Body         | Type     | Description                  |
| :----------- | :------- | :--------------------------- |
| `username`   | `string` | **Required**. username       |
| `avatar`     | `string` | **Required**. user's avatar  |

####

#### Response:

```json
message: OK
status: 201
```

####

#

### Add tweet

```
http://localhost:8080
POST /tweets
```

#### Request:

| Body       | Type     | Description                 |
| :--------- | :------- | :-------------------------- |
| `username` | `string` | **Required**. username      |
| `avatar`   | `string` | **Required**. user's avatar |
| `text`     | `string` | **Required**. tweet's text  |

#### Response:

```json
message: OK
status: 200
```

### Get tweets

#### Request:

| Params  | Type     | Description              |
| :------ | :------- | :----------------------- |
| `page`  | `integer`| **Optional**. page number |

```
http://localhost:8080
GET /tweets?page
```

#### Response:

```json
[
  {
    "id" 1,
    "username": "Fulano",
    "avatar": "imageurl",
    "text": "random tweet"
  },
...
]
```

## Environment Variables

None were used

#

## Run Locally

Clone the project

```bash
  git clone https://github.com/FKnight-cyber/TweterooSpringAPI
```

Start the server

```bash
  run ApiApplication
```

#

## Authors

-   Ryan Nicholas a full-stack developer looking for new challenges!.
<br/>

#
