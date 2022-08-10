start:
	./mvnw spring-boot:run

build:
	./mvnw package

clean:
	./mvnw clean install

d-build:
	docker build -t springio/gs-spring-boot-docker .

d-start:
	docker run -p 8081:8080 -t -d --name spring-boot-app springio/gs-spring-boot-docker

d-rebuild:
	docker build  --no-cache -t springio/gs-spring-boot-docker .