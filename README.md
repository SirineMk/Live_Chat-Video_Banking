# Live Chat Banking
Live Chat Banking is a project for banks that integrates a live chat and video call service.
This project is composed by two parts:
	- Frontend: developed in Angular 7 + WebRTC (PeerJS) 
	- Backend: Spring Boot + MongoDB + Ejabberd Server (XMPP)
## Installation
Requirements:
	- Angular CLI
	- Ejabberd Server

First, clone this project and you need to change the following lines in **frontend/proxymBank/src/app/room/room.component.ts** by your own Ejabberd account:
```python
chatService.logIn({
        domain: 'localhost',
        uri: 'ws://admin@localhost:5280/ws',
        password: 'password',
        jid: 'admin@localhost',
    });
```
Go to **frontend/proxymBank** and do :
```bash
$ npm install
```
You need to import the database in MongoDB from **backend/chat\ database**.
Then run project at **backend/bank** using :
```bash
$ mvn spring-boot:run
```
You also need to run the PeerJS server in **frontend/proxymBank/node-modules/peer/bin/** using :
```bash
$ ./peerjs --port 9000 --key peerjs
```
Finally, run the angular project using:
```bash
$ ng serve --open
```
