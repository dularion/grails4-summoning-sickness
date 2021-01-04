# grails4-summoning-sickness
Sample project to reproduce slow controller initialization with vanilla grails applikation. 


run:
```
./gradlw assemble
 java -jar build/libs/grails4_summoning_sickness-0.1.war  

visit: http://localhost:8080/test/index
```


First load: 
![First](https://github.com/dularion/grails4-summoning-sickness/blob/master/first_time.png)

Second load: 
![Second](https://github.com/dularion/grails4-summoning-sickness/blob/master/second_time.png)

