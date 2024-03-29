![key](https://user-images.githubusercontent.com/36485235/185005357-4b29f5bf-870b-4fea-b787-3ff416ff2e9f.png)

# Digital Key API
Own REST API to enable a [Digital Wallet App](https://github.com/jongwon254/DigitalKeyWallet-App) with authentication for storing personal digital keys.

## Technologies
- Language: Java
- Backend: 
  - REST API built with Spring Boot and MySQL Database
  - Authentication with Spring Security and JWT (Password HS256 Hashing) 
  - Deployed with Docker on Azure Cloud Kubernetes Cluster
- Frontend: 
  - Designed with Figma
  - Built with XML in Android Studio

## Functionality
- REST API has three end points for users to register/login and to retrieve the digital keys from their wallet
- Data is stored in a MySQL database with the hashed password 
- Examples of requests and responses are shown below

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
<img width="800" alt="azure" src="https://user-images.githubusercontent.com/36485235/185004568-17dc6843-60e3-4132-8d96-f7dd4c0089eb.png">

## More Info
[Visit Website](https://jongwonlee.dev/digital-key-app)
