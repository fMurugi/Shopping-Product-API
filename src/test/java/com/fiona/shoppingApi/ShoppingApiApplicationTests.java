package com.fiona.shoppingApi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.awt.*;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
class ShoppingApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	@Test
	public void getAllProducts() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/products")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}
	@Test
	public void getAProduct()throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/products/1")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}
	@Test
	public void createProduct()throws Exception{
		String productJson = "{\"name\":\"product1\",\"price\":\"90\"}";
		mockMvc.perform(post("/products")
				.contentType(MediaType.APPLICATION_JSON)
				.content(productJson))
				.andExpect(status().isOk())
				.andReturn();

	}
}
