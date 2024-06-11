package com.example.frontend;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RequestSender {

    private RestTemplate restTemplate = new RestTemplate();

    //example on how to send a request to retrieve user
    //url is the port that the microservice requested is running on
    //(yes, the microservices needed need to be running in order to successfully submit a request)
    //the map stores all variables that need to be sent to a different microservice
    //Response entity is the request sent with all the objects needed, url: the link, String.class: the type being sent, and variables
    //this is only a request, ngl idk how to receive objects from that method, so we usually create a request in the other microservice to send the info needed
    public void getUser(int user_id){
        try {
            String url = "http://locahost:8002/getUser";
            Map<String, Object> uriVariable = new HashMap<>();

            uriVariable.put("user_id", user_id);

            ResponseEntity<String> response = restTemplate.postForEntity(url, null, String.class, uriVariable);
        } catch (RestClientException e) {
            throw new RuntimeException(e);
        }

    }
}
