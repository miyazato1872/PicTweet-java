package in.java.learning.pictweet;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TweetRepository {
    @Select("select * from tweets")
    List<TweetEntity> findAll();
}
