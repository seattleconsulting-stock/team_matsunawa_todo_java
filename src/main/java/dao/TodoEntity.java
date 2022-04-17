package dao;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="todo")
public class TodoEntity {
    @Id
    //テーブルに対応する変数を作成
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="deadline")
    private LocalDate deadline;

    @Column(name="status")
    private boolean status;
    //時間を自動で入れてくれる
    @CreationTimestamp
    @Column(name="create_time")
    private LocalDateTime createTime;
    //時間を自動で入れてくれる
    @UpdateTimestamp
    @Column(name="update_time")
    private LocalDateTime updateTime;
}