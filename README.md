Run the project:

mvn clean spring-boot:run
------------------------------------------------------

Mongo database inserts =>

db.poi.insertMany([{
  name:"Lanchonete",positionX:27,positionY:12
},
{
  name:"Posto",positionX:31,positionY:18
},
{
  name:"Joalheria",positionX:15,positionY:12
},
{
  name:"Floricultura",positionX:19,positionY:21
},
{
  name:"Pub",positionX:12,positionY:8
},
{
  name:"Supermercado",positionX:23,positionY:6
},
{
  name:"Churrascaria",positionX:28,positionY:2
}]);

------------------------------------------------------

Web service HTTP:

All data (GET) : /pois 

Create Pois (POST) : /pois ->Request({"name":"testName","positionX":"1","positionY":"1"}) 

Find data proximity (GET) : /pois/findByProximity?positionX=&positionY=&maxRange=
