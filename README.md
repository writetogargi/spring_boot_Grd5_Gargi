
  #########  Mysql 

  docker run -d --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=secret -e MYSQL_DATABASE=myschema mysql:5



  #### start a postgres instance
  docker run --name postgres-spring  -e POSTGRES_PASSWORD=password -d -p 5434:5432 postgres:alpine


