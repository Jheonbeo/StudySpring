package polymorphism;
//지연 로딩 방식 : 클라이언트의 요청에 의해서만 객체 생성
public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}
		else if(beanName.equals("lg")){
			return new LgTV();
		}
		return null;
	}
}
