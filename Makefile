jar:
	mvn clean install -o

docker: jar
	sudo docker build -t gagarwal90/myapp:v1 .

8080-run: docker
	sudo docker run -p 8080:8080 gagarwal90/myapp:v1 "-Dserver.port=8080"

9000-run: docker
	sudo docker run -p 9000:9000 myorg/myapp  "-Dserver.port=9000"

8080-localhost-curl: 8080-run
	curl -X GET --header 'Accept: application/json' 'http://localhost:8080/v2/ping' -v

9000-localhost-curl: 9000-run
	curl -X GET --header 'Accept: application/json' 'http://localhost:9000/v2/ping' -v
