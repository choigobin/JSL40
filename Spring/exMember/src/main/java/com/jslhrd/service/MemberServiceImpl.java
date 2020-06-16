package com.jslhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jslhrd.domain.MemberVO;
import com.jslhrd.mapper.MemberMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {
	// 주입요청
	@Setter(onMethod_=@Autowired)
	private MemberMapper mapper;
	
	@Override
	public List<MemberVO> memList() {
		return mapper.memList();
	}

}