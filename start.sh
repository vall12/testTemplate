docker build -t dictionaries-img .
docker stop dictionaries-demo || true && docker rm dictionaries-demo || true
docker run -p 8080:8080 --name dictionaries-demo dictionaries-img