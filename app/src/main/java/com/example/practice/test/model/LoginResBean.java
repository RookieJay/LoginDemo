package com.example.practice.test.model;

import java.util.List;

public class LoginResBean {

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

        private String expires;
        private UserBean user;
        private String token;
        private List<?> reforms;
        private List<TasksBean> tasks;

        public String getExpires() { return expires;}

        public void setExpires(String expires) { this.expires = expires;}

        public UserBean getUser() { return user;}

        public void setUser(UserBean user) { this.user = user;}

        public String getToken() { return token;}

        public void setToken(String token) { this.token = token;}

        public List<?> getReforms() { return reforms;}

        public void setReforms(List<?> reforms) { this.reforms = reforms;}

        public List<TasksBean> getTasks() { return tasks;}

        public void setTasks(List<TasksBean> tasks) { this.tasks = tasks;}

        public static class UserBean {

            /**
             * organFullName : 石家庄 西城支行营业室
             * organShortName : 石西城支行营业室
             * organId : 1788937575
             * updateTime : 2018-05-16 12:03:15
             * positions : []
             * userName : 石西城安全员
             * userId : 311961615073280
             * account : sjzwd006
             */

            private String organFullName;
            private String organShortName;
            private int organId;
            private String updateTime;
            private String userName;
            private long userId;
            private String account;
            private List<?> positions;

            public String getOrganFullName() { return organFullName;}

            public void setOrganFullName(String organFullName) { this.organFullName = organFullName;}

            public String getOrganShortName() { return organShortName;}

            public void setOrganShortName(String organShortName) { this.organShortName = organShortName;}

            public int getOrganId() { return organId;}

            public void setOrganId(int organId) { this.organId = organId;}

            public String getUpdateTime() { return updateTime;}

            public void setUpdateTime(String updateTime) { this.updateTime = updateTime;}

            public String getUserName() { return userName;}

            public void setUserName(String userName) { this.userName = userName;}

            public long getUserId() { return userId;}

            public void setUserId(long userId) { this.userId = userId;}

            public String getAccount() { return account;}

            public void setAccount(String account) { this.account = account;}

            public List<?> getPositions() { return positions;}

            public void setPositions(List<?> positions) { this.positions = positions;}
        }

        public static class TasksBean {


            private int checkOrganId;
            private String checkOrganName;
            private String execCycle;
            private int execOrganId;
            private String execOrganName;
            private long execPostId;
            private String execPostName;
            private String execStatus;
            private String execTimeEnd;
            private String execTimeStart;
            private String execUserName;
            private String hasInsp;
            private int planId;
            private String realExecTimeEnd;
            private String realExecTimeStart;
            private long taskId;
            private String taskName;
            private String taskType;
            private String updateTime;
            private List<CheckItemBean> checkItem;
            private List<?> execUser;

            public int getCheckOrganId() { return checkOrganId;}

            public void setCheckOrganId(int checkOrganId) { this.checkOrganId = checkOrganId;}

            public String getCheckOrganName() { return checkOrganName;}

            public void setCheckOrganName(String checkOrganName) { this.checkOrganName = checkOrganName;}

            public String getExecCycle() { return execCycle;}

            public void setExecCycle(String execCycle) { this.execCycle = execCycle;}

            public int getExecOrganId() { return execOrganId;}

            public void setExecOrganId(int execOrganId) { this.execOrganId = execOrganId;}

            public String getExecOrganName() { return execOrganName;}

            public void setExecOrganName(String execOrganName) { this.execOrganName = execOrganName;}

            public long getExecPostId() { return execPostId;}

            public void setExecPostId(long execPostId) { this.execPostId = execPostId;}

            public String getExecPostName() { return execPostName;}

            public void setExecPostName(String execPostName) { this.execPostName = execPostName;}

            public String getExecStatus() { return execStatus;}

            public void setExecStatus(String execStatus) { this.execStatus = execStatus;}

