package com.ssg.lecture.service;

import com.ssg.lecture.dto.BoardDTO;
import com.ssg.lecture.repository.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


public interface BoardService {

    Long register(BoardDTO boardDTO);
    BoardDTO readOne(Long bno);
    void modify(BoardDTO boardDTO);
    void remove(Long bno);
}
