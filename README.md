# hackaday-backend-service
Hackaday Manchester Digital Bootcamp

## Mailhog Docker container 

docker pull mailhog/mailhog

docker run --restart unless-stopped --name mailhog -p 1025:1025 -p 8025:8025 -d mailhog/mailhog

Access the email box:

http://localhost:8025/

Hit the endpoint to send email with last 10 food alerts:

http://localhost:8080/api/sendEmail?email={email of the sender}
