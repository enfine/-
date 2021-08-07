package net.sunofbeach.blog.dao;

import net.sunofbeach.blog.pojo.Labels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.awt.*;

public interface LabelDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {

}
