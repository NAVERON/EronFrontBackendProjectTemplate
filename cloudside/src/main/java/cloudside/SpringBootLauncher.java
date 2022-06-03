package cloudside;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import model.ModelHolder;

@SpringBootApplication 
public class SpringBootLauncher {

    public static void main(String[] args) {
        ModelHolder model = new ModelHolder();  // 占位测试子项目引用 
        
        System.out.println("SpringBootLauncher Cloud Service ...");
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootLauncher.class);
        builder.run(args);
    }
    
    
}