            public String getExecTimeEnd() { return execTimeEnd;}

            public void setExecTimeEnd(String execTimeEnd) { this.execTimeEnd = execTimeEnd;}

            public String getExecTimeStart() { return execTimeStart;}

            public void setExecTimeStart(String execTimeStart) { this.execTimeStart = execTimeStart;}

            public String getExecUserName() { return execUserName;}

            public void setExecUserName(String execUserName) { this.execUserName = execUserName;}

            public String getHasInsp() { return hasInsp;}

            public void setHasInsp(String hasInsp) { this.hasInsp = hasInsp;}

            public int getPlanId() { return planId;}

            public void setPlanId(int planId) { this.planId = planId;}

            public String getRealExecTimeEnd() { return realExecTimeEnd;}

            public void setRealExecTimeEnd(String realExecTimeEnd) { this.realExecTimeEnd = realExecTimeEnd;}

            public String getRealExecTimeStart() { return realExecTimeStart;}

            public void setRealExecTimeStart(String realExecTimeStart) { this.realExecTimeStart = realExecTimeStart;}

            public long getTaskId() { return taskId;}

            public void setTaskId(long taskId) { this.taskId = taskId;}

            public String getTaskName() { return taskName;}

            public void setTaskName(String taskName) { this.taskName = taskName;}

            public String getTaskType() { return taskType;}

            public void setTaskType(String taskType) { this.taskType = taskType;}

            public String getUpdateTime() { return updateTime;}

            public void setUpdateTime(String updateTime) { this.updateTime = updateTime;}

            public List<CheckItemBean> getCheckItem() { return checkItem;}

            public void setCheckItem(List<CheckItemBean> checkItem) { this.checkItem = checkItem;}

            public List<?> getExecUser() { return execUser;}

            public void setExecUser(List<?> execUser) { this.execUser = execUser;}

            public static class CheckItemBean {

