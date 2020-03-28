package com.wang.mapper;

import java.util.List;

import com.wang.pojo.Comments;
import com.wang.pojo.vo.CommentsVO;
import com.wang.utils.MyMapper;

public interface CommentsMapperCustom extends MyMapper<Comments> {
	
	public List<CommentsVO> queryComments(String videoId);
}