package ex01;

public class MonsterLapAppConnectTest {

	public static void main(String[] args) {
		try {
		    // Connection이 참조 타입이기때문에 대문자로 시작 
			// 여기서 타입 Connection이 등장한 이유는 변수 connection이 
			// 어떤 종류의 데이터를 담을 수 있는 그릇이다 라는 것을 먼저 붙여줘야하기때문
			// connection변수를 만들기 위해 앞에 타입을 붙여준것이다. 
			Connection connection = MonsterLabApp.getconnection();
		} catch {}
		

	}

}
