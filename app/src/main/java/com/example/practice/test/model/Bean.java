package com.example.practice.test.model;

import java.util.List;

public class Bean {

    /**
     * code : 200
     * pagination : {}
     * data : {"users":[{"account":"szxw5","organFullName":"深州 榆科分理处","organId":1788937187,"organShortName":"深州市支行榆科分理处","positions":[{"positionId":51240599814144,"positionName":"网点负责人"},{"positionId":51306320363520,"positionName":"运营主管"}],"updateTime":"2018-05-10 18:41:49","userId":5802064609280,"userName":"姜涛"},{"account":"szxw2","organFullName":"深州 榆科分理处","organId":1788937187,"organShortName":"深州市支行榆科分理处","positions":[{"positionId":51240599814144,"positionName":"网点负责人"}],"updateTime":"2018-05-10 18:32:48","userId":3512175951872,"userName":"王安之"},{"account":"szxw3","organFullName":"深州 榆科分理处","organId":1788937187,"organShortName":"深州市支行榆科分理处","positions":[{"positionId":51306320363520,"positionName":"运营主管"}],"updateTime":"2018-05-10 18:34:07","userId":3872315670528,"userName":"李巧巧"},{"account":"szxw1","organFullName":"深州 榆科分理处","organId":1788937187,"organShortName":"深州市支行榆科分理处","positions":[{"positionId":51240599814144,"positionName":"网点负责人"}],"updateTime":"2018-05-10 18:38:17","userId":4550324912128,"userName":"李国富"},{"account":"szxw4","organFullName":"深州 榆科分理处","organId":1788937187,"organShortName":"深州市支行榆科分理处","positions":[{"positionId":51306320363520,"positionName":"运营主管"}],"updateTime":"2018-05-10 18:40:44","userId":5416188641280,"userName":"刘强"},{"account":"szxw6","organFullName":"深州 榆科分理处","organId":1788937187,"organShortName":"深州市支行榆科分理处","positions":[],"updateTime":"2018-05-10 18:43:31","userId":6228142981120,"userName":"李梦筣"}]}
     * message : 获取成功
     * version :
     */

    private String code;
    private PaginationBean pagination;
    private DataBean data;
    private String message;
    private String version;

    public String getCode() { return code;}

    public void setCode(String code) { this.code = code;}

    public PaginationBean getPagination() { return pagination;}

    public void setPagination(PaginationBean pagination) { this.pagination = pagination;}

    public DataBean getData() { return data;}

    public void setData(DataBean data) { this.data = data;}

    public String getMessage() { return message;}

    public void setMessage(String message) { this.message = message;}

    public String getVersion() { return version;}

    public void setVersion(String version) { this.version = version;}

    public static class PaginationBean { }

    public static class DataBean {

        private List<UsersBean> users;

        public List<UsersBean> getUsers() { return users;}

        public void setUsers(List<UsersBean> users) { this.users = users;}

        public static class UsersBean {

            /**
             * account : szxw5
             * organFullName : 深州 榆科分理处
             * organId : 1788937187
             * organShortName : 深州市支行榆科分理处
             * positions : [{"positionId":51240599814144,"positionName":"网点负责人"},{"positionId":51306320363520,"positionName":"运营主管"}]
             * updateTime : 2018-05-10 18:41:49
             * userId : 5802064609280
             * userName : 姜涛
             */

            private String account;
            private String organFullName;
            private int organId;
            private String organShortName;
            private String updateTime;
            private long userId;
            private String userName;
            private List<PositionsBean> positions;

            public String getAccount() { return account;}

            public void setAccount(String account) { this.account = account;}

            public String getOrganFullName() { return organFullName;}

            public void setOrganFullName(String organFullName) { this.organFullName = organFullName;}

            public int getOrganId() { return organId;}

            public void setOrganId(int organId) { this.organId = organId;}

            public String getOrganShortName() { return organShortName;}

            public void setOrganShortName(String organShortName) { this.organShortName = organShortName;}

            public String getUpdateTime() { return updateTime;}

            public void setUpdateTime(String updateTime) { this.updateTime = updateTime;}

            public long getUserId() { return userId;}

            public void setUserId(long userId) { this.userId = userId;}

            public String getUserName() { return userName;}

            public void setUserName(String userName) { this.userName = userName;}

            public List<PositionsBean> getPositions() { return positions;}

            public void setPositions(List<PositionsBean> positions) { this.positions = positions;}

            public static class PositionsBean {

                /**
                 * positionId : 51240599814144
                 * positionName : 网点负责人
                 */

                private long positionId;
                private String positionName;

                public long getPositionId() { return positionId;}

                public void setPositionId(long positionId) { this.positionId = positionId;}

                public String getPositionName() { return positionName;}

                public void setPositionName(String positionName) { this.positionName = positionName;}
            }
        }
    }
}
