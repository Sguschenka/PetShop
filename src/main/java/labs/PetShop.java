package labs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PetShop {
    private static ConfigurableApplicationContext ctx;
    public static void main(String[] Args){
        ctx = SpringApplication.run(PetShop.class);
   //     main();
    }

    public static void main(){
       ctx = SpringApplication.run(PetShop.class);
        System.out.println("Я запустился");
    }

     public static void stop(){
        ctx.stop();
     }
}
