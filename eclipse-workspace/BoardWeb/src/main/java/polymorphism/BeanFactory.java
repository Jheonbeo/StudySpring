package polymorphism;
//���� �ε� ��� : Ŭ���̾�Ʈ�� ��û�� ���ؼ��� ��ü ����
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
