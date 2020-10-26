package com.example.calc.ControllerTest;

import javax.ws.rs.core.MediaType;

import com.example.calc.Controller.OperationController;
import com.example.calc.Services.OperationService;
import com.example.calc.dto.EquationDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;




@ExtendWith(SpringExtension.class)
@ActiveProfiles("Teste")
@WebMvcTest(controllers = OperationController.class)
@AutoConfigureMockMvc
public class OperationControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean   
    OperationService service;
    /*
    @Autowired
    WebApplicationContext wac;

    @BeforeEach
    public void before(){
        MockitoAnnotations.initMocks(this);
        this.mvc = MockMvcBuilders.webAppContextSetup(this.wac).dispatchOptions(true).build();
    }
    */ 

    @Test
    public void deveSomar()throws Exception{
        EquationDTO dto = EquationDTO.builder().x(12).y(15).build();
        String result = "27";

        Mockito.when(service.soma(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(result);

        String json = new ObjectMapper().writeValueAsString(dto);
        
        //Construindo a chamada da requisição
        MockHttpServletRequestBuilder request = 
                        MockMvcRequestBuilders.post("/calc/soma")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json);

        //Realizando a chamada de fato
        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void deveSubtrair()throws Exception{
        EquationDTO dto = EquationDTO.builder().x(15).y(12).build();
        String result = "3";

        Mockito.when(service.subtrai(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(result);

        String json = new ObjectMapper().writeValueAsString(dto);
        
        //Construindo a chamada da requisição
        MockHttpServletRequestBuilder request = 
                        MockMvcRequestBuilders.post("/calc/subtrai")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json);

        //Realizando a chamada de fato
        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void deveMultiplicar()throws Exception{
        EquationDTO dto = EquationDTO.builder().x(10).y(10).build();
        String result = "100";

        Mockito.when(service.multiplica(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(result);

        String json = new ObjectMapper().writeValueAsString(dto);
        
        //Construindo a chamada da requisição
        MockHttpServletRequestBuilder request = 
                        MockMvcRequestBuilders.post("/calc/multiplica")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json);

        //Realizando a chamada de fato
        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void deveDividir()throws Exception{
        EquationDTO dto = EquationDTO.builder().x(10).y(2).build();
        String result = "5";

        Mockito.when(service.divide(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(result);

        String json = new ObjectMapper().writeValueAsString(dto);
        
        //Construindo a chamada da requisição
        MockHttpServletRequestBuilder request = 
                        MockMvcRequestBuilders.post("/calc/divide")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json);

        //Realizando a chamada de fato
        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void deveFazerPotencia()throws Exception{
        EquationDTO dto = EquationDTO.builder().x(5).y(2).build();
        String result = "25";

        Mockito.when(service.potencia(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(result);

        String json = new ObjectMapper().writeValueAsString(dto);
        
        //Construindo a chamada da requisição
        MockHttpServletRequestBuilder request = 
                        MockMvcRequestBuilders.post("/calc/potencia")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json);

        //Realizando a chamada de fato
        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
