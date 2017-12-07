package com.lym.ssm.mapper;

import com.lym.ssm.domain.Admin;

import java.util.List;

/**
 * Created by dllo on 17/12/2.
 */
public interface AdminMapper {

    List<Admin> findAll(Admin admin);

}
