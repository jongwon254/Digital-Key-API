![key](https://user-images.githubusercontent.com/36485235/171292141-430be0bc-69bc-47b7-bfcf-5d45f0b5f3e2.png)

# Digital Key API 🔑
Own REST API to enable a digital wallet with authentication for storing personal digital keys.

## Technologies
- Language: Java
- Built with the Spring Framework, MySQL, JPA, JWT, Apache Tomcat, and Postman
- Authentication with Spring Security (hashing with HS256 algorithm)
- Tested with Postman

## Functionality
- API has three end points for users to register/login and to retrieve the digital keys from their wallet
- Data is stored in a MySQL database with the hashed password 
- Examples of requests and responses are shown below
- API URL: **localhost:8080/**

1. Register (POST): **base_url/auth/register**
```JSON
{
  "email": "kie.scott@gmail.com",
  "password": "12345",
  "firstName": "Kie",
  "lastName": "Scott"
}

{
  "id": 1,
  "firstName": "Kie",
  "lastName": "Scott",
  "email": "kie.scott@gmail.com"
}
```

2. Login (POST): **base_url/auth/login**
```JSON
{
  "email": "kie.scott@gmail.com",
  "password": "12345"
}

{
  "token": "eyDijfD93.DKjd2..."
}
```

3. Keys (GET): **base_url/key** (with the authentication bearer token)
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
<img width="800" alt="postman2" src="https://user-images.githubusercontent.com/36485235/171293629-15126dc1-31f6-430b-ba2d-39863ff1dd5a.png">
<img width="800" alt="postman" src="https://user-images.githubusercontent.com/36485235/171293623-ba7d8f5b-36ef-4818-8493-31c76d2135fe.png">
<img width="800" alt="postman3" src="https://user-images.githubusercontent.com/36485235/171293632-34b5d2dd-4e9e-4b2a-a00b-edfd491996ff.png">


## More Info
[Visit App Demo](https://appetize.io/embed/yhwyqe0pxe073nym7fycqae6f8?device=pixel6&osVersion=12.0&scale=75)


[Visit My Website](https://jongwonlee.dev/digital-key-app)
