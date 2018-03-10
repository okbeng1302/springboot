# springboot

## springboot war 包部署

1. pom.xml


		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>3.8.1</version>
			<scope>test</scope>
		</dependency>

		<!-- mongodb <dependency> <groupId>org.springframework.boot</groupId> <artifactId>spring-boot-starter-data-mongodb</artifactId> 
			</dependency> -->
		<!-- morphia mongodb -->
		<dependency>
			<groupId>org.mongodb.morphia</groupId>
			<artifactId>morphia</artifactId>
			<version>1.1.1</version>
		</dependency>

		<!-- 打包war包 -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
			<scope>provided</scope>
		</dependency>
		
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
		</dependency>
		<!-- end -->



2. 修改 App.java 主类

@SpringBootApplication
public class App extends SpringBootServletInitializer 
{
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	       return builder.sources(App.class);
	   }
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}

3. 进入项目路径 

	输入:mvn clean package spring-boot:repackage
	
4. 在 target 中找到 war 包，
	部署到tomcat中后，项目的路径开头名称就变为war包的名称，项目的基本url路径为：http://服务器地址:8080/restjpademo/
