package com.ssg.lecture.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value=AuditingEntityListener.class)
@Getter
//리스너 : 엔티티가 데이터베이스에 추가되거나 변경될 때 자동으로 현재 시간 값을 불러와 지정함 = Observer 와 동일
//main 메소드 클래스에 @EnableJpaAuditing 추가함으로써 리스너가 작동하도록 설정한다
abstract class BaseEntity {
    //상속을 위한 공통 메소드를 가지고 있는 추상 클래스

    @CreatedDate
    @Column(name="regidate" , update=false)
    private LocalDateTime regiDate; //작성 시간 자동 저장

    @LastModifiedDate
    @Column(name="moddate")
    private LocalDateTime modDate; //수정 시간을 자동 저장
}
