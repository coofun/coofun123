package com.coofun.app.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Table(value = "t_app_tracking")
@Getter
@Setter
public class AppTracking {
    private String id;
    private String visitId;
    private String appId;
    private String appName;
    private String appVersion;
    private String env;
    private String deviceType;
    private String deviceModel;
    private String deviceVersion;
    private String networkType;
    private String ip;
    private String thirdPartyId;
    private String bundleId;
    private String userId;
    private String eventName;
    private String eventTime;
    private String enterPage;
    private int status;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;
}
