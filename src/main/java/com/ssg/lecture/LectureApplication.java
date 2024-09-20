package com.ssg.lecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //스레드는 변경을 감지해서 시간 데이터를 자동으로 업데이트 함
public class LectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(LectureApplication.class, args);
    }
}
