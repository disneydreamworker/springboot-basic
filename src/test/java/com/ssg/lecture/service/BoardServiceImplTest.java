package com.ssg.lecture.service;

import com.ssg.lecture.domain.Board;
import com.ssg.lecture.dto.BoardDTO;
import com.ssg.lecture.repository.BoardRepository;
import groovy.util.logging.Log4j2;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class BoardServiceImplTest {
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Test
    void register() {
        BoardServiceImpl boardService = new BoardServiceImpl(modelMapper, boardRepository);
        BoardDTO boardDTO = BoardDTO.builder()
                .title("테스트예요")
                .writer("나")
                .content("테스트예요")
                .build();
        boardService.register(boardDTO);
    }

    @Test
    void modify() {
        BoardServiceImpl boardService = new BoardServiceImpl(modelMapper, boardRepository);
        BoardDTO boardDTO = boardService.readOne(100L);
        boardDTO.setTitle("수정했어용");
        boardDTO.setContent("수정했어용");
        boardService.modify(boardDTO);
    }


}