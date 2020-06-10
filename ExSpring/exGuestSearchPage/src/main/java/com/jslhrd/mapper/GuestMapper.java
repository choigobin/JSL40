package com.jslhrd.mapper;

import java.util.List;

import com.jslhrd.domain.GuestVO;
import com.jslhrd.domain.PageVO;

public interface GuestMapper {
	// 전체 게시물 카운트
	public int guestCount();
	
	// 특정 게시물 카운트
	public int guestSearchCount(PageVO vo);
	
	// 페이지 게시물 목록 검색
	public List<GuestVO> guestList(PageVO vo);
	
	// 페이지 게시물 특정 목록 검색
	public List<GuestVO> guestListSearch(PageVO vo);
	
	// 특정 게시물 검색
	public GuestVO guestSelect(int idx);
	
	// 특정 게시물 조회수 증가
	public void guestHits(int idx);
	
	// 게시물 등록
	public int guestWrite(GuestVO vo);
	
	// 게시물 수정
	public int guestModify(GuestVO vo);
	
	// 게시물 삭제
	public int guestDelete(int idx);
}
