package miu.edu.finalexam.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import miu.edu.finalexam.model.Customer;
import miu.edu.finalexam.service.impl.CustomerServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CustomerController.class)
class CustomerControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CustomerServiceImpl customerServiceImpl;


    @Test
    void findById() throws Exception {
        Long customerId = 1L;

        when(customerServiceImpl.findById(customerId)).thenReturn(Optional.of(new Customer()));

        mockMvc.perform(get("/customers/"+customerId))
                .andExpect(status().isOk());
    }
}