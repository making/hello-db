package com.example;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {

  @Select("SELECT id, text FROM messages ORDER BY id")
  List<Message> findAll();

  @Insert("INSERT INTO messages(text) VALUES(#{text})")
  int create(Message message); 
}
