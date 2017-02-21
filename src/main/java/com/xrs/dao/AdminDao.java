package com.xrs.dao;

import com.xrs.models.Admin;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rajan on 31/1/17.
 */
@Repository
@Transactional
public class AdminDao {

    @Autowired
    private
    IAdminDao adminDao;

    public String autheticate(Admin admin) {
        Admin fetched = adminDao.findOne(admin.getId());
        if(fetched!=null) {
            if (BCrypt.checkpw(admin.getPassword(), fetched.getPassword()))
                return fetched.getAdminType();
            else
                return "NA";
        }
        else
            return "NA";
    }

    public void addAdmin(Admin admin) {
        String hashed=BCrypt.hashpw(admin.getPassword(),BCrypt.gensalt());
        admin.setPassword(hashed);
        adminDao.save(admin);
    }

    void clearAll(){
        adminDao.deleteAll();
    }
}
