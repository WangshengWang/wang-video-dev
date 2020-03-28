package com.wang.mapper;

import java.util.List;

import com.wang.pojo.SearchRecords;
import com.wang.utils.MyMapper;

public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
	
	public List<String> getHotwords();
}