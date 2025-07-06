
public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "080-1111-1111";
		taro.address = "taro@gmail.com";
		
		Person ziro = new Person();
		ziro.name = "木村次郎";
		ziro.age = 18;
		ziro.phoneNumber = "090-2222-2222";
		ziro.address = "ziro@icloud.com";
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "070-3333-3333";
		hanako.address = "hanako@yahoo.co.jp";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.phoneNumber);
		System.out.println(ziro.address);
		ziro.talk();
		ziro.walk();
		ziro.run();
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
	}
}
