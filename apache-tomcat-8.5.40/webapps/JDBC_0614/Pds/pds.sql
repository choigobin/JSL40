CREATE TABLE pds (
  num number NOT NULL ,					-- �Խñ۹�ȣ �ڵ�����
  name varchar2(20) NOT NULL ,			-- �ۼ���
  pass varchar2(20) NOT NULL ,			-- ���
  email varchar2(100) NOT NULL ,		-- �̸��� 
  subject varchar2(100) NOT NULL,		-- ����
  contents varchar2(2000) NOT NULL,		-- ����
  indate date default sysdate ,			-- �������
  readcnt number default 0 ,			-- ��ȸ��
  filename varchar2(255) null,			-- ÷�����ϸ�
  PRIMARY KEY  (num)
);
create sequence pds_seq_num;