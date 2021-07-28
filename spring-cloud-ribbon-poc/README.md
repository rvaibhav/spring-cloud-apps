The application to load balance is under spring-cloud-chatbook

spring-cloud-ribbon is the actual load balancer.

Check for spring cloud and spring boot compatibility here.
https://spring.io/projects/spring-cloud#overview

Testing on local
1. Start spring-cloud-chatbook on 3 three different ports.
2. Start spring-cloud-ribbon on a different ports
3. Invoke localhost:<spring-cloud-ribbon-port>/invoke
4. Invoke Step 3 multiple times to check how chat application is load balanced