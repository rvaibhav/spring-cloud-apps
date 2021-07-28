The project includes 3 services
1. spring-cloud-eureka (Eureka Service Registry)
2. Payment Service (Registered as a client in Eureka service registry. The service is called by shopping service via Service Registry)
2. shopping-service (Service to call the Payment Service via Service Discovery)

The applications contains skeleton code for Spring Eureka.

Important: In case you deploy your services inside kubernetes, this architecture will not be needed!