package com.springboot.sandbox.jpa.vo;

import javax.persistence.*;
import org.joda.time.LocalDateTime;

@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)//설정하지 않아도 기본적으로 Auto
    private Long id;

    //정말 필요한 경우 columnDefinition을 통해 varchar(500)등 컬럼을 설정할 수 있음
    @Column(nullable = false, unique = true)//기본적으로는 이렇게만
    private String username;

    //@Column 이 어노테이션이 생략되어있는거나 마찬가지다
    private String password;

    //JPA 2.2 이전에는 Date만 사용가능
    @Temporal(TemporalType.TIMESTAMP) //날짜 데이터와 같은 컬럼을 매핑 시킬때 사용
    private LocalDateTime created = new LocalDateTime();

    @Transient
    private boolean isDummy = false;

    @Embedded
    private Address address;

    //참고로 하위의 getter, setter가 없어도 DB로 부터의 데이터 바인딩은 가능하다
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
