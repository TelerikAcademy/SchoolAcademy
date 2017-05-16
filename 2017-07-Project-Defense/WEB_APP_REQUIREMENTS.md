# Course Project

## Project Description

Design and implement a **Standard Web application** using [Node.js](http://nodejs.org), [Express](expressjs.com) and [MongoDB](https://www.mongodb.com/).  

It can be a discussion forum, blog system, e-commerce site, online gaming site, social network, or any other web application by your choice.

The application should have a:

- **public part** (accessible without authentication)
- **private part** (available for registered users)

### Public Part

The **public part** of your projects should be **visible without authentication**.
This public part could be the application start page, application statistics, the user login and user registration forms, as well as the public data of the users, e.g. the blog posts in a blog system, the public offers in a bid system, the products in an e-commerce system, etc.

### Private Part (Registered users area)

**Registered users** should have personal area in the web application accessible after **successful login**.
This area could hold for example the user's profiles management functionality, the user's offers in a bid system, the user's posts in a blog system, the user's photos in a photo sharing system, the user's contacts in a social network, etc.

## Technical Requirements

Your Web application should use the following technologies, frameworks and development techniques:

### Application Back-end (Server)


- At least **5 different public dynamic web pages**
  - Using [Pug](https://pugjs.org/)
- At least **3 different private (authenticated) dynamic web pages**
  - Using [Pug](https://pugjs.org/)
- At least **5 different public RESTful routes** for AJAX
- At least **1 private (authenticated) route** for AJAX
- Use **Express** for the server
  - Use an **MV-*** pattern
- Use **MongoDB**
  - As data storage
  - Optionally, you may use **Mongoose** or any other ODM framework
- Create a data/service layer for accessing the database
- Use [Passport](http://passportjs.org/) - for managing **users**
  - Your registered users should have at least one of the two roles: **user**

### Application front-end (client)

- Use any framework of your choice for the front-end
  - Optional, not required
  - KendoUI, AngularJS, Angular 2, Knockout, Bootstrap, etc...
- implement responsive design
  - It may be based on **Bootstrap**, **Materialize** or any other UI framework
- Use at least **one AJAX form and/or WebSockets communication**
- Apply **error handling** and **data validation** to avoid crashes when invalid data is entered

##  General Requirements

- Use Git
  - Github, Gitlab, Bitbucket, or other
- Brief **documentation** of the project and the project architecture
  - As `README.md` file at the root of the github repository

### Optional Requirements

- Nice looking UI supporting of all modern and old Web browsers
- Good usability (easy to use UI)
- Record a short video showcasing your application
  - ~1-2 minutes, just show the interesting features
  - Do not record register/login functionality, this is not interesting...

### Deliverables

- Upload your application in the cloud
  - MS Azure, HerokuCloud, Amazon, all are fine
- Register your application at [Our Showcase System](http://best.telerikacademy.com)
  - Link to the live application
  - Link to the video
  - Link to the github repository
