docker build -t helloplatform -f docker/Dockerfile .
docker stop helloplatform || true && docker rm helloplatform || true
docker run -p 8080:8080 --name helloplatform helloplatform
