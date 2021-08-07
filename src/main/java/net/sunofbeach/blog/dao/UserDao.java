package net.sunofbeach.blog.dao;

import net.sunofbeach.blog.pojo.SobUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<SobUser,String>, JpaSpecificationExecutor<SobUser> {
}
