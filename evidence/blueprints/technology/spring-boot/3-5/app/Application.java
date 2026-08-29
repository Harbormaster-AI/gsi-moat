#header()
#set( $packageName = $aib.getRootPackageName() )
package ${packageName};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
#if( $aib.getParam( "spring.entity-store-type") == "mongodb" )
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
#else
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;	
#end##if( $aib.getParam( "spring.entity-store-type") == "mongodb" )
	
@SpringBootApplication
#if( $aib.getParam( "spring.entity-store-type") == "mongodb" )
@EnableMongoRepositories(basePackages = "${packageName}.repository")
#else
@EnableJpaRepositories(basePackages = "${packageName}.repository")
#end##if( $aib.getParam( "spring.entity-store-type") == "mongodb" )
public class Application {

    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);
    }
}