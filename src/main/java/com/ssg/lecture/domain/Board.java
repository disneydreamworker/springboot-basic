package com.ssg.lecture.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Board extends BaseEntity{
    //GeneratedValue : 키 생성 전략, 데이터베이스에서 알아서 결정하도록 만듬. Identity는 auto-increment 로 auto-increment가 없는 Oracle에서는 다른 생성 타입을 사용해야 함.
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long bno;
    @Column(length=500,nullable=false)
    private String title;
    @Column(length=1000,nullable=false)
    private String content;
    @Column(length=10,nullable=false)
    private String writer;

    public void change(String title, String content) {
        this.title=title;
        this.content=content;
    }
}
