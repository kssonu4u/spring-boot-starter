# hv-dem-avm-core-api

## 1. Mongo DB Setup 

### 1.1 Install MongoDB using below link(Ubuntu) and enable authentication :- 
https://websiteforstudents.com/install-mongodb-on-ubuntu-18-04-lts-beta-server/

Note :- Create a user root with pwd root while enabling authentication.

### 1.2 DB Setup 
Default db is test and for now we will use it.
Login to mongo console and run below commands:-
```
mongo -u root -p root --authenticationDatabase admin

use test;

db.createCollection("child_clip");

db.child_clip.insert({child_id:"1" });
```

## 2. Running the application
Run the application and hit http://localhost:8050/api/v1/clip.
