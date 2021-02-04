//package com.example.jpa;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//class JpaApplicationTests {
//	@Autowired
//	MockMvc mockMvc;
//	
//	@Test
//	void add() throws Exception {
//		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
//		map.add("name", "이름");
//		map.add("email", "ho2ast@naver.com");
//		
//		MvcResult result = mockMvc.perform(post("/demo/add")
//			.params(map))
//			.andExpect(status().isOk())
//			.andDo(print())
//			.andReturn();
//
//		String content = result.getResponse().getContentAsString();
//		System.out.println(content);
//	}
//	
//	@Test
//	void all() throws Exception {
//		mockMvc.perform(get("/demo/all"))
//			.andDo(print());
//	}
//	
//	@Test
//	void delete() throws Exception {
//		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
//		map.add("id", "1");
//		
//		mockMvc.perform(post("/demo/delete")
//				.params(map))
//				.andDo(print());
//	}
//
//}