                /**
                 * bookItemCategory : 门前区域
                 * checkItemDesc : 运钞车到达前，清理运钞车停靠位及周边车辆、物品、无关人员，确保环境安全




                 * checkItemId : 1800778358
                 * checkItemName : 运钞车到达前保安履职情况
                 * checkItemNumb : 5
                 * keyPoints : [{"bookCategory":"人防","checkMethod":"1010","checkResult":{},"dataTypeItem":[{"dataItemFmt":"12","dataItemId":1800776010,"dataItemName":"1","dataItemNumb":"1","dataItemPar":"1","dataItemValue":"1"},{"dataItemFmt":"","dataItemId":1800776011,"dataItemName":"正常","dataItemNumb":"001","dataItemPar":"","dataItemValue":"0"},{"dataItemFmt":"","dataItemId":1800776012,"dataItemName":"异常","dataItemNumb":"002","dataItemPar":"","dataItemValue":"1"}],"dataTypeObj":{"nValid":"2","dataTypeName":"是否正常","dataType":"01","dataTypeId":1800776007},"inspAreaId":961682549506048,"inspAreaName":"门前","inspPointId":650220060803072,"inspPointNumb":"35F82296","inspPoints":[{"inspAreaName":"门前","inspPointId":650220060803072,"inspPointNumb":"35F82296","organCode":"1788937576","organId":1788937575}],"keyPointId":1800781120,"keyPointName":"门前款车停靠区周边闲杂车辆及时清理","keyPointNumb":"1","organCode":"1788937576","organId":1788937575},{"bookCategory":"人防","checkMethod":"1010","checkResult":{},"dataTypeItem":[{"dataItemFmt":"12","dataItemId":1800776010,"dataItemName":"1","dataItemNumb":"1","dataItemPar":"1","dataItemValue":"1"},{"dataItemFmt":"","dataItemId":1800776011,"dataItemName":"正常","dataItemNumb":"001","dataItemPar":"","dataItemValue":"0"},{"dataItemFmt":"","dataItemId":1800776012,"dataItemName":"异常","dataItemNumb":"002","dataItemPar":"","dataItemValue":"1"}],"dataTypeObj":{"nValid":"2","dataTypeName":"是否正常","dataType":"01","dataTypeId":1800776007},"inspAreaId":961682549506048,"inspAreaName":"门前","inspPointId":650220060803072,"inspPointNumb":"35F82296","inspPoints":[{"inspAreaName":"门前","inspPointId":650220060803072,"inspPointNumb":"35F82296","organCode":"1788937576","organId":1788937575}],"keyPointId":1800781121,"keyPointName":"门前款车停靠区周边无用物品清理","keyPointNumb":"2","organCode":"1788937576","organId":1788937575},{"bookCategory":"人防","checkMethod":"1010","checkResult":{},"dataTypeItem":[{"dataItemFmt":"12","dataItemId":1800776010,"dataItemName":"1","dataItemNumb":"1","dataItemPar":"1","dataItemValue":"1"},{"dataItemFmt":"","dataItemId":1800776011,"dataItemName":"正常","dataItemNumb":"001","dataItemPar":"","dataItemValue":"0"},{"dataItemFmt":"","dataItemId":1800776012,"dataItemName":"异常","dataItemNumb":"002","dataItemPar":"","dataItemValue":"1"}],"dataTypeObj":{"nValid":"2","dataTypeName":"是否正常","dataType":"01","dataTypeId":1800776007},"inspAreaId":961753114476544,"inspAreaName":"设备间","inspPointId":-1,"inspPointNumb":"","inspPoints":[],"keyPointId":1800781122,"keyPointName":"款车停放区周边人员清场","keyPointNumb":"3","organCode":"","organId":-1},{"bookCategory":"人防","checkMethod":"1010","checkResult":{},"dataTypeItem":[{"dataItemFmt":"12","dataItemId":1800776010,"dataItemName":"1","dataItemNumb":"1","dataItemPar":"1","dataItemValue":"1"},{"dataItemFmt":"","dataItemId":1800776011,"dataItemName":"正常","dataItemNumb":"001","dataItemPar":"","dataItemValue":"0"},{"dataItemFmt":"","dataItemId":1800776012,"dataItemName":"异常","dataItemNumb":"002","dataItemPar":"","dataItemValue":"1"}],"dataTypeObj":{"nValid":"2","dataTypeName":"是否正常","dataType":"01","dataTypeId":1800776007},"inspAreaId":961753114476544,"inspAreaName":"设备间","inspPointId":-1,"inspPointNumb":"","inspPoints":[],"keyPointId":1800781123,"keyPointName":"着装规范","keyPointNumb":"4","organCode":"","organId":-1}]
                 * taskId : 451657678716928
                 */

                private String bookItemCategory;
                private String checkItemDesc;
                private int checkItemId;
                private String checkItemName;
                private String checkItemNumb;
                private long taskId;
                private List<KeyPointsBean> keyPoints;

                public String getBookItemCategory() { return bookItemCategory;}

                public void setBookItemCategory(String bookItemCategory) { this.bookItemCategory = bookItemCategory;}

                public String getCheckItemDesc() { return checkItemDesc;}

                public void setCheckItemDesc(String checkItemDesc) { this.checkItemDesc = checkItemDesc;}

                public int getCheckItemId() { return checkItemId;}

                public void setCheckItemId(int checkItemId) { this.checkItemId = checkItemId;}

                public String getCheckItemName() { return checkItemName;}

                public void setCheckItemName(String checkItemName) { this.checkItemName = checkItemName;}

                public String getCheckItemNumb() { return checkItemNumb;}

                public void setCheckItemNumb(String checkItemNumb) { this.checkItemNumb = checkItemNumb;}

                public long getTaskId() { return taskId;}

                public void setTaskId(long taskId) { this.taskId = taskId;}

                public List<KeyPointsBean> getKeyPoints() { return keyPoints;}

