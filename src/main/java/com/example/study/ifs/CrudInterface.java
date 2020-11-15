package com.example.study.ifs;

import com.example.study.model.network.Header;

public interface CrudInterface<Req, Res> { //4가지는 반드시 작성을 해야함을 정의

    Header<Res> create(Header<Req> request);

    Header<Res> read(Long id);

    Header<Res> update(Header<Req> request);

    Header delete(Long id);
}
