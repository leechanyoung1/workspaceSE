--insert
insert into address values(address_no_SEQ.nextval,'김경호','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'김경유','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'김경미','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'김경양','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'김경가','123-4567','경기도 성남시');

--update(pk update)
update address set name='김변경',phone='8999-8989',address='서울시 강남구'where no=1;



--delete(pk delete)
--select(pk select)
--select(all select)
select no,name,phone,address from address;