                public void setKeyPoints(List<KeyPointsBean> keyPoints) { this.keyPoints = keyPoints;}

                public static class KeyPointsBean {

                    /**
                     * bookCategory : 人防
                     * checkMethod : 1010
                     * checkResult : {}
                     * dataTypeItem : [{"dataItemFmt":"12","dataItemId":1800776010,"dataItemName":"1","dataItemNumb":"1","dataItemPar":"1","dataItemValue":"1"},{"dataItemFmt":"","dataItemId":1800776011,"dataItemName":"正常","dataItemNumb":"001","dataItemPar":"","dataItemValue":"0"},{"dataItemFmt":"","dataItemId":1800776012,"dataItemName":"异常","dataItemNumb":"002","dataItemPar":"","dataItemValue":"1"}]
                     * dataTypeObj : {"nValid":"2","dataTypeName":"是否正常","dataType":"01","dataTypeId":1800776007}
                     * inspAreaId : 961682549506048
                     * inspAreaName : 门前
                     * inspPointId : 650220060803072
                     * inspPointNumb : 35F82296
                     * inspPoints : [{"inspAreaName":"门前","inspPointId":650220060803072,"inspPointNumb":"35F82296","organCode":"1788937576","organId":1788937575}]
                     * keyPointId : 1800781120
                     * keyPointName : 门前款车停靠区周边闲杂车辆及时清理
                     * keyPointNumb : 1
                     * organCode : 1788937576
                     * organId : 1788937575
                     */

                    private String bookCategory;
                    private String checkMethod;
                    private CheckResultBean checkResult;
                    private DataTypeObjBean dataTypeObj;
                    private long inspAreaId;
                    private String inspAreaName;
                    private long inspPointId;
                    private String inspPointNumb;
                    private int keyPointId;
                    private String keyPointName;
                    private String keyPointNumb;
                    private String organCode;
                    private int organId;
                    private List<DataTypeItemBean> dataTypeItem;
                    private List<InspPointsBean> inspPoints;

                    public String getBookCategory() { return bookCategory;}

                    public void setBookCategory(String bookCategory) { this.bookCategory = bookCategory;}

                    public String getCheckMethod() { return checkMethod;}

                    public void setCheckMethod(String checkMethod) { this.checkMethod = checkMethod;}

                    public CheckResultBean getCheckResult() { return checkResult;}

                    public void setCheckResult(CheckResultBean checkResult) { this.checkResult = checkResult;}

                    public DataTypeObjBean getDataTypeObj() { return dataTypeObj;}

                    public void setDataTypeObj(DataTypeObjBean dataTypeObj) { this.dataTypeObj = dataTypeObj;}

                    public long getInspAreaId() { return inspAreaId;}

                    public void setInspAreaId(long inspAreaId) { this.inspAreaId = inspAreaId;}

                    public String getInspAreaName() { return inspAreaName;}

                    public void setInspAreaName(String inspAreaName) { this.inspAreaName = inspAreaName;}

                    public long getInspPointId() { return inspPointId;}

                    public void setInspPointId(long inspPointId) { this.inspPointId = inspPointId;}

                    public String getInspPointNumb() { return inspPointNumb;}

                    public void setInspPointNumb(String inspPointNumb) { this.inspPointNumb = inspPointNumb;}

                    public int getKeyPointId() { return keyPointId;}

                    public void setKeyPointId(int keyPointId) { this.keyPointId = keyPointId;}

                    public String getKeyPointName() { return keyPointName;}

                    public void setKeyPointName(String keyPointName) { this.keyPointName = keyPointName;}

                    public String getKeyPointNumb() { return keyPointNumb;}

                    public void setKeyPointNumb(String keyPointNumb) { this.keyPointNumb = keyPointNumb;}

                    public String getOrganCode() { return organCode;}

                    public void setOrganCode(String organCode) { this.organCode = organCode;}

