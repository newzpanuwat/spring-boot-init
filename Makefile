run:
	./mvnw spring-boot:run

package:
	./mvnw package

clean:
	./mvnw clean install

build:
	docker build -t demo-spring .

stop:
	docker rm -f next-container spring-boot-app

start:
	docker run -p 8081:8080 -t -d --name spring-boot-app demo-spring

rebuild:
	docker build  --no-cache -t demo-spring .