![key](https://user-images.githubusercontent.com/36485235/171292141-430be0bc-69bc-47b7-bfcf-5d45f0b5f3e2.png)

# Digital Key API 🔑
Own REST API to enable a secure digital wallet for storing personal digital keys.

## Technologies
- Language: Java
- Built with the Spring Framework, MySQL, JPA, JWT, Apache Tomcat, and Postman
- Authentication with Spring Security (hashing with HS256 algorithm)
- Tested with Postman

## Functionality
- API has three end points for users to register/login and to retrieve the digital keys from their wallet 
- Examples of requests and responses are shown below
- API URL: **localhost:8080/**

1. Register (POST): **localhost:8080/auth/register**
```JSON
{
  "email": "kie.scott@gmail.com",
  "password": "12345",
  "firstName": "Kie",
  "lastName": "Scott"
}

{
  "id": 1,
  "firstName:" "Kie",
  "lastName": "Scott",
  "email": "kie.scott@gmail.com"
}
```

2. Login (POST): **localhost:8080/auth/login**
```JSON
{
  "email": "kie.scott@gmail.com",
  "password": "12345"
}

{
  "token": "eyDijfD93.DKjd2..."
}
```

3. Keys (GET): **localhost:8080/key** (with the authentication bearer token)
```JSON
[
  {
    "id": 1,
    "firstName": "Kie",
    "lastName": "Scott",
    "carBrand": "BMW",
    "carModel": "iX"
  },
  {
    "id": 2,
    "firstName": "Kie",
    "lastName": "Scott",
    "carBrand": "Polestar",
    "carModel": "Polestar 2"
  }
]
```

## Screenshots
<img width="600" alt="postman" src="https://user-images.githubusercontent.com/36485235/171293623-ba7d8f5b-36ef-4818-8493-31c76d2135fe.png">
<img width="600" alt="postman2" src="https://user-images.githubusercontent.com/36485235/171293629-15126dc1-31f6-430b-ba2d-39863ff1dd5a.png">
<img width="600" alt="postman3" src="https://user-images.githubusercontent.com/36485235/171293632-34b5d2dd-4e9e-4b2a-a00b-edfd491996ff.png">


<img width="600" alt="intellij" src="https://user-images.githubusercontent.com/36485235/171293641-a4172c17-fe13-4321-b942-aadd2508d535.png">
<img width="600" alt="sql" src="https://user-images.githubusercontent.com/36485235/171293645-17ee50ae-9d26-47fd-b8bd-f9accb63bc93.png">
<img width="600" alt="xampp" src="https://user-images.githubusercontent.com/36485235/171293651-c7734a1e-264b-421d-b74e-2414e3145647.png">

## More Info
[Visit App Demo](https://appetize.io/embed/yhwyqe0pxe073nym7fycqae6f8?device=pixel6&osVersion=12.0&scale=75)


[Visit My Website](https://jongwonlee.dev/digital-key-app)
