/* 
package com.example.tdd_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting("Hello, " + name + "!");
    }


    
}*/

package com.example.tdd_practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testDefaultGreeting() throws Exception {
        MvcResult result = mockMvc.perform(get("/greeting").accept(MediaType.APPLICATION_JSON))
                                  .andReturn();

        assertEquals(200, result.getResponse().getStatus(), "Validate status 200");
        assertTrue(result.getResponse().getContentAsString().contains("Hello, World!"));
    }

    @Test
    public void testGreetingWithName() throws Exception {
        MvcResult result = mockMvc.perform(get("/greeting?name=Ana").accept(MediaType.APPLICATION_JSON))
                                  .andReturn();

        assertEquals(200, result.getResponse().getStatus(), "Validate status 200");
        assertTrue(result.getResponse().getContentAsString().contains("Hello, Ana!"));
    }
}


