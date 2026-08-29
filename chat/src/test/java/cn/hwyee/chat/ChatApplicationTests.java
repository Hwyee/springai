package cn.hwyee.chat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;

@SpringBootTest
class ChatApplicationTests {

	public static void main(String[] args) {
		Function<Integer,Integer> f = x ->x*2;
		System.out.println(f.compose(f).apply(3));
	}

	@Test
	void contextLoads() {

	}

}
