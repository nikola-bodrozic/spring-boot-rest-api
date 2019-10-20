# Todo App with Spring REST & MySQL

## Install

`docker-compose up`

## Test

Add Todo

```sh
curl -X POST \
  http://localhost:8080/api/v1/todos \
  -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache,no-cache' \
  -d '[{"title":"hap","completed":false}]'
```

Get all Todos

```sh
curl -X GET http://localhost:8080/api/v1/todos
```