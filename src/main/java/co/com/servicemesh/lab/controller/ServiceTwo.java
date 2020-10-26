package co.com.servicemesh.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceTwo {

  @Autowired RestTemplate restTemplate;

  @RequestMapping(
      value = "/servicetwo",
      method = {RequestMethod.GET},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public String helloServiceTwo() {
    String message = "";
    try {
      message = restTemplate.getForObject("http://service-mesh-lab-service-one:6001/serviceone", String.class);
    } catch (Exception e) {
      System.out.println("Exception " + e.getMessage());
    }
    return message;
  }

  @Bean
  public RestTemplate rest() {
    return new RestTemplate();
  }
}
