run:
	./mvnw spring-boot:run

build-spring:
	./mvnw package

clean:
	./mvnw clean install

build:
	docker build -t springio/gs-spring-boot-docker .

start:
	docker run -p 8081:8080 -t -d --name spring-boot-app springio/gs-spring-boot-docker

rebuild:
	docker build  --no-cache -t springio/gs-spring-boot-docker .