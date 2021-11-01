package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
/*
 * Bootstrapping Class 역할
 * 1.스프링 부트 애플리케이션의 부트스트래핑(Bootstrapping )
 * 2.설정 클래스로 역할 = (Configuration Class) 
 */
@SpringBootApplication
public class HelloWorldApplication {
	public static void main(String[] args) {
		/*
		 * run이 실행되면 발생하는일
		 * 1.애플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 * 2.Web 애플리케이션 타입 (Web 애플리케이션인 경우 -> MVC or Reactive)
		 * 3.어노테이션(Component) 스캔(Auto) or Configutation클래스를 통한 빈생성 및 등록
		 * 4.Web 애플리케이션인 경우(MVC)
		 *   - 내장(라이브러리 / emebedded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성
		 *   - 서버 인스턴스에 Web 애플리케이션을 배포!!!
		 *   - 서버 인스턴스 실행~
		 * 5.인터페이스 ApplicationRunner 구현 빈의 run() 실행.
		 */
//		ConfigurableApplicationContext c = null;
//		try {
//			//springapplication 실행
//						
//		} catch (Throwable ex) {
//			// TODO: handle exception
//			ex.printStackTrace();
//		}finally {
//			c.close();
//		}
		
		//try~with~resource --> 자원정리 자동으로 해줌.
		try(
		ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args);
			){
			
		}

	}
}
