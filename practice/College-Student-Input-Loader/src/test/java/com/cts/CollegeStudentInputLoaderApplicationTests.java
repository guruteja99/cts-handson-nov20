package com.cts;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class CollegeStudentInputLoaderApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void gettingStudent() throws Exception {
		this.mockMvc.perform(get("/student")).andExpect(status().isOk());
	}

	@Test
	public void updatingStudent() throws Exception {
		this.mockMvc.perform(get("/student/{id}",1L)).andExpect(status().isOk());
		this.mockMvc.perform(get("/student/{id}",56478L)).andExpect(status().isNotFound());
	}
	
	@Test
	public void deletingStudent() throws Exception {
		this.mockMvc.perform(delete("/student/{id}",56478L)).andExpect(status().isNotFound());
	}
	
	@Test
	public void gettingTask() throws Exception {
		this.mockMvc.perform(get("/task")).andExpect(status().isOk());
	}

	@Test
	public void updatingTask() throws Exception {
		this.mockMvc.perform(get("/task/{id}",1L)).andExpect(status().isOk());
		this.mockMvc.perform(get("/task/{id}",56478L)).andExpect(status().isNotFound());
	}
	
	@Test
	public void deletingTask() throws Exception {
		this.mockMvc.perform(delete("/task/{id}",56478L)).andExpect(status().isNotFound());
	}

	
	
	
}
