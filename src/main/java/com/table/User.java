package com.table;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import java.sql.Timestamp;


@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@Entity //Class User가 MySQL에 테이블이 생성됨
public class User {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 DB의 넘버링 전략을 따라감
    private int user_idx; //Auto-increment

    @Column(nullable = false, length = 20) // not null
    private String user_id;

    @Column(nullable = false, length = 50) //not null (비밀번호 암호화)
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

    @ColumnDefault("'user'")
    private String role;

    @CreationTimestamp //시간이 자동 입력
    private Timestamp createDate;



}
