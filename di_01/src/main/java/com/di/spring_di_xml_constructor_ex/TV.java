package com.di.spring_di_xml_constructor_ex;

public class TV {
	Speaker speaker;
	
	// 생성자를 통해 Speaker 객체 주입
	// 나(TV)를 만들 때(생성자)
	// 밖에서 쓸만한 스피커 하나만 나한테 줘(this.speaker = speaker)
	// 그래야 내가 나중에 소리를 낼 수 있어
	public TV(Speaker speaker) {
		this.speaker = speaker;
		// 밖에서 넣어준 그 스피커를 TV 내부의 speaker라는 변수에 저장해두고 계속 쓰겠다는 뜻
	}

	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
