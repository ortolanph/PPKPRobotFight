package org.portolan.ppkp.robot.fight.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Table(name = "USER_INFO")
public class UserInfo {

    @Id
    @GeneratedValue
    private long id;
    private String ip;
    private String country;
    private Date lastAccess;
    private int accessCount;
    private String path;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public int getAccessCount() {
        return accessCount;
    }

    public void setAccessCount(int accessCount) {
        this.accessCount = accessCount;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return new StringBuilder("UserInfo{")
                .append("id=").append(id)
                .append(", ip='").append(ip).append('\'')
                .append(", country='").append(country).append('\'')
                .append(", lastAccess=").append(lastAccess)
                .append(", accessCount=").append(accessCount)
                .append(", path='").append(path).append('\'')
                .append('}')
                .toString();
    }
}
