import cn.springmvc.controller.ViewController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class ControllerTest {
    @Test
    public void testHome() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new ViewController())
                .build();
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(view().name("index"));
    }
}
