package org.portolan.ppkp.robot.fight.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER_INFO")
public class UserInfo {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "ip", length = 50)
    private String ip;

    @Column(name = "country", length = 100)
    private String country;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_access")
    private Date lastAccess;

    @Column(name = "access_count")
    private int accessCount;

    @Column(name = "path", length = 255)
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
