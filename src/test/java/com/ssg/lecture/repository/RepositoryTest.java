package com.ssg.lecture.repository;

import com.ssg.lecture.domain.Board;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class RepositoryTest {
    @Autowired
    private BoardRepository boardRepository;

    //save : 현재의 영속 컨텍스트 내에 데이터가 존재하는지 찾아보고 해당 엔티티 객체가 없을 때는 insert  , 존재할때는 update 를 자동으로 실행한다.
    @Test
    public void testInsert() {
        IntStream.rangeClosed(1,100).forEach(i -> {
            Board board = Board.builder()
                    .title("title.." + i)
                    .content("content..." + i)
                    .writer("user" + (i%10))
                    .build();
            Board result = boardRepository.save(board);
            log.info(result.getBno());
        });
    }
}
