1. Start the spring sleuth Project on port 8080
2. Start an open zipkin server
   docker run -d -p 9411:9411 openzipkin/zipkin
   
3. Open the zipkin UI on http://localhost:9411/zipkin/ and click on "Run Query"
You will get the recent API calls.
 