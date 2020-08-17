# hackaday-backend-service
Hackaday Manchester Digital Bootcamp

## Mailhog Docker container 

docker pull mailhog/mailhog

docker run --restart unless-stopped --name mailhog -p 1025:1025 -p 8025:8025 -d mailhog/mailhog
