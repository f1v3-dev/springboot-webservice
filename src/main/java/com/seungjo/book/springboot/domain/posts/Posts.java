package com.seungjo.book.springboot.domain.posts;

import com.seungjo.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = true)
    private String content;

    private String author;

    private String uuid;

    @Builder
    public Posts(String title, String content, String author, String uuid){
        this.title = title;
        this.content = content;
        this.author = author;
        this.uuid = uuid;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}