                    public int getOrganId() { return organId;}

                    public void setOrganId(int organId) { this.organId = organId;}

                    public List<DataTypeItemBean> getDataTypeItem() { return dataTypeItem;}

                    public void setDataTypeItem(
                            List<DataTypeItemBean> dataTypeItem) { this.dataTypeItem = dataTypeItem;}

                    public List<InspPointsBean> getInspPoints() { return inspPoints;}

                    public void setInspPoints(List<InspPointsBean> inspPoints) { this.inspPoints = inspPoints;}

                    public static class CheckResultBean { }

                    public static class DataTypeObjBean {

                        /**
                         * nValid : 2
                         * dataTypeName : 是否正常
                         * dataType : 01
                         * dataTypeId : 1800776007
                         */

                        private String nValid;
                        private String dataTypeName;
                        private String dataType;
                        private int dataTypeId;

                        public String getNValid() { return nValid;}

                        public void setNValid(String nValid) { this.nValid = nValid;}

                        public String getDataTypeName() { return dataTypeName;}

                        public void setDataTypeName(String dataTypeName) { this.dataTypeName = dataTypeName;}

                        public String getDataType() { return dataType;}

                        public void setDataType(String dataType) { this.dataType = dataType;}

                        public int getDataTypeId() { return dataTypeId;}

                        public void setDataTypeId(int dataTypeId) { this.dataTypeId = dataTypeId;}
                    }

                    public static class DataTypeItemBean {

                        /**
                         * dataItemFmt : 12
                         * dataItemId : 1800776010
                         * dataItemName : 1
                         * dataItemNumb : 1
                         * dataItemPar : 1
                         * dataItemValue : 1
                         */

                        private String dataItemFmt;
                        private int dataItemId;
                        private String dataItemName;
                        private String dataItemNumb;
                        private String dataItemPar;
                        private String dataItemValue;

                        public String getDataItemFmt() { return dataItemFmt;}

                        public void setDataItemFmt(String dataItemFmt) { this.dataItemFmt = dataItemFmt;}

                        public int getDataItemId() { return dataItemId;}

                        public void setDataItemId(int dataItemId) { this.dataItemId = dataItemId;}

                        public String getDataItemName() { return dataItemName;}

                        public void setDataItemName(String dataItemName) { this.dataItemName = dataItemName;}

                        public String getDataItemNumb() { return dataItemNumb;}

                        public void setDataItemNumb(String dataItemNumb) { this.dataItemNumb = dataItemNumb;}

                        public String getDataItemPar() { return dataItemPar;}

                        public void setDataItemPar(String dataItemPar) { this.dataItemPar = dataItemPar;}

                        public String getDataItemValue() { return dataItemValue;}

                        public void setDataItemValue(String dataItemValue) { this.dataItemValue = dataItemValue;}
                    }

                    public static class InspPointsBean {

                        /**
                         * inspAreaName : 门前
                         * inspPointId : 650220060803072
                         * inspPointNumb : 35F82296
                         * organCode : 1788937576
                         * organId : 1788937575
                         */

                        private String inspAreaName;
                        private long inspPointId;
                        private String inspPointNumb;
                        private String organCode;
                        private int organId;

                        public String getInspAreaName() { return inspAreaName;}

                        public void setInspAreaName(String inspAreaName) { this.inspAreaName = inspAreaName;}

                        public long getInspPointId() { return inspPointId;}

                        public void setInspPointId(long inspPointId) { this.inspPointId = inspPointId;}

                        public String getInspPointNumb() { return inspPointNumb;}

                        public void setInspPointNumb(String inspPointNumb) { this.inspPointNumb = inspPointNumb;}

                        public String getOrganCode() { return organCode;}

                        public void setOrganCode(String organCode) { this.organCode = organCode;}

                        public int getOrganId() { return organId;}

                        public void setOrganId(int organId) { this.organId = organId;}
                    }
                }
            }
        }
    }
}
