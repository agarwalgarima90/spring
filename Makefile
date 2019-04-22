jar:
	mvn clean install -o

docker:
#	sudo docker build -t myorg/myapp .
	sudo docker build -t gagarwal90/myapp:v1 .

run:
#	sudo docker run -p 8080:8080 myorg/myapp
	sudo docker run -p 8080:8080 gagarwal90/myapp:v1

run2: docker
	sudo docker run -p 8080:8080 myorg/myapp  "-Dserver.port=9000"
#run2: docker
#	sudo docker run -p 8080:8080 myorg/myapp  "-Dserver.port=9000"


localhost-curl:
	curl -X GET --header 'Accept: application/json' 'http://localhost:9000/v2/ping' -v
